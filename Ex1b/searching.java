/*Aviansh Gupta
CSE A
185001028

Q1. Write a java program to get ‘n’ elements in an array. Perform the linear and binary
search.*/

import java.util.*;

class functions{
	void sort(int arr[],int size){
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}		
		}
	}
	
	int li_search(int arr[],int size,int data){
		int i=0;
		while(arr[i]!=data){
			i++;
			if(i>size)
				return -1;
		}
		return i;
	}
	
	int bi_search(int arr[],int size,int data){
		int start=0,pos;
		int end=size-1;
		sort(arr,size);
		while(start<=end){
			int mid=(start+end)/2;
			if(arr[mid]==data){
				pos=mid;
				return pos;
			}
			else if(data>arr[mid]){
				start=mid+1;
			}
			else{
				end=mid-1;
			}

		}
		return -1;
	}
}

class searching{
	public static void main(String args[]){
		int []arr=new int[20];
		Scanner s=new Scanner(System.in);
		functions f=new functions();
		System.out.print("Enter the size of array: ");
		int len=s.nextInt();
		System.out.print("Enter the elements: ");
		for(int i=0;i<len;i++)
			arr[i]=s.nextInt();
		System.out.print("Enter the element to be searched: ");
		int data=s.nextInt();
		do{
			System.out.print("Enter the search type\n1: Linear\n2: Binary\n");
			int index=0,choice=s.nextInt();
			switch(choice){
				case 1: index=f.li_search(arr,len,data);
					break;
				case 2: index=f.bi_search(arr,len,data);
						f.sort(arr,len);
						System.out.print("Sorted array: ");
						for(int i=0;i<len;i++)
							System.out.print(arr[i]+" ");
						System.out.println();
					break;
			} 
			if(index==-1)
				System.out.println("Element Not Found!!");
			else
				System.out.println("index of "+data+" is "+index);
			System.out.print("Enter the element to be searched(To STOP enter -999): ");
			data=s.nextInt();
		}while(data!=-999);
		s.close();
	}
}

/*OUTPUT 
cs1028@wtl4:~/Desktop/programs/1b$ java searching 
Enter the size of array: 6
Enter the elements: 6 7 8 4 3 2
Enter the element to be searched: 3
Enter the search type
1: Linear
2: Binary
1
index of 3 is 4
Enter the element to be searched(To STOP enter -999): 8
Enter the search type
1: Linear
2: Binary
2
Sorted array: 2 3 4 6 7 8 
index of 8 is 5
Enter the element to be searched(To STOP enter -999): 10
Enter the search type
1: Linear
2: Binary
1
Element Not Found!!
Enter the element to be searched(To STOP enter -999): -999
*/
