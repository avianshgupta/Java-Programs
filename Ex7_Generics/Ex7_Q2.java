import java.util.*;

class GenericMax{
	<T extends Comparable> T findMax(T []arr,int []out){
		T max = arr[0];
		int i;
		for(i = 1;i < arr.length;i++){
			if(max.compareTo(arr[i])<0){
				out[0] = i;
				max = arr[i];
			}
		}
		return max;
	}
}

class TestGenaricMax{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		GenericMax gm = new GenericMax();
		int choice,num;
		int []out = new int[1];
		System.out.println("DATA TYPES\n1: String\n2: Integer\n3: Float");
		System.out.print("Enter Your Choice: ");
        choice = sc.nextInt();
        do{
            switch(choice){
                case 1: System.out.print("Enter the number of elements: ");
                        num = sc.nextInt();
                        String []arr = new String[num];
                        System.out.println("Enter the elements: ");
                        sc.nextLine();
                        for(int i=0;i<num;i++)
                            arr[i] = sc.nextLine();
                        String max = gm.<String>findMax(arr,out);
                        System.out.printf("\nMax element: %s\tMax Index: %d\n\n",max,out[0]);
                        break;
                case 2: System.out.print("Enter the number of elements: ");
                        num = sc.nextInt();
                        Integer []arr1 = new Integer[num];
                        System.out.print("Enter the elements: ");
                        sc.nextLine();
                        for(int i=0;i<num;i++)
                            arr1[i] = sc.nextInt();
                        Integer max1 = gm.<Integer>findMax(arr1,out);
                        System.out.printf("\nMax element: %d\tMax Index: %d\n\n",max1,out[0]);
                        break;
                case 3: System.out.print("Enter the number of elements: ");
                        num = sc.nextInt();
                        Float []arr2 = new Float[num];
                        System.out.print("Enter the elements: ");
                        sc.nextLine();
                        for(int i=0;i<num;i++)
                            arr2[i] = sc.nextFloat();
                        Float max2 = gm.<Float>findMax(arr2,out);
                        System.out.printf("\nMax element: %.3f\tMax Index: %d\n\n",max2,out[0]);
                        break;
            }
            System.out.println("DATA TYPES\n1: String\n2: Integer\n3: Float");
            System.out.print("Enter Your Choice(To stop enter -1): ");
            choice = sc.nextInt();
        }while(choice != -1);
	}
}

/*OUTPUT
DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice: 1
Enter the number of elements: 5
Enter the elements:
John
Peter
Dave
Marques
Tyler

Max element: Tyler      Max Index: 4

DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice(To stop enter -1): 2
Enter the number of elements: 5
Enter the elements: 20 75 153 22 98

Max element: 153        Max Index: 2

DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice(To stop enter -1): 3
Enter the number of elements: 5
Enter the elements: 2.22 2.21 2.98 3.01 0.12

Max element: 3.01       Max Index: 3

DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice(To stop enter -1): -1
*/