import java.io.*;
import java.util.*;

class Sum {
    public static void main(String args[]) throws IOException {
        int count = 0;
        char string;
        String s;
        FileReader fin = new FileReader("input1.txt");
        Scanner fscan = new Scanner(fin);
        Scanner scan = new Scanner(System.in);
        FileWriter fout = new FileWriter("output.txt");
        string = scan.next().charAt(0);
        while (fscan.hasNext() == true) {

            s = fscan.next();

            if (s.indexOf(string) != -1) {
                fout.write(s + "\n");
                break;
            }

        }
        fin.close();
        fout.close();
        // System.out.println(count);

    }
}