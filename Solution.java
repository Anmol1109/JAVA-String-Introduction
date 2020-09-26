import java.io.*;
import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l1 = A.length();
        int l2 = B.length();
        System.out.println(l1+l2);
        if(A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(Character.toUpperCase(A.charAt(0))+A.substring(1,l1)+" "+Character.toUpperCase(B.charAt(0))+B.substring(1,l2));
        /* Enter your code here. Print output to STDOUT. */       
    }
}



