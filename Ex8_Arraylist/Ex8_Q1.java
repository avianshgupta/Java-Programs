import java.util.*;

class ListMethods{
    void merge(ArrayList<Integer> A,ArrayList<Integer> B,ArrayList<Integer> O){
        int i = 0;
        int j = 0;
        int k = 0;
       /* System.out.println("list1: "+A+"\nlist2: "+B+"\nSize1: "+A.size()+"\nSize2: "+B.size());
        for(int z=0;z<A.size();z++)
            System.out.print(A.get(z)+" ");
        System.out.println();*/
        while(k < A.size()+B.size()){
            if((i < A.size()) && (j == B.size() || A.get(i) <= B.get(j))){
                O.set(k,A.get(i));
                i++;
            }
            else if((j < B.size()) && (i == A.size() || A.get(i) > B.get(j))){ 
                O.set(k,B.get(j));
                j++;
            }
            k++;
        }
    }

    void union(ArrayList<Integer> A,ArrayList<Integer> B,ArrayList<Integer> O){
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < A.size()+B.size()){
            if((i < A.size()) && (j == B.size() || A.get(i) < B.get(j))){ 
                O.set(k++,A.get(i++));
            }
            else if(A.get(i) == B.get(j)){
                O.set(k++,A.get(i++));
                j++;
            }
            else if((j < B.size()) && (i == A.size() ||  A.get(i) > B.get(j))){  
                O.set(k++,B.get(j++));
            }
        }
    }

    void intersection(ArrayList<Integer> A,ArrayList<Integer> B,ArrayList<Integer> O){
        int i = 0;
        int j = 0;
        int k = 0;
        while(k < A.size()+B.size()){
            if(A.get(i) == B.get(j)){
                O.set(k++,A.get(i++));
                j++;
            }
        }
    }

    boolean compare(ArrayList<Integer> A,ArrayList<Integer> B){
        Collections.sort(A);
        Collections.sort(B);
        if(A.size() != B.size())
            return false;
        for(int i=0;i<A.size();i++){
            if(A.get(i) != B.get(i))
                return false;
        }
        return true;
    }
}

class TestArrayList{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ListMethods lm = new ListMethods();
        int len1,len2,choice;
        System.out.print("Enter the number of elements in the first list: ");
        len1 = sc.nextInt();
        ArrayList<Integer> alist1 = new ArrayList<Integer>(len1);
        System.out.print("Enter the elements of the first list: ");
        for(int i=0;i<len1;i++)
            alist1.add(sc.nextInt());
        System.out.print("Enter the number of elements in the second list: ");
        len2 = sc.nextInt();
        ArrayList<Integer> alist2 = new ArrayList<Integer>(len2);
        System.out.print("Enter the elements of the second list: ");
        for(int i=0;i<len2;i++)
            alist2.add(sc.nextInt());
        ArrayList<Integer> Out = new ArrayList<Integer>(50);
        System.out.print("OPERATIONS\n1: Merge\n2: Union\n3: Intersection\n4: Compare\n\nEnter Your Choice: ");
        choice = sc.nextInt();
        do{
            switch(choice){
                case 1: lm.merge(alist1,alist2,Out);
                        System.out.println("List 1:"+alist1+"\nList 2: "+alist2+"\nMerged List: "+Out);
                        break;
                case 2: lm.union(alist1,alist2,Out);
                        System.out.println("List 1:"+alist1+"\nList 2: "+alist2+"\nUnion of list1 and list2: "+Out);
                        break;
                case 3: lm.intersection(alist1,alist2,Out);
                        System.out.println("List 1:"+alist1+"\nList 2: "+alist2+"\nIntersection of list1 and list2: "+Out);
                        break;
                case 4: ArrayList<Integer> temp1 = new ArrayList<Integer>(len1);
                        ArrayList<Integer> temp2 = new ArrayList<Integer>(len2);
                        temp1 = (ArrayList)alist1.clone();
                        temp2 = (ArrayList)alist2.clone();
                        int flag = 1;
                        if(lm.compare(temp1,temp2)){
                            for(int i=0;i<len1;i++){
                                if(alist1.get(i) != alist2.get(i)){
                                    flag = 0;
                                    System.out.println("List1 and List2 are equal but unordered");
                                    break;
                                }
                            }
                            if(flag == 1)
                                System.out.println("List1 and List2 are equal");
                        }
                        else{
                            System.out.println("List1 and List2 are unequal");
                        }
                        break;    
            }
            System.out.print("OPERATIONS\n1: Merge\n2: Union\n3: Intersection\n4: Compare\n\nEnter Your Choice(To stop enter -1): ");
            choice = sc.nextInt();
        }while(choice != -1);
    }   
}