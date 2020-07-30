import java.util.*;

class GenericStack<T>{
    int topofstack=0,maxsize;
    final int emptytos = 0;
    T []stack;
    public GenericStack(int maxsize,T []stack){
    	this.maxsize = maxsize;
    	this.stack = stack;
    }
    public boolean isFull(){
        return topofstack == maxsize;
    }
    public boolean isEmpty(){
        return topofstack == emptytos;
    }
    public void push(T element){
        if(isFull())
            System.out.println("Full Stack");  
        else
            stack[++topofstack] = element;
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }
        return stack[topofstack--];
    }
    public T peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }
        return stack[topofstack];
    }

    void display(){
        int ind = 1;
        while(ind <= topofstack)
            System.out.print("---->"+stack[ind++]);
        System.out.println();
    }
}

class TestGenericStack{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of elements in the stack( < 15): ");
        //int num = sc.nextInt();
        int ch1,ch2;
        int maxsize = 20;
        System.out.println("DATA TYPES\n1: String\n2: Character\n3: Number");
        System.out.print("\nEnter your choice: ");
        ch1 = sc.nextInt();
        do{
            switch(ch1){
                case 1: String []arr = new String[maxsize];
                        GenericStack<String> gs1 = new GenericStack<String>(maxsize,arr);
                        System.out.println("STACK OPERATIONS\n1: Push\n2: Pop\n3: Display\n4: Peek");
                        System.out.print("\nEnter your choice: ");
                        ch2 = sc.nextInt();
                        do{
                            sc.nextLine();
                            switch(ch2){
                                case 1: System.out.print("Enter the element to be pushed:");
                                        gs1.push(sc.nextLine());
                                        break;
                                case 2: System.out.println("Popped element: "+gs1.pop());
                                        break;
                                case 3: gs1.display();
                                        break;
                                case 4: System.out.println("Top element: "+gs1.peek());
                                        break;
                                default: System.out.println("Enter a valid choice");
                                         break;
                            }
                            System.out.println("STACK OPERATIONS\n1: Push\n2: Pop\n3: Display\n4: Peek");
                            System.out.print("\nEnter your choice(To stop enter -1): ");
                            ch2 = sc.nextInt();
                        }while(ch2 != -1);
                        break;
                case 2: Character []arr1 = new Character[maxsize];
                        GenericStack<Character> gs2 = new GenericStack<Character>(maxsize,arr1);
                        System.out.println("STACK OPERATIONS\n1: Push\n2: Pop\n3: Display\n4: Peek");
                        System.out.print("\nEnter your choice: ");
                        ch2 = sc.nextInt();
                        do{
                            switch(ch2){
                                case 1: System.out.print("Enter the element to be pushed:");
                                        gs2.push(sc.next().charAt(0));
                                        break;
                                case 2: System.out.println("Popped element: "+gs2.pop());
                                        break;
                                case 3: gs2.display();
                                        break;
                                case 4: System.out.println("Top element: "+gs2.peek());
                                        break;
                                default: System.out.println("Enter a valid choice");
                                         break;
                            }
                            System.out.println("STACK OPERATIONS\n1: Push\n2: Pop\n3: Display\n4: Peek");
                            System.out.print("\nEnter your choice(To stop enter -1): ");
                            ch2 = sc.nextInt();
                        }while(ch2 != -1);
                        break;
                case 3: Number []arr2 = new Number[maxsize];
                        GenericStack<Number> gs3 = new GenericStack<Number>(maxsize,arr2);
                        System.out.println("STACK OPERATIONS\n1: Push\n2: Pop\n3: Display\n4: Peek");
                        System.out.print("\nEnter your choice: ");
                        ch2 = sc.nextInt();
                        do{
                            switch(ch2){
                                case 1: System.out.print("Enter the element to be pushed:");
                                        gs3.push(sc.nextDouble());
                                        break;
                                case 2: System.out.printf("Popped element: %.3f\n",gs3.pop());
                                        break;
                                case 3: gs3.display();
                                        break;
                                case 4: System.out.printf("Top element: %.3f\n",gs3.peek());
                                        break;
                                default: System.out.println("Enter a valid choice");
                                         continue;
                            }
                            System.out.println("STACK OPERATIONS\n1: Push\n2: Pop\n3: Display\n4: Peek");
                            System.out.print("\nEnter your choice(To stop enter -1): ");
                            ch2 = sc.nextInt();
                        }while(ch2 != -1);
                        break;
                default: System.out.println("Enter a valid choice");
                         continue;
            }
            System.out.println("DATA TYPES\n1: String\n2: Character\n3: Number");
            System.out.print("\nEnter your choice(To stop enter -1): ");
            ch1 = sc.nextInt();
        }while(ch1 != -1);
	}
}

/*OUTPUT 
DATA TYPES
1: String
2: Character
3: Number

Enter your choice: 1
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice: 1
Enter the element to be pushed:Marques
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:John
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:Peter
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:Tyler
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 3
---->Marques---->John---->Peter---->Tyler
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 2
Popped element: Tyler
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 4
Top element: Peter
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 3
---->Marques---->John---->Peter
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): -1
DATA TYPES
1: String
2: Character
3: Number

Enter your choice(To stop enter -1): 2
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice: 1
Enter the element to be pushed:a
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:b
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:c
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:d
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 3
---->a---->b---->c---->d
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 2
Popped element: d
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 4
Top element: c
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 3
---->a---->b---->c
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): -1
DATA TYPES
1: String
2: Character
3: Number

Enter your choice(To stop enter -1): 3
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice: 1
Enter the element to be pushed:28
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:31
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:40
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 1
Enter the element to be pushed:7
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 3
---->28.0---->31.0---->40.0---->7.0
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 2
Popped element: 7.000
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 4
Top element: 40.000
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): 3
---->28.0---->31.0---->40.0
STACK OPERATIONS
1: Push
2: Pop
3: Display
4: Peek

Enter your choice(To stop enter -1): -1
DATA TYPES
1: String
2: Character
3: Number

Enter your choice(To stop enter -1): -1
*/