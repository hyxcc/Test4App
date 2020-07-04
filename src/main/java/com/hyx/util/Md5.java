package com.hyx.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5算法
 */
public class Md5 {
    public static String getMd5(String input){
        try{
            //md5转换器，Md5参数可以换成SHA1
            MessageDigest messageDigest = MessageDigest.getInstance("Md5");
            //输入的字符串转换成字节数组
            byte[] inputByteArray = input.getBytes();
            //update方法是使用指定的byte数组更新摘要
            messageDigest.update(inputByteArray);
            //digest方法进行哈希计算。方法执行之后，摘要被重置
            byte[] resultByteArray = messageDigest.digest();
            //调用自定义的byteArrayToHex方法，把字节数组转换字符串返回
            return byteArrayToHex(resultByteArray);
        }
        catch(NoSuchAlgorithmException e){
            return e.getMessage();
        }
    }

    /**
     * 将字节数组转换成16进制的字符串
     * @param byteArray
     * @return
     */
    public static String byteArrayToHex(byte[] byteArray){
        //初始化一个char数组，存放每个16进制的字符
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //new一个数组用来存放组成的字符串（一个字节是8位二进制，等于2位十六进制字符，2的8次方等于16的2次方）
        char[] resultCharArray = new char[byteArray.length*2];
        int index = 0;
        for(byte b:byteArray){
            // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
            resultCharArray[index++] = hexDigits[b>>>4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        //字符数组组合成字符串返回
        return new String(resultCharArray);
    }
}
