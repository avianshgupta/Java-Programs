import java.util.*;
class Person{
	private int aadhar;
	private String name;
	private String address;
	private char gender;
	public Person(int aadhar,String name,String address,char gender){
		this.aadhar = aadhar;
		this.name = name;
		this.address = address;
		this.gender=gender;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	} 
	
	public void setAddress(String add){
		address = add;
	}
	
	public char getGender(){
		return gender;
	}
}

class Student extends Person{
	private String program;
	private int year;
	private float totalmark;
	
	public Student(int aadhar,String name,String address,char gender,String program,int year,float total){
		super(aadhar,name,address,gender);
		this.program = program;
		this.year = year;
		totalmark = total;
	}
	
	public String getProgram(){
		return program;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setYear(int year){
		this.year = year;
	}
	
	public float getTotal(){
		return totalmark;
	}
	
	public void setTotal(float total){
		totalmark = total;
	}
	public float calGPA(){
		return (getTotal() / 50);
	}
}

class Faculty extends Person{
	private String designation;
	private String department;
	private float basicpay;
	
	public Faculty(int aadhar,String name,String address,char gender,String designation,String dept,float pay){
		super(aadhar,name,address,gender);
		this.designation = designation;
		department = dept;
		basicpay = pay;
	}
	
	public String getDesig(){
		return designation;
	}
	
	public void setDesig(String desig){
		designation = desig;
	}
	public String getDept(){
		return department;
	}
	public void setBasic(float basic){
		basicpay = basic;
	}
	
	public float getBasic(){
		return basicpay;
	}
	
	public float calSalary(){
		float gross_sal = basicpay + (0.6f * basicpay) + (0.1f * basicpay);
		float ded = (0.085f * basicpay) + (0.08f * basicpay);
		float net_sal = gross_sal - ded;
		return net_sal;
	}
}
class TestInheritance
{
	public static void main(String[]ar)
	{
		Scanner sc=new Scanner(System.in);
		
		int adhno,ch,year,ch1,ch2;
		float tot,basic;
		String name,addr,pro,des,dept;
		char gen;
		Student s=null;
		Faculty f=null;
		
		System.out.println("Enter data for\n1.Student\n2.Faculty");
		System.out.print("Enter your choice: ");
		ch=sc.nextInt();
		
		System.out.print("Enter Aadhar Number: ");
		adhno=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the Name: ");
		name=sc.nextLine();
		System.out.print("Enter Address: ");
		addr=sc.nextLine();
		System.out.print("Enter the Gender: ");
		gen=sc.next().charAt(0);
		
		if(ch==1){
			System.out.print("Enter the program: ");
			sc.nextLine();
			pro=sc.nextLine();
			System.out.print("Enter year: ");
			year=sc.nextInt();
			System.out.print("Enter total marks: ");
			tot=sc.nextFloat();
			s=new Student(adhno,name,addr,gen,pro,year,tot);
		}
		else if(ch==2){
			System.out.print("Enter the designation: ");
			sc.nextLine();
			des=sc.nextLine();
			System.out.print("Enter the deartment: ");
			sc.nextLine();
			dept=sc.nextLine();
			System.out.print("Enter the basic pay: ");
			basic=sc.nextFloat();
			f=new Faculty(adhno,name,addr,gen,des,dept,basic);
		}
		do{
			System.out.println("\nOPTIONS\n1.Edit record\n2.Display record\n3.Exit");
			System.out.print("Enter your choice: ");
			ch1=sc.nextInt();
			if(ch1==1){
				switch(ch){
			
					case 1: System.out.println("1.Address\n2.Year\n3.Total");
							System.out.print("Enter your choice: ");
							ch2=sc.nextInt();
							if(ch2==1){
								System.out.print("Enter the new address: ");
								sc.nextLine();
								s.setAddress(sc.nextLine());
							}
							else if(ch2==2){
								System.out.print("Enter Year: ");
								s.setYear(sc.nextInt());
							}
							else if(ch2==3){
								System.out.print("Enter Total Marks: ");
								s.setTotal(sc.nextFloat());
							}
							break;
					case 2: System.out.println("1.Address\n2.Designation\n3.Basic Pay");
							System.out.print("Enter your choice: ");
							ch2=sc.nextInt();
							if(ch2==1){
								System.out.print("Enter the new address: ");
								sc.nextLine();
								f.setAddress(sc.nextLine());
							}
							else if(ch2==2){
								System.out.print("Enter Designation: ");
								sc.nextLine();
								f.setDesig(sc.nextLine());
							}
							else if(ch2==3){
								System.out.print("Enter the new basic pay: ");
								f.setBasic(sc.nextFloat());
							}
							break;
					default : System.err.println("Choose either 1 or 2");
							  break;
			}
		
			}
			if(ch1==2){
				System.out.println("------------------------------------------------------------------");
				switch(ch){
					case 1: System.out.printf("Name:%s\nGender:%c\nAddress:%s\n",s.getName(),s.getGender(),s.getAddress());
							System.out.printf("Program:%s\nYear:%d\nTotal:%.2f\nGPA:%.2f\n",s.getProgram(),s.getYear(),s.getTotal(),s.calGPA());
							break;
					case 2: System.out.printf("Name:%s\nGender:%c\nAddress:%s\n",f.getName(),f.getGender(),f.getAddress());
							System.out.printf("Designation:%s\nDepartment:%s\nBasic Pay:%.2f\nSalary:%.2f\n",f.getDesig(),f.getDept(),f.getBasic(),f.calSalary());
							break;
				 	default : System.err.println("Choose either 1 or 2");
				 			  break;
				}
				System.out.println("------------------------------------------------------------------");
			}
		}while(ch1!=3);
		sc.close();
	}
}