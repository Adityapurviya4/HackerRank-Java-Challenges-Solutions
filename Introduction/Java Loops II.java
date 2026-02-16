/* *
* Author: Aditya Purviya
* URL: https://github.com/Adityapurviya4
* */

import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
    Scanner sc =new Scanner(System.in);
    int q = sc.nextInt();
    
    for(int i=0;i<q;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        int pow=1;
        for(int j =0;j<n;j++){
            a +=pow*b;
            System.out.print(a +" ");
            pow *=2;
        }System.out.println();
    }
    }
}
