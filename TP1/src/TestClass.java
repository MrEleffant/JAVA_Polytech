public class TestClass {
    static private int staticNbrInstance = 0;
    private int nbrInstance = 0;

    TestClass(){ // constructor
        nbrInstance +=1;
        staticNbrInstance +=1;
    }

    public void printNbrInstance() {
        System.out.println("private int " + nbrInstance);
        System.out.println("instance static private " + staticNbrInstance);
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.printNbrInstance();
        TestClass test2 = new TestClass();
        test.printNbrInstance();
    }
}
