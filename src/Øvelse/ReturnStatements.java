package Øvelse;

public class ReturnStatements {
    public static void main(String[] args) {
        printMessage();
        int sum = add(12,4);
        System.out.println(sum);
        System.out.println();
        int[] hejArray = arrayFromInts(12,5,9);
        System.out.println(hejArray[0]);
        System.out.println(hejArray[1]);
        System.out.println(hejArray[2]);


    }

    public static void printMessage() {
        System.out.println("Fuck du har lækkert garn ven");

    }

    public static int add(int x, int y) {
        return x+y;
    }
    public static int[] arrayFromInts(int a, int b, int c) {
    int [] array = new int[3];
    array [0] = a;
    array[1] = b;
    array[2] = c;
    return array;
    }
}


