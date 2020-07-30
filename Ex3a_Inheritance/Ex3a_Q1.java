/*Aviansh Gupta
CSE A
185001028
Q1 Write a java program with a class named ‘Box’ with following parameters name of the parcel,
length, width and height and a function to calculate volume of box. Inherit a class named
‘BoxWeight’ from ‘Box’ with an additional member weight of the box in grams. Inherit
‘BoxShipment’ from ‘BoxWeight’ with an additional member shipmentcost per kilograms.
Calculate the volume and cost for ‘n’ number of boxes on shipment and display in
consolidated format. (Use Constructors) */

import java.util.*;

class Box{
	String name;
	double len,width,height;
	Box(String name,double len,double width,double height){
		this.name = name;
		this.len = len;
		this.width = width;
		this.height = height;
	}
	double cal_vol(double len,double width,double height){
		return len*width*height;
	}
}

class BoxWeight extends Box{
	double weight;
	BoxWeight(String name,double len,double width,double height,double weight){
		super(name,len,width,height);
		this.weight=weight;
	}
}

class BoxShipment extends BoxWeight{
	double shipcost,cost,vol;
	BoxShipment(String name,double len,double width,double height,double weight,double shipcost){
		super(name,len,width,height,weight);
		this.shipcost=shipcost;
	}
	double total_cost(double shipcost){
		return shipcost*(weight/1000);
	}
}

class Ex2_Q1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num;
		String name;
		double len,width,height,weight,shipcost;
		System.out.print("Enter the number of boxes: ");
		num = s.nextInt();
		BoxShipment []bs = new BoxShipment[num];
		for(int i = 0 ; i < num ; i++){
			s.nextLine();
			System.out.print("\nEnter the name: ");
			name = s.nextLine();
			System.out.print("Enter length, width, height, weight, Cost per Kg: ");
			len = s.nextDouble();
			width = s.nextDouble();
			height = s.nextDouble();
			weight = s.nextDouble();
			shipcost = s.nextDouble();
			bs[i] = new BoxShipment(name,len,width,height,weight,shipcost);
			bs[i].vol = bs[i].cal_vol(len,width,height);
			bs[i].cost = bs[i].total_cost(shipcost); 
		}
		System.out.println("\nName\tLength\tWidth\tHeight\tWeight\tVolume\tCost of Shipment");
		for(int i = 0 ; i < num ; i++){
			System.out.println(bs[i].name+"\t"+bs[i].len+"\t"+bs[i].width+"\t"+bs[i].height+"\t"+bs[i].weight+"\t"+bs[i].vol+"\t"+bs[i].cost);
        }
        s.close();
	}
}
/*OUTPUT
Enter the number of boxes: 3

Enter the name: Box1
Enter length, width, height, weight, Cost per Kg: 13 10 25 2338 500

Enter the name: Box2
Enter length, width, height, weight, Cost per Kg: 25 23 25 6700 250

Enter the name: Box3
Enter length, width, height, weight, Cost per Kg: 10 10 10 5000 100

Name    Length  Width   Height  Weight  Volume  Cost of Shipment
Box1    13.0    10.0    25.0    2338.0  3250.0  1169.0
Box2    25.0    23.0    25.0    6700.0  14375.0 1675.0
Box3    10.0    10.0    10.0    5000.0  1000.0  500.0 */