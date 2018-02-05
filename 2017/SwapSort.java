import java.util.*;

public class SwapSort {
    String wrd, swapwrd, sortwrd;
    int len;

    SwapSort() {
        wrd = "";
        swapwrd = "";
        sortwrd = "";
        len = 0;
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word in UPPERCASE");
        wrd = sc.next().toUpperCase();
        len = wrd.length();
        sc.close();
    }

    void swapchar() {
        swapwrd = wrd.charAt(len - 1) + wrd.substring(1, len - 1) + wrd.charAt(0);
    }

    void sortword() {
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < len; j++) {
                if ((int) wrd.charAt(j) == i) {
                    sortwrd += wrd.charAt(j) + "";
                }
            }
        }
    }

    void display() {
        System.out.println("Original word = " + wrd + "\nSwapped word = " + swapwrd + "\nSorted word = " + sortwrd);
    }

    public static void main(String[] args) {
        SwapSort obj = new SwapSort();
        obj.readword();
        obj.swapchar();
        obj.sortword();
        obj.display();
    }
}