public class ArrayDemo {
    public static void main(String[] args) {

        int [] num = new int [5]; //reserveret plads til 5 heltlal.

        num [0] = 3;
        num [1] = 7;
        num [2] = 0;
        num [3] = -3;
        num [4] = 9;

        int [] num2 = {4,2,4,8,9,6,5,5};

        System.out.println(num);
        for (int i = 0; i<num.length; i++)
            System.out.println(num[i]);

        int s = sum(num); //Læs nedenstående. /Sum metode vi kalder fra metoden static metoden nedenunder.
        System.out.println("Sum = " + s);

        for (int i = 0; i<num.length; i++)
            System.out.println(num[i]);

        int s2=sum(num2);
        System.out.println("sum af num 2 =" + s2);
        for (int i = 0; i<num2.length; i++)
            System.out.println(num2[i]);
    }


    static int sum(int[] arr) { //Metode // Vi behøver ikke et objekt for at kalde "sum" fordi det er static.
        int result = 0;
        for (int i =0; i< arr.length; i++)
            result = result+arr[i];
        arr [2] = 1000;
        return result;
    }
}
