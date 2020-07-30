/*Inheritance Ex3B_Q2 */
import java.util.*;
class Shape{
    protected String color = "red";
    public Shape(){}
    public Shape(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    int shape(){
        return -1;
    }
}

class Circle extends Shape{
    protected float radius = 1.0f;
    public Circle(){}
    public Circle(float radius){
        this.radius = radius;
    }
    public Circle(float radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public float getRadius(){
        return radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public float getArea(){
        float area = 3.14f * radius *radius;
        return area;
    }
    public float getPerimeter(){
        float peri = 2 * 3.14f * radius;
        return peri;
    }
    int shape(){
        return 0;
    }
}

class Rectangle extends Shape{
    protected float width = 1.0f;
    protected float length = 1.0f;
    public Rectangle(){}
    public Rectangle(float width,float length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(float width,float length,String color){
        this.width = width;
        this.length = length;
        this.color = color;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getArea(){
        float area = length * width;
        return area;
    }
    public float getPerimeter(){
        float peri = 2 * (length + width);
        return peri;
    }
    int shape(){
        return 1;
    }
}

class Square extends Rectangle{
    public Square(){}
    public Square(float side){
        length = side;
        width = side;
    }
    public Square(float side,String color){
        length = side;
        width = side;
        this.color = color;
    }
    public float getSide(){
        return length;
    }
    public void setSide(float side){
        length = side;
        width = side;
    }
    int shape(){
        return 2;
    }
}

class TestShape{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num,choice,ch1;
        System.out.print("Enter the number of shapes: ");
        num = sc.nextInt();
        Shape []s = new Shape[3*num];
        for(int i = 0 ; i < 3*num ; i++){
            System.out.println("\nSHAPES\n1: Circle\n2: Rectangle\n3: Square");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: s[i] = new Circle();
                        s[++i] = new Circle(3);
                        s[++i]= new Circle(3,"Red");
                        System.out.println("Three circles created");
                        break;
                case 2: s[i] = new Rectangle();
                        s[++i] = new Rectangle(3,6);
                        s[++i]= new Rectangle(3,6,"Red");
                        System.out.println("Three rectangles created");
                        break;
                case 3: s[i] = new Square();
                        s[++i] = new Square(6);
                        s[++i]= new Square(6,"Red");
                        System.out.println("Three squares created");
                        break;
            }
        }
        System.out.println("\nOPERATIONS\n1: Diaplay\n2: Edit");
        System.out.print("Enter your choice: ");
        ch1 = sc.nextInt();
        do{
            switch(ch1){
                case 1: display(s,num);
                        break;
                case 2: System.out.print("Enter the serial no. of the shape you want to edit: ");
                        int snum = sc.nextInt();
                        switch(s[snum-1].shape()){
                            case 0: System.out.print("Enter Radius: ");
                                    ((Circle)s[snum-1]).setRadius(sc.nextFloat());
                                    break;
                            case 1: System.out.print("Enter Length and Width: ");
                                    ((Rectangle)s[snum-1]).setLength(sc.nextFloat());
                                    ((Rectangle)s[snum-1]).setWidth(sc.nextFloat());
                                    break;
                            case 2: System.out.print("Enter Side: ");
                                    ((Square)s[snum-1]).setSide(sc.nextFloat());
                                    break;
                        }
                        break;
            }
            System.out.println("\nOPERATIONS\n1: Diaplay\n2: Edit");
            System.out.print("Enter your choice(To stop enter -1): ");
            ch1 = sc.nextInt();
        }while(ch1 != -1);
        sc.close();
    }

    static void display(Shape []s,int num){
        System.out.println("S.No.\tShape\t\tRadius\tLength\tWidth\tPerimeter\tArea");
        for(int i=0;i<3*num;i++){
            switch(s[i].shape()){
                case 0: System.out.printf("%d\tCircle\t\t%.2f\t-\t-\t%.2f\t\t%.2f\n",(i+1),((Circle)s[i]).getRadius(),((Circle)s[i]).getPerimeter(),((Circle)s[i]).getArea());
                        break;
                case 1: System.out.printf("%d\tRectangle\t-\t%.2f\t%.2f\t%.2f\t\t%.2f\n",(i+1),((Rectangle)s[i]).getLength(),((Rectangle)s[i]).getWidth(),((Rectangle)s[i]).getPerimeter(),((Rectangle)s[i]).getArea());
                        break;
                case 2: System.out.printf("%d\tSquare\t\t-\t%.2f\t-\t%.2f\t\t%.2f\n",(i+1),((Square)s[i]).getSide(),((Square)s[i]).getPerimeter(),((Square)s[i]).getArea());
                        break;
            }
        }
    }
}
/*OUTPUT
Enter the number of shapes: 3

SHAPES
1: Circle
2: Rectangle
3: Square
Enter your choice: 1
Three circles created

SHAPES
1: Circle
2: Rectangle
3: Square
Enter your choice: 2
Three rectangles created

SHAPES
1: Circle
2: Rectangle
3: Square
Enter your choice: 3
Three squares created

OPERATIONS
1: Diaplay
2: Edit
Enter your choice: 1
S.No.   Shape           Radius  Length  Width   Perimeter       Area
1       Circle          1.00    -       -       6.28            3.14
2       Circle          3.00    -       -       18.84           28.26
3       Circle          3.00    -       -       18.84           28.26
4       Rectangle       -       1.00    1.00    4.00            1.00
5       Rectangle       -       6.00    3.00    18.00           18.00
6       Rectangle       -       6.00    3.00    18.00           18.00
7       Square          -       1.00    -       4.00            1.00
8       Square          -       6.00    -       24.00           36.00
9       Square          -       6.00    -       24.00           36.00

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): 2
Enter the serial no. of the shape you want to edit: 4
Enter Length and Width: 2.5 4.9

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): 1
S.No.   Shape           Radius  Length  Width   Perimeter       Area
1       Circle          1.00    -       -       6.28            3.14
2       Circle          3.00    -       -       18.84           28.26
3       Circle          3.00    -       -       18.84           28.26
4       Rectangle       -       2.50    4.90    14.80           12.25
5       Rectangle       -       6.00    3.00    18.00           18.00
6       Rectangle       -       6.00    3.00    18.00           18.00
7       Square          -       1.00    -       4.00            1.00
8       Square          -       6.00    -       24.00           36.00
9       Square          -       6.00    -       24.00           36.00

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): 1
S.No.   Shape           Radius  Length  Width   Perimeter       Area
1       Circle          1.00    -       -       6.28            3.14
2       Circle          3.00    -       -       18.84           28.26
3       Circle          3.00    -       -       18.84           28.26
4       Rectangle       -       2.50    4.90    14.80           12.25
5       Rectangle       -       6.00    3.00    18.00           18.00
6       Rectangle       -       6.00    3.00    18.00           18.00
7       Square          -       1.00    -       4.00            1.00
8       Square          -       6.00    -       24.00           36.00
9       Square          -       6.00    -       24.00           36.00

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): 2
Enter the serial no. of the shape you want to edit: 1
Enter Radius: 22.19

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): 2
Enter the serial no. of the shape you want to edit: 9
Enter Side: 40

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): 1
S.No.   Shape           Radius  Length  Width   Perimeter       Area
1       Circle          22.19   -       -       139.35          1546.12
2       Circle          3.00    -       -       18.84           28.26
3       Circle          3.00    -       -       18.84           28.26
4       Rectangle       -       2.50    4.90    14.80           12.25
5       Rectangle       -       6.00    3.00    18.00           18.00
6       Rectangle       -       6.00    3.00    18.00           18.00
7       Square          -       1.00    -       4.00            1.00
8       Square          -       6.00    -       24.00           36.00
9       Square          -       40.00   -       160.00          1600.00

OPERATIONS
1: Diaplay
2: Edit
Enter your choice(To stop enter -1): -1 
*/