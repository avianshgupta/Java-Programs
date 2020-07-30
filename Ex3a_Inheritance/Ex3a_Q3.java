/*Write a java program with a class named ‘Person’ which consists of name, age, DOB and
address. Have functions to get input and calculate_performance. Derive a class named
‘Student’ from ‘Person’ class with additional members like department, marks, extracurricular. 
Calculate performance of Student (Outstanding, Excellent, Good, Fair) based on the grade and 
extra-curricular activities. Derive a class named ‘Professor’ from ‘Person’ with
additional members like department, number of publications and funded projects. Calculate
performance of Professor based on the number of publications and funded projects. In main
get ‘n’ number of Person’s information and calculate the performance. */

import java.util.*;

class Person{
    int age;
    int []dob = new int[3];
    String name,address;
    Person(String name,int []dob,int age,String address){
        this.name = name;
        for(int i=0;i<3;i++)
            this.dob[i] = dob[i];
        this.address = address;
        this.age = age;
    }
    void calculatePerformance(){}
}

class Student extends Person{
    String dept;
    int cultural;
    int []marks = new int[3];
    Student(String name,int []dob,int age,String address,String dept,int cultural,int []marks){
        super(name,dob,age,address);
        this.dept = dept;
        for(int i=0;i<3;i++)
            this.marks[i] = marks[i];
        this.cultural = cultural;
    }

    void calculatePerformance(){
        int avg = (marks[0] + marks[1] + marks[2])/3;
        if((avg>90) || (avg>80 && cultural>0))
            System.out.println("Outstanding");
        else if((avg>80) || (avg>70 && cultural>0))
            System.out.println("Excellent");
        else if((avg>70) || (avg>60 && cultural>0))
            System.out.println("Good");
        else
            System.out.println("Fair");
    }
}

class Professor extends Person{
    String dept;
    int publications;
    int projects;
    Professor(String name,int []dob,int age,String address,String dept,int publications,int projects){
        super(name,dob,age,address);
        this.dept = dept;
        this.publications = publications;
        this.projects = projects;
    }
    void calculatePerformance(){
        int sum = publications + projects;
        if(sum>15)
            System.out.println("Outstanding");
        else if(sum>10)
            System.out.println("Excellent");
        else if(sum>5)
            System.out.println("Good");
        else
            System.out.println("Fair");
    }
}

class Ex3a_Q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        int []dob = new int[3];
        String name,address;
        System.out.println("CHOICE\n1: Student\n2: Professor");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        do{
            sc.nextLine();
            System.out.print("\nEnter the name: ");
            name = sc.nextLine();
            System.out.print("Enter the DOB: ");
            for(int i=0;i<3;i++)
                dob[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the address: ");
            address = sc.nextLine();
            System.out.print("Enter the age: ");
            age = sc.nextInt();
            switch(choice){
                case 1: sc.nextLine();
                        System.out.print("Enter the department: ");
                        String dept = sc.nextLine();
                        System.out.print("Enter the marks: ");
                        int []marks = new int[3];
                        for(int i=0;i<3;i++)
                            marks[i] = sc.nextInt();
                        System.out.print("Enter the number of cultural activities: ");
                        int cultural = sc.nextInt();
                        Student s = new Student(name,dob,age,address,dept,cultural,marks);
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.printf("Name: %s\nAge: %d\nAddress: %s\nDepartment: %s\n",s.name,s.age,s.address,s.dept);
                        System.out.print("Performance: ");
                        s.calculatePerformance();
                        System.out.println("------------------------------------------------------------------------------");
                        break;
                case 2: sc.nextLine();
                        System.out.print("Enter the department: ");
                        String department = sc.nextLine();
                        System.out.print("Enter the number of publications: ");
                        int publications = sc.nextInt();
                        System.out.print("Enter the number of projects: ");
                        int projects = sc.nextInt();
                        Professor p = new Professor(name, dob, age, address, department, publications, projects);
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.printf("Name: %s\nAge: %d\nAddress: %s\nDepartment: %s\n",p.name,p.age,p.address,p.dept);
                        System.out.print("Performance: ");
                        p.calculatePerformance();
                        System.out.println("------------------------------------------------------------------------------");
                        break;
            }
            System.out.println("CHOICE\n1: Student\n2: Professor");
            System.out.print("Enter your choice(To stop enter -1): ");
            choice = sc.nextInt();
        }while(choice != -1);
    }
}

/*OUTPUT
CHOICE
1: Student
2: Professor
Enter your choice: 1

Enter the name: John
Enter the DOB: 09 12 2000
Enter the address: SSN college, Kalavakkam
Enter the age: 18
Enter the department: CSE
Enter the marks: 89 85 90
Enter the number of cultural activities: 0
------------------------------------------------------------------------------
Name: John
Age: 18
Address: SSN college, Kalavakkam
Department: CSE
Performance: Excellent
------------------------------------------------------------------------------
CHOICE
1: Student
2: Professor
Enter your choice(To stop enter -1): 2

Enter the name: Dr. J Sharma
Enter the DOB: 12 12 1976
Enter the address: Kelambakkam, Tamil Nadu
Enter the age: 42
Enter the department: ECE
Enter the number of publications: 5
Enter the number of projects: 11
------------------------------------------------------------------------------
Name: Dr. J Sharma
Age: 42
Address: Kelambakkam, Tamil Nadu
Department: ECE
Performance: Outstanding
------------------------------------------------------------------------------
CHOICE
1: Student
2: Professor
Enter your choice(To stop enter -1): -1
 */