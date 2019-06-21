package com.atguigu.crud.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestSdd {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String next = sc.next();
        char[] chars = next.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int n=1;
        int sum;
        for(char c:chars){
            if(map.containsKey(c)){
                sum=++n;
                map.put(c,sum);
            }else{
			n=1;
                map.put(c,n);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry<Character, Integer> entry:entries){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("字母"+key+"出现的次数为"+value);
        }

    }

}
