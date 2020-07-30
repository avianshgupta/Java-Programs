/* Q2. Write a java program to find matrix addition, subtraction and multiplication.*/

import java.util.*;

class MatrixOpr{
    void mat_add(int [][]mat1,int [][]mat2,int [][]res){
        for(int i=0;i<mat1.length;i++)
            for(int j=0;j<mat1[i].length;j++)
                res[i][j] = mat1[i][j] + mat2[i][j];
    }

    void mat_sub(int [][]mat1,int [][]mat2,int [][]res){
        for(int i=0;i<mat1.length;i++)
            for(int j=0;j<mat1[i].length;j++)
                res[i][j] = mat1[i][j] - mat2[i][j];
    }

    void mat_mul(int [][]mat1,int [][]mat2,int [][]res){
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                res[i][j]=0;
                for(int k=0;k<mat2.length;k++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        
        }
    }
}

class Ex1b_Q2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        MatrixOpr f=new MatrixOpr();
        int [][]mat1;
        int [][]mat2;
        int [][]res=new int[10][10];
        int row1,col1,row2,col2;
        System.out.print("Enter the number of rows and columns of 1st matrix: ");
        row1=s.nextInt();
        col1=s.nextInt();
		mat1=new int[row1][col1];
		for(int i=0;i<row1;i++){
			System.out.println("Enter the elements of row "+(i+1)+": ");
			for(int j=0;j<col1;j++)
				mat1[i][j]=s.nextInt();
		}
        System.out.print("Enter the number of rows and columns of 2nd matrix: ");
        row2=s.nextInt();
        col2=s.nextInt();
        mat2=new int[row2][col2];
        for(int i=0;i<row2;i++){
			System.out.println("Enter the elements of row "+(i+1)+": ");
			for(int j=0;j<col2;j++)
				mat2[i][j]=s.nextInt();
		}
		int choice;
		System.out.print("Enter the operation:\n1: Addition\n2: Subtraction\n3: Multiplication\n");
		choice=s.nextInt();
		do{	
			switch(choice){
				case 1:if(row1==row2 && col1==col2){
						res=new int[row1][col1];
						f.mat_add(mat1,mat2,res);
						System.out.println("Output Matrix");
						for(int i=0;i<res.length;i++){
		    				for(int j=0;j<res[i].length;j++)
		    					System.out.print(res[i][j]+" ");
		    				System.out.println();
		    			}			
					}
					else{
						System.out.println("Addition Not Possible!!");
					}
					break;
			
				case 2:if(row1==row2 && col1==col2){
						res=new int[row1][col1];
						f.mat_sub(mat1,mat2,res);
						System.out.println("Output Matrix");
						for(int i=0;i<res.length;i++){
		    				for(int j=0;j<res[i].length;j++)
		    					System.out.print(res[i][j]+" ");
		    				System.out.println();			
						}
					}
					else{
						System.out.println("Subtraction Not Possible!!");
					}
					break;
				case 3:if(col1==row2){
						res=new int[row1][col2];
						f.mat_mul(mat1,mat2,res);
						System.out.println("Output Matrix");
						for(int i=0;i<res.length;i++){
		    				for(int j=0;j<res[i].length;j++)
		    					System.out.print(res[i][j]+" ");
		    				System.out.println();
						}
					}
					else{
						System.out.println("Multiplication Not Possible!!");
					}
					break;
			}
		
			System.out.print("\nEnter the operation:\n1: Addition\n2: Subtraction\n3: Multiplication\nTo STOP enter -1\n");
			choice=s.nextInt();
		}while(choice!=-1);
    }
}

/*OUTPUT
cs1028@wtl4:~/Desktop/programs/1b$ java Ex1b_Q2 
Enter the number of rows and columns of 1st matrix: 2 3
Enter the elements of row 1: 
1 2 3
Enter the elements of row 2: 
4 5 6
Enter the number of rows and columns of 2nd matrix: 3 2
Enter the elements of row 1: 
1 2 
Enter the elements of row 2: 
3 4
Enter the elements of row 3: 
5 6
Enter the operation:
1: Addition
2: Subtraction
3: Multiplication
3
Output Matrix
22 28 
49 64 

Enter the operation:
1: Addition
2: Subtraction
3: Multiplication
To STOP enter -1
-1
cs1028@wtl4:~/Desktop/programs/1b$ java Ex1b_Q2 
Enter the number of rows and columns of 1st matrix: 3 3
Enter the elements of row 1: 
1 2 3
Enter the elements of row 2: 
4 5 6
Enter the elements of row 3: 
7 8 9
Enter the number of rows and columns of 2nd matrix: 3 3
Enter the elements of row 1: 
1 2 3            
Enter the elements of row 2: 
4 5 6
Enter the elements of row 3: 
7 8 9
Enter the operation:
1: Addition
2: Subtraction
3: Multiplication
1
Output Matrix
2 4 6 
8 10 12 
14 16 18 

Enter the operation:
1: Addition
2: Subtraction
3: Multiplication
To STOP enter -1
2
Output Matrix
0 0 0 
0 0 0 
0 0 0 

Enter the operation:
1: Addition
2: Subtraction
3: Multiplication
To STOP enter -1
-1
*/
