import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Challenge-link: https://www.hackerrank.com/challenges/diagonal-difference

public class Diagonalsum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum1,sum2;
        sum1=0;
        sum2=0;
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
         for(int a_i=0; a_i < n; a_i++){
                sum1 += a[a_i][a_i];
        }
        for(int a_i=0,a_j=n-1; a_i < n && a_j > -1; a_i++,a_j--){
                sum2 += a[a_i][a_j];
        }
		
        System.out.println(Math.abs(sum1-sum2));
    }
}
