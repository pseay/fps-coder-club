package _1_secondary._0_polymorphism;

public class _2_PublicPrivateAndProtected {
    private int priv;//accessed within the class
    int defaultInt;//accessed within the class & package
    protected int prot;//accessed within the class, package & subclasses
    public int pub;//accessed anywhere
}

class InPackage {
    public static void main(String[] args) {
        _2_PublicPrivateAndProtected publicPrivateAndProtected = new _2_PublicPrivateAndProtected();
        int a = publicPrivateAndProtected.defaultInt;
        int b = publicPrivateAndProtected.prot;
        int c = publicPrivateAndProtected.pub;
    }
}
