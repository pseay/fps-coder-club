package _1_secondary._1_polymorphism2;

import _1_secondary._0_polymorphism._2_PublicPrivateAndProtected;

public class WhatCanIAccess {
    public static void main(String[] args) {
        _2_PublicPrivateAndProtected publicPrivateAndProtected = new _2_PublicPrivateAndProtected();
        int pub = publicPrivateAndProtected.pub;//thats it
    }
}

class Sub extends _2_PublicPrivateAndProtected {
    Sub() {
        int a = super.prot;
        int b = super.pub;
    }
}
