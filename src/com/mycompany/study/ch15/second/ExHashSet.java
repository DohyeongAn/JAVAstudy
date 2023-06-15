package com.mycompany.study.ch15.second;

import java.util.HashSet;


public class ExHashSet {
    public static void main(String[] args) {
        
        // Set<String> set = new HashSet<String>();
        HashSet<String> languages = new HashSet<>();

        languages.add("JAVA");
        languages.add("PYTHON");
        languages.add("Node");
        languages.add("C#");
        languages.add("1");
        languages.add("2");
        languages.add("3");
        languages.add("4");
        languages.add("5");
        languages.add("6");
        languages.add("7");
        languages.add("8");
        languages.add("9");
        languages.add("JAVA");
    

        languages.remove("4");
    

        for(String language: languages){
            System.out.println("language: " + language);
        }


        

    }
    
}
