package com.hyx.controller;

import com.hyx.dto.Result;
import com.hyx.pojo.User;
import com.hyx.service.UserService;
import com.hyx.util.CookieUtil;
import com.hyx.util.DESUtil;
import com.hyx.util.Md5;
import org.springframework.aop.scope.ScopedObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录页面URL
     * @return
     */
    @RequestMapping("/loginpage")
    public String doLogin(){
        return "login";
    }

    /**
     * 登录页面
     * @param user  用户对象参数
     * @param map   用来返回用户对象
     * @param response
     * @param request
     * @return  登录成功重定向到登录成功页面，登录失败返回登录页面
     */
    @RequestMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public String dologin(User user,Map<String,Object> map, HttpServletResponse response, HttpServletRequest request){
            String pwd = user.getPwd();
            System.out.println("登录时的密码："+ pwd);
            String md5String = Md5.getMd5(pwd);
            System.out.println("Md5加密后的密码："+md5String);
            User user1 = userService.findOne(user);
            //token生成并进行DES加密
            String token = DESUtil.desEncrypt(user1.getId()+","+ new Date().getTime(),"12345678");
            //放入cookie中返回
            CookieUtil.setCookie(response,"token",token,60*60*24);
            //判断加盐后密码是否一致
            if(user1.getPwd().equals(md5String)){
                map.put("user",user1);
                return "success";
            }
            return "login";
    }

    /**
     * 注册页面的URL
     * @return 跳转到注册页面
     */
    @RequestMapping("/registpage")
    public String doregist(){
        return "regist";
    }

    /**
     * 注册页面
     * @param user 注册的用户对象
     * @return 跳转到登录页面
     */
    @RequestMapping("/regist")
    public String doregist(User user){
        String pwd = user.getPwd();
        System.out.println("注册时的密码："+ pwd);
        String md5String = Md5.getMd5(pwd);
        System.out.println("Md5加密后的密码："+md5String);
        user.setPwd(md5String);
        int num = userService.insert(user);
        return "login";
    }
}
