import java.util.function.Function;

public class Functions {

    public void showExample() {
        System.out.println("I am called from function");
    }

    public int showExample(int a) {
        System.out.println("I am called from function a = " + a);
        return a;
    }

    public double showExample(float a) {
        System.out.println("I am called from function a = " + a);
        return a;
    }

    public double showExample(float a, int b) {
        System.out.println("I am called from function a = " + a+b);
        return a;
    }

    public static void main(String[] args) {
        Functions obj1 = new Functions();
        obj1.showExample();
        int a = obj1.showExample(6);
        double d = obj1.showExample(6.7F);
        System.out.println(a + d);

    }
}
