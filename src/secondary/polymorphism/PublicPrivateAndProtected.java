package secondary.polymorphism;

public class PublicPrivateAndProtected {
    private int priv;//accessed within the class
    int defaultInt;//accessed within the class & package
    protected int prot;//accessed within the class, package & subclasses
    public int pub;//accessed anywhere
}

class InPackage {
    public static void main(String[] args) {
        PublicPrivateAndProtected publicPrivateAndProtected = new PublicPrivateAndProtected();
        int a = publicPrivateAndProtected.defaultInt;
        int b = publicPrivateAndProtected.prot;
        int c = publicPrivateAndProtected.pub;
    }
}
