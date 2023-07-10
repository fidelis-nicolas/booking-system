package com.prove.InnerOuterClass;


class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();                               //class v classi
        OuterClass.InnerClass myInner = myOuter.new InnerClass();            // creazione del oggetto della seconda classe

        System.out.println(myInner.y + myOuter.x);
    }
}

// Outputs 15 (5 + 10)
