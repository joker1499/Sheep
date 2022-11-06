package com.example.sheep.Domain;

import java.util.Random;

public class RandomLetter {
    public static char Letter(){
        Random random = new Random();
        int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写还是小写
        return (char)(choice + random.nextInt(26));
    }
    public static String Number(int i){
        if ( i < 10){
            return "0000000" + i;
        }
        return "000000" + i;
    }
    public static String toBinary(String str){
        //把字符串转成字符数组
        char[] strChar=str.toCharArray();
        String result="";
        for(int i=0;i<strChar.length;i++){
            //toBinaryString(int i)返回变量的二进制表示的字符串
            //toHexString(int i) 八进制
            //toOctalString(int i) 十六进制
            result +=Integer.toBinaryString(strChar[i])+ " ";
        }
        return result;
    }
    public static int GenerateGrowUp(){
        Random random = new Random();
        return random.nextInt(30);
    }

    public static int GenerateGrowSpeed(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
