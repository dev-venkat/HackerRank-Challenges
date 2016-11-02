import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plusminus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
		float countn,countp,countz,k;
		countn=countp=countz=0;
        
        for(int arr_i=0; arr_i <n; arr_i++){
            
            if(arr[arr_i]==0) countz++;
            else {k=(arr[arr_i] > 0)?countp++:countn++;}
            
        }
		
		System.out.println(countp/n);
		System.out.println(countn/n);
		System.out.println(countz/n);
    }
}
