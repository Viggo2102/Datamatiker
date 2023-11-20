import java.io.*;
import java.util.ArrayList;

public class WordCount {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        int totalWords = 0;

        try {
            FileReader filereader = new FileReader("WordCount.txt");
            BufferedReader bufferedReader = new BufferedReader(filereader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(" ");

                for (String word : words) {
                    wordList.add(word);
                    totalWords++;
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        int moneyCount = 0;
        String targetWord = "Money";

        for (String word : wordList) {
            if (word.compareToIgnoreCase(targetWord) == 0) {
                moneyCount++;
            }
        }
        System.out.println("Total words = " + totalWords);
        System.out.println("Occurrences of money " + moneyCount);


        }// Try
    }



