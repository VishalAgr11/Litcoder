/*
 String Analysis
You are given a string that represents an email address: "My e-mail: eMail_Address321@anymail.com". Your task is to analyze the composition of the characters in the string and determine the percentage of uppercase letters, lowercase letters, digits, and other characters such as symbols (#$., etc).

To accomplish this, you need to break down the string and calculate the percentage for each category. The results are as follows:

Uppercase letters: 7.5%
Lowercase letters: 65%
Digits: 7.5%
Other characters (symbols): 20%

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input :

Support1@litwork.in

Output :

5.263%
78.947%
5.263%
10.526%

Exercise-2

Input:

Client.1234@litwork.in

Output:

4.545%
63.636%
18.182%
13.636%
 */

import java.util.*;
public class StringAnalysis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email=in.next();
        analyze(email);
        in.close();
    }
    
    public static void analyze(String email) {
        int tot=email.length();
        int upper=0,lower=0,digit=0,other=0;
        
        for(int i=0;i<tot;i++){
            char ch=email.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else if(Character.isLowerCase(ch)){
                lower++;
            }
            else if(Character.isDigit(ch)){
                digit++;
            }
            else{
                other++;
            }
        }
            
        double upPercent = (upper * 100.0) / tot;
        double lowPercent = (lower * 100.0) / tot;
        double digPercent = (digit * 100.0) / tot;
        double othPercent = (other * 100.0) / tot;
        
        System.out.printf("%.3f%%%n",upPercent);
        System.out.printf("%.3f%%%n",lowPercent);
        System.out.printf("%.3f%%%n",digPercent);
        System.out.printf("%.3f%%%n",othPercent);
    }
}
