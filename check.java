package p1;

public class check {
  public static int prime(int n) {
    int i, flag = 0, count = 0;
    for (i = 2; i < n; i++) {
      if (n % i == 0) {
        count++;
      }

    }
    if (count == 0) {
      flag = 1;
    }
    return flag;
  }
}