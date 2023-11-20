public class MethodExample {

    public int hey(int num1, int num2) {
        return num1 + num2;
    }

    class nej {
        double nr;
        String name;
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        int result = example.hey(10, 20);
        System.out.println("sum = " + result);
    }
}
