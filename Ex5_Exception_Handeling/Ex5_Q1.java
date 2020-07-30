/*Aviansh Gupta
185001028
CSE A 
Ex5 
Q1. Create a class named "Person" which consists of name, age, aadharnumber. Create
methods getInput(), display(), canVote(), hasAadhar(). Create and handle the following
Exceptions.
a. For age -> if you give alphabets then throw NumberFormatException
b. For voting -> if age is less than 18 then throw MinorCitizenException
c. For aadhar -> if no valid aadhar then throw NullPointerException */
import java.util.*;
import java.lang.Character;									

class MinorCitizenException extends Exception{		
	String message;
	MinorCitizenException(String message){
		super(message);
		this.message = message;
	}
}

class Person{
	protected String name;
	protected int age;
	private int aadharnumber;
	public void getInput(){		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name: ");
		name = s.nextLine();
		do{
			try{
		
				System.out.print("Enter the age: ");
				String age1 = s.nextLine();
				for(int i=0;i<age1.length();i++){
					if(Character.isLetter(age1.charAt(i)))
						throw new NumberFormatException("For input age: "+age1);
				}
				age = Integer.parseInt(age1);
			}
			catch(NumberFormatException n){
				System.out.println("Number Format Exception: "+n.getMessage());
			}
		}while(age <= 0);
		System.out.print("Enter the aadhar number: ");
		aadharnumber = s.nextInt();
	}
	public void display(){
		System.out.println("-----------------------------------------------");
		System.out.printf("Name: %s\nAge: %d\nAadhar No: %d\n",name,age,aadharnumber);
		System.out.println("-----------------------------------------------");
	}
	public void canVote(){
		try{
			if(age < 18)
				throw new MinorCitizenException("Minor Citizen Exception: You are a minor.");
			else
				System.out.println("You can Vote.");
		}
		catch(MinorCitizenException e){
			System.out.println(e.message);
		}
	}
	
	public void hasAadhar(){
		try{
			if(aadharnumber < 0)
				throw new NullPointerException("Invalid Aadhar Number");
			else
				System.out.println("The person has a valid aadhar number.");
		}
		catch(NullPointerException a){
			System.out.println("Null Pointer Exception: "+a.getMessage());
		}
	}
}

class Ex5_Q1{
	public static void main(String []args){
		Person p = new Person();
		p.getInput();
		p.display();
		p.canVote();
		p.hasAadhar();
	}
}
/*OUTPUT
PS C:\Users\AVIANSH GUPTA\Desktop\programs\java\Ex5> java Ex5_Q1
Enter the name: Danish
Enter the age: 1e
Number Format Exception: For input age: 1e
Enter the age: 17
Enter the aadhar number: 12345
-----------------------------------------------
Name: Danish
Age: 17
Aadhar No: 12345
-----------------------------------------------
Minor Citizen Exception: You are a minor.
The person has a valid aadhar number.
PS C:\Users\AVIANSH GUPTA\Desktop\programs\java\Ex5> java Ex5_Q1
Enter the name: Danish
Enter the age: 19
Enter the aadhar number: -98
-----------------------------------------------
Name: Danish
Age: 19
Aadhar No: -98
-----------------------------------------------
You can Vote.
Null Pointer Exception: Invalid Aadhar Number */