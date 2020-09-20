import java.util.Scanner;

public class DictionaryManagement {

    Dictionary dictionary = new Dictionary();

    public void insertFromCommandline() {

        Scanner scanner = new Scanner(System.in);
        // doc so luong tu vung va du lieu tu vung.
        int sotu = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < sotu; i++) {
            String eng = scanner.nextLine();
            String vie = scanner.nextLine();
            dictionary.data.add(new Word(eng, vie));
        }
    }
}
