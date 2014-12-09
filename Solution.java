import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int TotalNumbers = N+1;
        
        // System.out.println(N);
        
        String str = br.readLine();
        String []strArr = str.split(" ");
        
        int Difference = (Integer.parseInt(strArr[N-1]) - 
                          Integer.parseInt(strArr[0]))/N;
        

        for (int k = 0; k < N-1; ++k) {
            if (Integer.parseInt(strArr[k+1]) != 
                Integer.parseInt(strArr[k]) + Difference) {
                System.out.println(Integer.parseInt(strArr[k]) + Difference);
                break;
            }
        }
    }
}
