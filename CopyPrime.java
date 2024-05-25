package p2;

import java.io.*;
import java.util.*;
import p1.*;

class CopyPrime {
    public static void main(String args[]) {
        try {
            int n;
            FileReader fin = new FileReader("input.txt");
            Scanner fscan = new Scanner(fin);
            FileWriter fout = new FileWriter("output.txt");
            while (fscan.hasNextInt() == true) {
                n = fscan.nextInt();
                if (check.prime(n) == 1) {
                    System.out.println("Prime");
                    fout.write(Integer.toString(n) + "\n");
                }
            }
            fscan.close();
            fin.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("Caught Exception:" + e);
        }

    }

}