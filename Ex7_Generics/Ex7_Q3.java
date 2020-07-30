import java.util.*;

class GenericSort{
    <T extends Comparable> void isort(T []arr){
        for(int pos=1;pos<arr.length;pos++){
            int nextpos = pos;
            while(nextpos > 0 && arr[nextpos].compareTo(arr[nextpos-1]) < 0){
                T temp = arr[nextpos];
                arr[nextpos] = arr[nextpos - 1];
                arr[nextpos - 1] = temp;
                nextpos--;
            }
        }
    }
}

class TestGenericSort{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        GenericSort gs = new GenericSort();
        int choice,num;
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
                        gs.<String>isort(arr);
                        System.out.print("\nSorted Array: ");
                        for(int i=0;i<num;i++)
                            System.out.printf("%s ",arr[i]);
                        System.out.println("\n");
                        break;
                case 2: System.out.print("Enter the number of elements: ");
                        num = sc.nextInt();
                        Integer []arr1 = new Integer[num];
                        System.out.print("Enter the elements: ");
                        sc.nextLine();
                        for(int i=0;i<num;i++)
                            arr1[i] = sc.nextInt();
                        gs.<Integer>isort(arr1);
                        System.out.print("\nSorted Array: ");
                        for(int i=0;i<num;i++)
                            System.out.printf("%d ",arr1[i]);
                        System.out.println("\n");
                        break;
                case 3: System.out.print("Enter the number of elements: ");
                        num = sc.nextInt();
                        Float []arr2 = new Float[num];
                        System.out.print("Enter the elements: ");
                        sc.nextLine();
                        for(int i=0;i<num;i++)
                            arr2[i] = sc.nextFloat();
                        gs.<Float>isort(arr2);
                        System.out.print("\nSorted Array: ");
                        for(int i=0;i<num;i++)
                            System.out.printf("%.2f ",arr2[i]);
                        System.out.println("\n");
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
Enter Your Choice: 2
Enter the number of elements: 7
Enter the elements: 28 10 33 25 67 22 99

Sorted Array: 10 22 25 28 33 67 99

DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice(To stop enter -1): 3
Enter the number of elements: 5
Enter the elements: 2.22 2.21 2.29 3.11 0.29

Sorted Array: 0.29 2.21 2.22 2.29 3.11

DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice(To stop enter -1): 1
Enter the number of elements: 5
Enter the elements:
John
Marques
Dave
Peter
Tyler

Sorted Array: Dave John Marques Peter Tyler

DATA TYPES
1: String
2: Integer
3: Float
Enter Your Choice(To stop enter -1): -1
*/