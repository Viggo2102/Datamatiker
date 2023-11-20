import java.io.*;
import java.util.ArrayList;

    public class StudentList {
        public static void main(String[] args) throws IOException {
            FileReader fil = new FileReader("StudentList.txt");
            BufferedReader ind = new BufferedReader(fil);

            ArrayList<Student> list=new ArrayList<Student>();
            String linje = ind.readLine(); //Indlæser en linje fra filen.
            while (linje != null)
            {
                String[] bidder = linje.split(",");
                Student s = new Student();
                s.id = bidder [0].substring(0,8); //Substring her gør at usprintet kommer uden mail, og kun ID'et. Prøv at slette substring og se hvordan det ser ud.
                s.forNavn = bidder [1];
                s.efterNavn = bidder [2];
                list.add(s);
                linje = ind.readLine();
            }
            fil.close();
            list.sort(null); //Sortere lsiten af objektet Dtudents som bi har oprettet. //vi kan ikke sammenligne "students" før vi har deklereret det i vores "class student". Man kan ikke sammenligne objekterne Students. Det kunen vi godt med Strings, fordi Java kan det pr default.
            for (Student s: list){
                System.out.println(s);
            }
            saveList(list);
        } // main

        static void saveList(ArrayList<Student> l) throws IOException {
            FileWriter fil = new FileWriter("StudentListSorted.txt");
            PrintWriter ud = new PrintWriter(fil);
            for (Student s: l){
                ud.println(s);
            }
            fil.close();
        }
    }

    class Student implements Comparable<Student> { //Her siger vi til Java at vi skal have sorteret, det skal se sådan her ud. Vi comparer til vores Arraylist/objekter Student. Vi skal dog stadig bruge vores compareTo metode længere nede.
        String forNavn;
        String efterNavn;
        String id;

        @Override
        public String toString() {
            return id +" " + forNavn+ " " + efterNavn;
        }

        @Override
        public int compareTo(Student o) { //Her sorterer vi efter alfabetisk rækkefølge efter ID.
            return id.compareTo(o.id);
        }
    }

