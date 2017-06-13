// https://code.google.com/codejam/contest/2974486/dashboard

import java.util.Scanner;

class MagicTrick {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1=0, t=0, r2=0, same=0, ans=0;
    int[][] a1 = new int[4][4];
    int[][] a2 = new int[4][4];
    t = sc.nextInt();
    for (int k=0; k<t; k++) {
      same = 0;
      r1 = sc.nextInt();
      for (int i=0; i<4; i++) {
        for (int j=0; j<4; j++) {
          a1[j][i] = sc.nextInt();
        }
      }
      r2 = sc.nextInt();
      for (int i=0; i<4; i++) {
        for (int j=0; j<4; j++) {
          a2[j][i] = sc.nextInt();
        }
      }


      for (int i=0; i<4; i++) {
        for (int j=0; j<4; j++) {
          if (a1[i][r1-1] == a2[j][r2-1]) {
            same++;
            ans = a1[i][r1-1];
          }
        }
      }
      System.out.printf("Case #%d: ", k+1);
      if (same == 0) {
        System.out.println("Volunteer cheated!");
      } else if (same > 1) {
        System.out.println("Bad magician!");
      } else {
        System.out.println(ans);
      }
    }
  }
}
