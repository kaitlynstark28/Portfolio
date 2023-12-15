package StaticKeyword;

public class MyClass {
    private int variable1;
    private double variable2;
    private String variable3;
    private static int instanceCount = 0;

    public MyClass(int variable1, double variable2, String variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
