/* Develop a Java application to generate Electricity bill. Create a class with the
following members: Consumer no., consumer name, previous month reading,
current month reading, type of EB connection (i.e domestic or commercial).
Compute the bill amount using the following tariff.
If the type of the EB connection is domestic, calculate the amount to be paid as
follows:
 First 100 units - Rs. 1 per unit
 101-200 units - Rs. 2.50 per unit
 201 -500 units - Rs. 4 per unit
 501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as
follows:
 First 100 units - Rs. 2 per unit
 101-200 units - Rs. 4.50 per unit
 201 -500 units - Rs. 6 per unit
 501 units - Rs. 7 per unit */

import java.util.*;

class EbillData{
	int consumer_number;
	String consumer_name,type;
	double pmr,cmr;
	EbillData(int cnum,String cname,double pmr,double cmr,String type){
		consumer_number=cnum;
		consumer_name=cname;
		this.pmr=pmr;
		this.cmr=cmr;
		this.type=type;
	}
	
	double domestic_bill(double units){
		double bill=0;
		if(units<=100)
			bill = 1 * units;
		else if(units>100 && units<=200)
			bill=100 + (units-100) * 2.5;
		else if(units>200 && units<=500)
			bill=100 + (100*2.5) + (units-200)*4;
		else if(units>500)
			bill=350 + (300*4) + (units-500)*6;
		return bill;
	}
	double commercial_bill(double units){
		double bill=0;
		if(units<=100)
			bill = 2 * units;
		else if(units>100 && units<=200)
			bill=200 + (units-100) * 4.5;
		else if(units>200 && units<=500)
			bill=200 + (100*4.5) + (units-200)*6;
		else if(units>500)
			bill=650 + (300*6) + (units-500)*7;
		return bill;
	}
	
}

class Ex1b_Q3{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int consumer_number;
		String consumer_name,type;
		double pmr,cmr,units,bill=0;
		System.out.print("Enter the Consumer Number: ");
        consumer_number=s.nextInt();
        s.nextLine();
		System.out.print("Enter the Consumer Name: ");
		consumer_name=s.nextLine();
		System.out.print("Enter the Consumer type: ");
		type=s.nextLine();
		System.out.print("Enter the previous month reading: ");
		pmr=s.nextDouble();
		System.out.print("Enter the current month reading: ");
		cmr=s.nextDouble();
		EbillData eb=new EbillData(consumer_number,consumer_name,pmr,cmr,type);
		if(eb.type.equalsIgnoreCase("domestic")){
			units=cmr-pmr;
			bill=eb.domestic_bill(units);
		}
		else if(eb.type.equalsIgnoreCase("commercial")){
			units=cmr-pmr;
			bill=eb.commercial_bill(units);
		}
        System.out.println("Consumer Number: "+eb.consumer_number+"\nConsumer Name: "+eb.consumer_name+"\nComsumer Type: "+eb.type+"\nPMR: "+eb.pmr+"\nCMR: "+eb.cmr+"\nBill: "+bill);
        s.close();
	}
}

/*OUTPUT
Enter the Consumer Number: 256
Enter the Consumer Name: John
Enter the Consumer type: Domestic
Enter the previous month reading: 276
Enter the current month reading: 549
Consumer Number: 256
Consumer Name: John
Comsumer Type: Domestic
PMR: 276.0
CMR: 549.0
Bill: 642.0

Enter the Consumer Number: 8756
Enter the Consumer Name: Peter
Enter the Consumer type: Commercial
Enter the previous month reading: 547
Enter the current month reading: 995
Consumer Number: 8756
Consumer Name: Peter
Comsumer Type: Commercial
PMR: 547.0
CMR: 995.0
Bill: 2138.0
*/ 