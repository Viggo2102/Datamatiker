package EksamenOevelserYihaw;

import java.util.ArrayList;

public class Ovelse_11_Article {
    public static void main(String[] args) {
        Article a1 = new Article("jgofg", "dfhfdfgh kfdhgkdfhgk fdhgjkfdhgjkf d hgk jdfhgkjdf hgkdj fhgjkdfhgk jdfghdfk hgjkdfhgkjdf hgkfdh", "dfgfdg");
        System.out.println(a1);
        String longestWord = a1.getLongestWord();
        System.out.println(longestWord);
        ArrayList<String> uniquewrods = a1.getWords();
        System.out.println(uniquewrods);

    }
}

class Article {
    String article;
    String body;
    String author;

    Article(String article, String body, String author) {
        this.article = article;
        this.body = body;
        this.author = author;

    }

    public String toString() {
        return article + " " + body + " " + author;
    }

    public String getLongestWord() {
        String longestWord = "";
        String[] words = body.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public ArrayList<String> getWords() {
        ArrayList<String> result = new ArrayList<>();
        String[] words = body.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!result.contains(words[i])) {
                result.add(words[i]);
            }
        }
        return result;


    }
}
