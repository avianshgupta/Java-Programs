import java.util.*;

class TestLinkedList{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> llist = new LinkedList<Integer>();
        int ch,ele,pos;
        System.out.println("LINKED LIST OPERATIONS\n1: Insert First\t\t2: Insert Last\n3: Delete First\t\t4: Delete Last\n5: Insert\t\t6: Delete\n7: Search\t\t8: Display Forward\n9: Display Backwards\t10: Sort\n11: Replace\t\t12: Remove Duplicates");
        System.out.print("\nEnter Your Choice: ");
        ch = sc.nextInt();
        do{
            switch(ch){
                case 1: System.out.print("Enter the element: ");
                        ele = sc.nextInt();
                        llist.addFirst(ele);
                        break;
                case 2: System.out.print("Enter the element: ");
                        ele = sc.nextInt();
                        llist.addLast(ele);
                        break;
                case 3: llist.removeFirst();
                        System.out.println("\nFirst element deleted\n");
                        break;
                case 4: llist.removeLast();
                        System.out.println("\nLast element deleted\n");
                        break;
                case 5: System.out.print("Enter the element: ");
                        ele = sc.nextInt();
                        System.out.print("Enter the position at which you want to insert: ");
                        pos = sc.nextInt();
                        llist.add(pos-1,ele);
                        break;
                case 6: System.out.print("Enter the position of the element you want to delete: ");
                        pos = sc.nextInt();
                        llist.remove(pos-1);
                        break;
                case 7: System.out.print("Enter the element to be searched: ");
                        ele = sc.nextInt();
                        System.out.println("Position of "+ele+" is "+(llist.indexOf(ele)+1));
                        break;
                case 8: System.out.println("\nLinked List: "+llist+"\n");
                        break;
                case 9: ListIterator litr = llist.listIterator();
                        System.out.println();
                        char ch2;
                        while(litr.hasNext())
                            litr.next();
                            System.out.print("Reversed List: [");
                        while(litr.hasPrevious()){
                            Integer data = (Integer)litr.previous();
                            ch2=(litr.hasPrevious())?',':']';
                            System.out.printf("%d%c ",data,ch2);
                        }
                        
                        System.out.println();
                        break;
                case 10: System.out.println("Original Linked List: "+llist);
                         LinkedList<Integer> cllist = new LinkedList<Integer>();
                         cllist = (LinkedList)llist.clone();
                         Collections.sort(cllist);
                         System.out.println("Sorted Linked List: "+cllist);
                         break;
                case 11: System.out.print("Enter the element: ");
                         ele = sc.nextInt();
                         System.out.print("Enter the position of element with which you want to replace: ");
                         pos = sc.nextInt();
                         llist.set(pos-1,ele);
                         break;
                case 12: TreeSet<Integer> ts = new TreeSet<Integer>();
                         ts.addAll(llist);
                         System.out.println("Modified List: "+ts);
                         break;
            }
            System.out.println("\nLINKED LIST OPERATIONS\n1: Insert First\t\t2: Insert Last\n3: Delete First\t\t4: Delete Last\n5: Insert\t\t6: Delete\n7: Search\t\t8: Display Forward\n9: Display Backwards\t10: Sort\n11: Replace\t\t12: Remove Duplicates");
            System.out.print("\nEnter Your Choice: ");
            ch = sc.nextInt();
        }while(ch != -1);
    }
}