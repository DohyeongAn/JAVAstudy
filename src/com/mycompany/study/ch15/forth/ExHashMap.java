package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;
public class ExHashMap {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>(); // standard
        Map<String, String> map2 = new HashMap<>(); // standard

        HashMap<String, Integer> hashMap = new HashMap<>(); //not bad

        map.put("안도형", 100);
        map.put("김도형", 90);
        map.put("이도형", 80);
        map.put("최도형", 70);

        System.out.println("map.get(\"안도형\"): " + map.get("안도형"));

        for(String strKey: map.keySet()){
            Integer strValue = map.get(strKey);
            System.out.println(strKey + ": " + strValue);
        }

    }
}
