package com.mycompany.study.ch15.first.tr;

import java.util.ArrayList;

public class ExMember {

    public static void main(String[] args) {


        ArrayList<Member> arrayList = new ArrayList<Member>();

                            // String name, String id, String password, int phoneNumber, String email
    Member member0 = new Member("안도형", "dohyung", "a1234",1012345678, "dodo@naver.com");
    
    arrayList.add(member0);

    Member member1 = new Member("안도형", "dohyung", "a1234", 1012345678, "dodo@naver.com");
    
    arrayList.add(member1);

    Member member2 = new Member("안도형", "dohyung", "a1234", 1012345678, "dodo@naver.com");
    
    arrayList.add(member2);
    

        for(Member membera: arrayList){
            System.out.println("member.name: " + membera.name);
            System.out.println("member.id: " + membera.id);
            System.out.println("member.password: " + membera.password);
            System.out.println("member.phoneNumber: " + membera.phoneNumber);
            System.out.println("member.email: " + membera.email);
            System.out.println("==================================");
        }
  
    
    }
    
}
