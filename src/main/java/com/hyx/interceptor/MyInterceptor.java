package com.hyx.interceptor;

import com.hyx.pojo.User;
import com.hyx.service.UserService;
import com.hyx.util.CookieUtil;
import com.hyx.util.DESUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MyInterceptor implements HandlerInterceptor {
    private Logger logger = LoggerFactory.getLogger(MyInterceptor.class);
    @Resource
    private UserService userService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //对请求中带/u,并且token为空的直接返回到登录页面,返回false
        //对请求中带/u,但是token中有用户信息的，直接跳过登录页面,返回true
        //对其他不带有/u的直接放行，返回true
        String url = request.getRequestURI();
        logger.info("当前请求的路径为：{}",url);
        if(url.contains("jnshuTest4/u/")){
            Cookie cookie = CookieUtil.getCookie(request.getCookies(),"token");
            if(cookie != null){
                String value = URLDecoder.decode(cookie.getValue(),"utf-8");
                String token = DESUtil.desDecrypt(value,"12345678");
                logger.info("token解密的值为{}",token);
                int id = Integer.parseInt(token.split(",")[0]);
                User user = new User();
                user.setId(id);
                User user1 = userService.findOne(user);
                request.setAttribute("user",user);
                logger.info("将用户{}放入session中",user);
                return true;
            }
            else {
                response.sendRedirect(request.getContextPath()+"/user/loginpage");
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
