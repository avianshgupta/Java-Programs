/*Aviansh Gupta
CSE A
185001028
Write a program to find the largest word in a string? */

import java.util.*;

class StringOpr{
    String str;
    void longest_word(String str,int a[]){
        String arr[] = str.split(" ");
        int max=0,ind=0;
        for (int i=0;i<arr.length;i++){
            if (max < arr[i].length()){
                max=arr[i].length();
                ind=i;
            }
        }
        a[0]=max;
        int index=0;
        for (int i=0;i<ind;i++){
            index=index+arr[i].length();
        }
        index=index+ind;
        a[1]=index;
        return;
    }
}

class EX1c_Q1{
    public static void main(String argv[]){
        int arr[] = new int[2];
        StringOpr f = new StringOpr();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        f.str = s.nextLine();
        do{
		    f.longest_word(f.str,arr);
		    System.out.println("Index="+ arr[1]);
		    for (int i=arr[1]; i<arr[1]+arr[0]; i++)
		        System.out.print(f.str.charAt(i));
		    System.out.println();
			System.out.print("Enter the string(To stop enter \"STOP\"): ");
        	f.str = s.nextLine();
        }while(!f.str.equalsIgnoreCase("stop"));
        s.close();
    }    
}

/*OUTPUT
Enter the string: The temperature is 32 degree
Index=4
temperature
Enter the string(To stop enter "STOP"): Java programming is fun
Index=5
programming
Enter the string(To stop enter "STOP"): stop
*/
