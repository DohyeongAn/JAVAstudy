package com.mycompany.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage{
    public static void main(String[] args){
     
     
        ArrayList<Language> arrayList = new ArrayList<Language>();

        for(Language language: arrayList){
            System.out.println("language.name: " + language.name);
            System.out.println("language.version: " + language.version);
        }


        // arrayList.add("JAVA"); // Language 객체를 넣어 주어어야 되어서 오류
        // arrayList.add("11"); // Language 객체를 넣어 주어어야 되어서 오류

        Language language = new Language("JAVA", 11);

        arrayList.add(language);

        for(Language language2: arrayList){
            System.out.println("language2.name: " + language2.name);
            System.out.println("language2.version: " + language2.version);
            System.out.println("==================================");
        }           

         

        // List<String> list = new ArrayList<String>();//generic
       
        // ArrayList<String> arrayList = new ArrayList<String>();//generic
        
        // list.add("JAVA");
        // list.add("PYTHON");
        // list.add("Node");
        // list.add(2,"C#");

        
//         int i = 0;
//                 for(String a: list){
//                     // string a = list[i];
//                     System.out.println(i + ": " + a);
//                     i++;
//         }
//         System.out.println("==================================");

//         list.remove(2);
//         list.remove("PYTHON");

//         int j = 0;
//         for(String a: list){
//             // string a = list[i];
//             System.out.println(j + ": " + a);
//             j++;
// }


          // for(int i=0; i<list.size(); i++){
        //     System.out.println("list.get("+i+"): " + list.get(i));
        // }
        // System.out.println("==================================");
        // System.out.println("==================================");
      
      
        // ArrayList<String> arrayList2 = new ArrayList<String>();
        
        // arrayList.add("JAVA");
        // arrayList.add("PYTHON");
        // arrayList.add("Node");
        // arrayList.add(2,"C#");

        // for(int i=0; i<list.size(); i++){
        //     System.out.println("arrayList.get("+i+"): " + arrayList.get(i));
        // }
        // System.out.println("==================================");
        //         for(String a: arrayList){
        //             // string a = arrayList[i];
        //             System.out.println("a: " + a);
        // }

    }
}
