package Polymorphism2;

import Polymorphism.PublicPrivateAndProtected;

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
