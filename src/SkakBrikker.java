public class SkakBrikker {
        public static void main(String[] args) {
            Brik b1=new Bonde(Brik.Farve.hvid, 4,2);
            System.out.println(b1);
            System.out.println("Flyt til "+ b1.kanFlytteTil(4,3));

            Brik b2=new Taarn(Brik.Farve.sort, 3,3);
            System.out.println(b2);
            System.out.println("Flyt til "+ b2.kanFlytteTil(4,3));
        }
    }

    abstract class Brik {
        enum Farve {sort, hvid};
        Farve farve;
        int x,y;

        Brik(Farve farve, int x, int y){
            this.farve=farve;
            this.x=x;
            this.y=y;
        }

        abstract boolean kanFlytteTil(int xNy, int yNy);

        public String toString() {
            return farve+" ("+x+","+y+")";
        }
    } // class Brik

    class Bonde extends Brik {
        Bonde(Farve farve, int x, int y){
            super(farve, x, y);
        }

        boolean kanFlytteTil(int xNy, int yNy){
            if (x<1 || 8<x || y<1 || 8<y) return false;     // Check at x,y er inden for brættet
            if (x!=xNy) return false;                       // Bonder kan ikke flytte til siden
            if (farve==Farve.hvid) {
                if (y==2&&yNy==4) return true;              // To frem fra 2. række
                if (yNy==y+1) return true;                  // ellers kun én frem
            } else {
                if (y==7&&yNy==5) return true;              // Modsat for sort
                if (yNy==y-1) return true;
            }
            return false;
        }

        public String toString() {
            return "Bonde "+super.toString();
        }
    } // class Bonde

    class Taarn extends Brik {
        Taarn(Farve farve, int x, int y){
            super(farve, x, y);
        }

        boolean kanFlytteTil(int xNy, int yNy){
            if (x<1 || 8<x || y<1 || 8<y) return false;     // Check at x,y er inden for brættet
            if (x==xNy && y==yNy) return false;             // Kan ikke flytte til samme felt
            if (x==xNy) return true;                        // Flytning i samme kolonne OK
            if (y==yNy) return true;                        // Flytning i samme række OK
            return false;
        }

        public String toString() {
            return "Tårn "+super.toString();
        }
    } // class Taarn
