import java.util.*;
import java.io.*;

class Cypher {
    public static void main(String args[]) {
        try {
            String n;
            char c;
            int i;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter file name:");
            n = scan.nextLine();
            FileReader fin = new FileReader("input.txt");
            FileWriter fout = new FileWriter(n);
            while ((i = fin.read()) != -1) {
                c = (char) i;
                System.out.println(c);
                fout.write(i + 3);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println("Caught Exception" + e);
        } catch (IOException e) {
            System.out.println("Caught Exception" + e);
        }
    }
}