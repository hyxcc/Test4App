package com.hyx.util;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

public class DESUtil {
    //默认字符集
    private static final String CHARSET = "utf-8";
    
    public static byte[] des(int mode,byte[] data,byte[] keyData){
        byte[] ret = null;
        if(data != null && keyData != null && keyData.length==8){
            try{
                // 获取Cipher对象，设置加密算法
                //使用Cipher进行加密，解密处理，需要创建实例对象并初始化。采用工厂模式创建对象
                Cipher cipher = Cipher.getInstance("DES");
                //生成key对象
                //DES加密算法使用DESKeySpec类，构造方法参数需要为8个字节的密码，也就是传入的keydata
                DESKeySpec desKeySpec = new DESKeySpec(keyData);
                //转换成key对象
                SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
                SecretKey key = keyFactory.generateSecret(desKeySpec);
                //设置Cipher模式，解密或者加密
                cipher.init(mode,key);
                //返回加密结果，参数为加密内容
                ret = cipher.doFinal(data);
            }catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }catch (NoSuchPaddingException e) {
                e.printStackTrace();
            }catch (IllegalBlockSizeException e) {
                e.printStackTrace();
            }catch (BadPaddingException e) {
                e.printStackTrace();
            }catch (InvalidKeySpecException e) {
                e.printStackTrace();
            }catch (InvalidKeyException e) {
                e.printStackTrace();
            }

        }
        return ret;
    }
    //DES 加密
    public static String desEncrypt(String data,String keydata){
       if (keydata == null || keydata.length() < 8) {
            throw new RuntimeException("加密失败，key不能小于8位");
        }
        if(data == null){return null;}
        try {
            //将传入的字符串类型加密数据和使用的Key转换为byte数组
            byte[] dataByte = data.getBytes(CHARSET);
            byte[] keyByte = keydata.getBytes(CHARSET);
            //返回的结果
            byte[] dataResult = des(Cipher.ENCRYPT_MODE,dataByte,keyByte);
            //new String返回字符串
            //Base64用于传输8Bit字节码
            return new String(Base64.getMimeEncoder().encode(dataResult));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return data;
        }

    }
    //DES 解密
    public static String desDecrypt(String data,String keydata){
        if (keydata == null || keydata.length() < 8) {
            throw new RuntimeException("解密失败，key不能小于8位");
        }
        if(data == null){return null;};
        try {
            byte[] dataByte = data.getBytes(CHARSET);
            byte[] keyByte = keydata.getBytes(CHARSET);
            byte[] dataResult = des(Cipher.DECRYPT_MODE,Base64.getMimeDecoder().decode(dataByte),keyByte);
            return new String(dataResult,CHARSET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return data;
        }
    }
}
