package com.target.treinamento.orientacaoobjeto.dominio;

public class TestCloneObject {
  
    public void testIface() {
        CloneClass x1 = new CloneClass();
        CloneClass x2;
        x1.a = 15;
        x1.b = 35.05;
        x2 = x1.getClone(); // clone x1
        System.out.println(" x1: " + x1.a + " " + x1.b);
        System.out.println(" x2: " + x2.a + " " + x2.b);
    }
  
    public static void main(String args[]) {
        TestCloneObject testCloneObject = new TestCloneObject();
        // test via protected
        testCloneObject.testIface();
    } 
  
}
