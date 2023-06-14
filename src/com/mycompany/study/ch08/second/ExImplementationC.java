package com.mycompany.study.ch08.second;

public class ExImplementationC {
    public static void main(String[] args) {
        InterfaceA interfaceA = new ImplementationC();
        InterfaceB interfaceB = new ImplementationC();
        InterfaceC interfaceC = new ImplementationC();

        interfaceA.methodA();
        interfaceB.methodB();
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();

    }

}
