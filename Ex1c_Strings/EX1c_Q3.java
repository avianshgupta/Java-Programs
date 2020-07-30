/*Q2. Write a java program to check whether a given string is a pangram or not?*/

import java.util.*;
class strCheck{
    String str;
    boolean checkpan(String str){
        String strLower = str.toLowerCase();
        int []alpha = new int[26];
        int len = str.length();
        for (int i=0; i<len; i++){
           char ch = strLower.charAt(i);
           //ch=(int)ch;
           if (ch>=97 && ch<=122)
           alpha[ch-97]++; 
        }
        for (int i=0; i<26; i++){
            if (alpha[i]==0)
                return false;
        }
        return true;
    }
}

class EX1c_Q3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        strCheck f = new strCheck();
        System.out.print("Enter the string: ");
		f.str = s.nextLine();
        do{
		    if(f.checkpan(f.str)== true)
		        System.out.println("The given string is a pangram.");
		    else
		        System.out.println("The given string is not a pangram.");
		    System.out.print("Enter the string(To stop enter \"STOP\"): ");
		    f.str = s.nextLine();
        }while(!f.str.equalsIgnoreCase("stop"));
        s.close();
    } 
}
/*OUTPUT
Enter the string: The quick brown fox jumps over the lazy dog
The given string is a pangram.
Enter the string: Its a nice sunny day.
The given string is not a pangram.
Enter the string: Mr. Jock, TV quiz PhD., bags few lynx.
The given string is a pangram.
Enter the string: GQ's oft lucky whiz Dr. J, ex-NBA MVP - Steve Galen
The given string is a pangram.
Enter the string: This is not a pangram.
The given string is not a pangram.
Enter the string: stop
*/