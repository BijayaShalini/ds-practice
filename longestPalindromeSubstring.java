//brute force method

import java.util.*;

public class longestPalindromeSubstring
{
    public static boolean isPalindrome(String s){

        int len= s.length();
        int start=0;
        int end=len-1;
        while(start<=end){
            
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static String substr(String s){

        int n=s.length();
        int max=0;
        String str = " ";
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                String temp = s.substring(i, j+1);
                if(isPalindrome(temp)){
                    if(max<temp.length()){
                        max=temp.length();
                        str= temp;
                    }
                }
            }
        }
        return str;
    }
    
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        /*if(isPalindrome(string))
            System.out.println("palindrome");
        else
            System.out.println("not a plaindrome");
        */
        System.out.print(substr(s));
    }
}
