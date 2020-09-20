import java.util.Scanner;

public class DictionaryCommandline {

    DictionaryManagement wiki =new DictionaryManagement();

    public void showAllWords() {
        System.out.println("No\t|English\t\t|Vietnamese");
        int size = wiki.dictionary.data.size();
        for (int i = 0; i < size ;i++) {
            System.out.println((i + 1) + "\t" + wiki.dictionary.data.get(i).word_target + "\t\t" + wiki.dictionary.data.get(i).word_explain);
        }
    }

    public void dictionaryBasic() {
        wiki.insertFromCommandline();
        this.showAllWords();
    }

    public static void main(String[] args) {
        DictionaryCommandline rundata = new DictionaryCommandline();
        rundata.dictionaryBasic();
    }

}
