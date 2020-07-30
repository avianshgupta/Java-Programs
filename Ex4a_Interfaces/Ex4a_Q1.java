import java.util.*;
interface StackAdt{
    public final int maxsize = 15;
    public boolean isFull();
    public boolean isEmpty();
    public void push(char element);
    public char pop();
    public char peek();
}

class Stack implements StackAdt{
    int topofstack=0;
    final int emptytos = 0;
    char []stack = new char[maxsize];
    public boolean isFull(){
        return topofstack == maxsize;
    }
    public boolean isEmpty(){
        return topofstack == emptytos;
    }
    public void push(char element){
        if(isFull())
            System.out.println("Full Stack");  
        else
            stack[++topofstack] = element;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return '\0';
        }
        return stack[topofstack--];
    }
    public char peek(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return '\0';
        }
        return stack[topofstack];
    }
    void display(){
        int i=0;
        while(i != topofstack)
            System.out.printf("%c--->",stack[i++]);
        System.out.println();
    }
    boolean BalanceParanthesis(String exp){
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i) == '(' || exp.charAt(i) == '{' || exp.charAt(i) == '['){
                push(exp.charAt(i));
            }
            else if(exp.charAt(i) == ')' || exp.charAt(i) == '}' || exp.charAt(i) == ']'){
                if((peek() =='(' && exp.charAt(i) == ')') || (peek() =='[' && exp.charAt(i) == ']') || (peek() =='{' && exp.charAt(i) == '}'))
                    pop();
                else
                    return false;
            }
        }
        //display();
        if(isEmpty())
            return true;
        else
            return false;
    }
    static boolean checkTwoStacks(Stack s1,Stack s2){
        int len1 = s1.topofstack;
        int len2 = s2.topofstack;
        if(len1 != len2)
            return false;
        char []arr1 = new char[len1];
        char []arr2 = new char[len2]; 
        for(int i=len1,j=0;i>0;i--,j++)
            arr1[j] = s1.stack[i];
        for(int i=len2,j=0;i>0;i--,j++)
            arr2[j] = s2.stack[i];
        sort(arr1);
        sort(arr2);
        for(int i=0 ;i<len1;i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
    static void sort(char []arr){
        int len=arr.length;
        char temp;
        for(int j = 0 ; j < len-1 ; j++){
            for(int k = 0; k < len-1 ; k++){
                if(arr[k] > arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
    }
}

class TestStack{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("OPERATIONS\n1: Balancing Parenthesis\n2: Check Two Stacks");
        System.out.print("Enter Your choice: ");
        choice = sc.nextInt();
        do{
            switch(choice){
                case 1: String exp;
                        sc.nextLine();
                        System.out.print("Enter the expression to be checked: ");
                        exp = sc.nextLine();
                        Stack s = new Stack();
                        if(s.BalanceParanthesis(exp)==true)
                            System.out.println("Given expression is Balanced");
                        else
                            System.out.println("Given expression is Unbalanced");
                        break;
                case 2: Stack s1 = new Stack();
                        Stack s2 = new Stack();
                        int len1,len2;
                        System.out.print("Enter the number of elements in stack 1( < 15): ");
                        len1 = sc.nextInt();
                        for(int i = 0;i<len1;i++)
                            s1.push(sc.next().charAt(0));
                        System.out.print("Enter the number of elements in stack 2( < 15): ");
                        len2 = sc.nextInt();
                        for(int i = 0;i<len2;i++)
                            s2.push(sc.next().charAt(0));
                        boolean flag = Stack.checkTwoStacks(s1, s2);
                        if(flag == true){
                            int flag1 = 1;
                            for(int i=s1.topofstack;i>0;i--){
                                if(s1.stack[i] != s2.stack[i]){
                                    System.out.println("Stacks are equal but unordered.");
                                    flag1 = 0;
                                    break;
                                }
                            }
                            if(flag1 == 1)
                            System.out.println("Stacks are equal.");
                        }
                        else{
                            System.out.println("Stacks are unequal.");
                        }
                        break;
            }
            System.out.println("OPERATIONS\n1: Balancing Parenthesis\n2: Check Two Stacks");
            System.out.print("Enter Your choice(To stop enter -1): ");
            choice = sc.nextInt();
        }while(choice != -1);
    }
}