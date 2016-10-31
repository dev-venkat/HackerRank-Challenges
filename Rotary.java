import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rotary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
		int[] m = new int[q];
        for(int a0 = 0; a0 < q; a0++){
            m[a0] = in.nextInt();
        }
        
        int[] a1= new int[n];
		
        for(int i=0; i < k ; i++){
            
				for(int j=1; j < n; j++){
					a1[j]=a[j-1];
					a[j-1]=a1[j-1];
				}a1[0] = a[n-1];
				a[0] = a1[0];
				a[n-1]=a1[n-1];
			}
			
			
    //    System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		
		for(int i=0; i < q; i++){
			System.out.println(a1[m[i]]);
		}
        
        
    }
}
