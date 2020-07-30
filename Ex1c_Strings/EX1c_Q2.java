/*Q2. Write a java program to check whether a given string is a palindrome or not?*/

import java.util.*;

class function{
	boolean check_palindrome(String str){
		String []arr=str.split("");
		for(int i=0;i<str.length()/2;i++)
			if(!arr[i].equalsIgnoreCase(arr[str.length()-i-1]))
				return false;
		return true;
	}
}

class EX1c_Q2{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		function f=new function();
		String str;
		System.out.print("Enter a string: ");
		str=s.nextLine();
		do{
			boolean flag=f.check_palindrome(str);
			if(flag==true)
				System.out.println(str+" is a palindrome");
			else
				System.out.println(str+" is not a palindrome");
			System.out.print("Enter a string(To stop enter \"STOP\"): ");
			str=s.nextLine();
		}while(!str.equalsIgnoreCase("stop"));
		s.close();
	}
}

/*OUTPUT
cs1028@wtl4:~/Desktop/programs/1c$ java EX1c_Q2
Enter a string: RaCeCaR
RaCeCaR is a palindrome
Enter a string(To stop enter "STOP"): NuN
NuN is a palindrome
Enter a string(To stop enter "STOP"): computer
computer is not a palindrome
Enter a string(To stop enter "STOP"): Tenet
Tenet is a palindrome
Enter a string(To stop enter "STOP"): stop
*/
