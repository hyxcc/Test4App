package com.hyx.util;

import freemarker.template.utility.StringUtil;
import org.apache.commons.lang.StringUtils;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTag extends TagSupport {
    //默认日期格式
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    //long型的时间戳
    private String value;
    //日期格式，如果不传入则为默认
    private String format;

    //set方法赋值
    public void setValue(String value) {
        this.value = value;
    }
    public void setFormat(String format) {
        this.format = format;
    }

    //重写doStartTag方法
    @Override
    public int doStartTag() throws JspException {
        long l =0L;
        //isNotBlank 判断某字符串 是否不为空且 长度不为0 且不由空白符(whitespace)构成
        //isNotEmpty 判断某字符串是否非空
        if(StringUtils.isNotBlank(value)){
            l =Long.parseLong(value);
        }
        if (StringUtils.isNotBlank(format)){
            format = DEFAULT_FORMAT;
        }
        //调用用于转换的getFormatData方法，并返回
        String targetTime = "";
        if(l > 0L){
            targetTime = getFormatData(l,format);
        }
        try {
            super.pageContext.getOut().write(targetTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doStartTag();
    }

    /**
     * long类型数据转换为时间格式字符串
     * @param l
     * @param format
     * @return
     */
    public static String getFormatData(long l,String format){
        Date d = new Date(l);
        String date = new SimpleDateFormat(format).format(d);
        return date;
    }
}
