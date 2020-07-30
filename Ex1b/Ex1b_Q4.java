/*Write a java program to create a class named ‘Student’ with name, id, dept, 3 marks
as data members. Write function to assign the inputs, calculate grade, display and
search. Perform these operations for ‘n’ number of students. [Search using id and
dept – use method overloading] */

import java.util.*;

class student{
		String name,dept,grade;
		int id;
		int m1,m2,m3;

	
		void input(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Name: ");
			name = s.nextLine();
			System.out.print("Enter Dept: ");
			dept = s.nextLine();
			System.out.print("Enter ID: ");
			id = s.nextInt();
			System.out.print("Enter marks: ");
			m1 = s.nextInt();
			m2 = s.nextInt();
			m3 = s.nextInt();
			
		}					
		void grades(){
				int avg = (m1+m2+m3)/3;
				if (avg>=90)
					grade = "A";
				else if (avg>=80 && avg<90)
					grade = "B";
				else if (avg>=70 && avg<80)
					grade = "C";
				else if (avg>=60 && avg<70)
					grade = "D";
				else
					grade = "F";
		}
		void display(){
				System.out.println(name+"\t"+dept+"\t"+id+"\t"+m1+" "+m2+" "+m3+"\t"+grade);
		}
}

class Ex1b_Q4{
	public static void main(String argv[]){	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int num= sc.nextInt();
		student std[]=new student[num];
		for(int i=0;i<num;i++)
			std[i] = new student();

		for (int i=0; i<num; i++){
			std[i].input();
		}
		for (int i = 0; i < num; i++) {
			std[i].grades();
		}
		int choice;
		System.out.println("\n1.Display\n2.Search");
		System.out.print("Enter Your choice: ");
		choice = sc.nextInt();
		do{
			switch(choice){
				case 1: System.out.println("Name\tDept\tID\tMarks\t\tGrades");
						for(int i= 0; i<num;i++)
							std[i].display();
						break;
				case 2:	System.out.println("\n1: Search by ID\n2: Search by Department");
						int choice2;
						System.out.print("Enter your choice: ");
						choice2 = sc.nextInt();
						switch(choice2){
							case 1:	int sId;
									System.out.print("Enter the id: ");
									sId = sc.nextInt(); 
									search(sId, num, std);
									break;
							case 2:	String sDept;
									sc.nextLine();
									System.out.print("Enter the dept: ");
									sDept = sc.nextLine();
									search(sDept, num, std);
									break;
						}
			}
			System.out.println("\n1.Display\n2.Search");
			System.out.print("Enter Your choice(To stop enter -1): ");
			choice = sc.nextInt();
		}while(choice != -1);
		sc.close();
	}


	public static void search(int Id, int num,student st[]){
		for (int i=0; i<num; i++){
			if(st[i].id== Id){
				System.out.println("Name\tDept\tID\tMarks\t\tGrade");
				System.out.println(st[i].name+"\t"+ st[i].dept+"\t"+ st[i].id+"\t"+ st[i].m1+" "+ st[i].m2+" "+ st[i].m3+"\t"+st[i].grade);
			}
		}
	}

	public static void search(String dept, int num,student st[]) {
		for (int i = 0; i < num; i++) {
			if (st[i].dept.equalsIgnoreCase(dept)) {
				System.out.println("Name\tDept\tID\tMarks\t\tGrade");
				System.out.println(st[i].name+"\t"+st[i].dept+"\t"+ st[i].id+"\t"+st[i].m1+ " "+st[i].m2+" "+st[i].m3+"\t"+st[i].grade);
			}
		}
	}
}
/*OUTPUT 
Enter the number of students: 5
Enter Name: John
Enter Dept: CSE
Enter ID: 26
Enter marks: 92 90 86
Enter Name: Peter
Enter Dept: ECE
Enter ID: 67
Enter marks: 77 82 81
Enter Name: Marques
Enter Dept: CSE
Enter ID: 55
Enter marks: 95 92 91
Enter Name: Dave
Enter Dept: CIVIL
Enter ID: 23
Enter marks: 88 90 90
Enter Name: Gaurav
Enter Dept: EEE
Enter ID: 54
Enter marks: 87 97 99

1.Display
2.Search
Enter Your choice: 1
Name    Dept    ID      Marks           Grades
John    CSE     26      92 90 86        B
Peter   ECE     67      77 82 81        B
Marques CSE     55      95 92 91        A
Dave    CIVIL   23      88 90 90        B
Gaurav  EEE     54      87 97 99        A

1.Display
2.Search
Enter Your choice(To stop enter -1): 2

1: Search by ID
2: Search by Department
Enter your choice: 1
Enter the id: 67
Name    Dept    ID      Marks           Grade
Peter   ECE     67      77 82 81        B

1.Display
2.Search
Enter Your choice(To stop enter -1): 2

1: Search by ID
2: Search by Department
Enter your choice: 2
Enter the dept: cse
Name    Dept    ID      Marks           Grade
John    CSE     26      92 90 86        B
Name    Dept    ID      Marks           Grade
Marques CSE     55      95 92 91        A

1.Display
2.Search
Enter Your choice(To stop enter -1): -1
*/