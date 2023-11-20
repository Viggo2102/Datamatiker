package EksamenOevelserYihaw;

public class Ovelse_10_BMI {
    public static void main(String[] args) {
    BMI bm1 = new BMI(1.8, 120);
        System.out.println(bm1);
        System.out.println(bm1.calculateBMI());
        System.out.println(bm1.isUnderWeight());
        bm1.isOverWeight();
        bm1.isNormalWeight();
    }
}

class BMI {
    double height;
    double weight;

    BMI(double height, double weight) {
    this.height = height;
    this.weight = weight;
    }

    public String toString() {
        return height + " " + weight;
    }

    public double calculateBMI() {
         return weight/(height*height);
    }

    public boolean isUnderWeight() {
        if (calculateBMI() < 18.5) {
            System.out.println("Du er undervægtig g");
            return true;
        } else
            return false;
    }


    public boolean isOverWeight() {
        if (calculateBMI()>25) {
            System.out.println("Du er overvægtig min dreng, tab dig lidt");
            return true;
        } else System.out.println("Du er ikke overvægtig");
            return false;
    }

    public boolean isNormalWeight() {
        if (calculateBMI()>18.5 && calculateBMI()<25) {
            System.out.println("Du er normalvægtig g");
            return true;
        } else
            return  false;

    }
}
