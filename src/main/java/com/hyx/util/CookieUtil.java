package com.hyx.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class CookieUtil {
    /**
     *
     * @param response 响应返回Cookie
     * @param name   名称
     * @param value   值
     * @param maxAge  生存时间
     */
    public static void setCookie(HttpServletResponse response,String name,String value,int maxAge){
        Cookie cookie = new Cookie(name,null);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        try{
            //URLEncoder指定传输中文的编码，防止乱码
            cookie.setValue(URLEncoder.encode(value,"utf-8"));
        }
        catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        response.addCookie(cookie);
    }

    /**
     *
     * @param cookies
     * @param name
     * @return
     */
    public static Cookie getCookie(Cookie[] cookies,String name){
        if(cookies == null){
            //客户端没有携带cookie
            return null;
        }else{
            //客户端携带了cookie
            for(Cookie cookie:cookies){
                if(name.equals(cookie.getName())){
                    return cookie;
                }
            }
            return null;
        }
    }
}
