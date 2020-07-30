import java.util.*;
class Person{
	private String name;
	private String address;
	
	public Person(String name,String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
}

class Employee extends Person{
	private int empid;
	private String dept;
	private int basic;
	
	public Employee(String name,String address,int empid,String dept,int basic){
		super(name,address);
		this.empid = empid;
		this.dept = dept;
		this.basic = basic;
	}
	public int getEmpid(){
		return empid;
	}
	public String getDept(){
		return dept;
	}
	public void setDept(String dept){
		this.dept = dept;
	}
	public void setBasic(int basic){
		this.basic = basic;
	}
	public int getBasic(){
		return basic;
	}
	public float calSalary(){
		float gross_sal = basic + (0.6f * basic) + (0.1f * basic);
		float ded = (0.085f * basic) + (0.08f * basic);
		float net_sal = gross_sal - ded;
		return net_sal;
	}
}

class Faculty extends Employee{
	private String designation;
	private String course;
	public Faculty(String name,String address,int empid,String dept,int basic,String desig,String course){
		super(name,address,empid,dept,basic);
		designation = desig;
		this.course = course;
	}
	public String getDesig(){
		return designation;
	}
	public void setDesig(String desig){
		designation = desig;
	}
	public void setCourse(String course){
		this.course = course;
	}
	public String getCourse(){
		return course;
	}
	public float calSalary(){
		float gross_sal = getBasic() + (0.6f * getBasic()) + (0.1f * getBasic());
		float ded = (0.085f * getBasic()) + (0.08f * getBasic());
		float net_sal = gross_sal - ded;
		return net_sal;
	}
}

interface Student{
    public float getMarks();
    public float calGPA();
}

class TeachingAssistant extends Employee implements Student{
    private String project;
    private String course;
    private float []marks = new float[5];
    public TeachingAssistant(String name,String address,int empid,String dept,int basic,St){

    }
}