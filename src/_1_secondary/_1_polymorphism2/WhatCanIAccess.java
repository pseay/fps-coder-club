package _1_secondary._1_polymorphism2;

import _1_secondary._0_polymorphism.PublicPrivateAndProtected;

public class WhatCanIAccess {
    public static void main(String[] args) {
        PublicPrivateAndProtected publicPrivateAndProtected = new PublicPrivateAndProtected();
        int pub = publicPrivateAndProtected.pub;//thats it
    }
}

class Sub extends PublicPrivateAndProtected {
    Sub() {
        int a = super.prot;
        int b = super.pub;
    }
}
