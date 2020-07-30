import java.util.*;

class test{
    public static void main(String []args){
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("String");
        tset.add("Test");
        tset.add("Pen");
        tset.add("Ink");
        tset.add("Jack");
        System.out.println("After removing element" +" from TreeSet: " + tset);
        System.out.println(tset.lower("SSN")); //< Pen
        System.out.println(tset.lower("String")); //<= Pen
        System.out.println(tset.floor("String")); //<= String
        System.out.println(tset.ceiling("String")); //>= String
        System.out.println(tset.higher("String")); //> Test
        System.out.println(tset.descendingSet()); // [Test, String, Pen, Jack, Ink]
        System.out.println(tset.headSet("Pen")); // all elements < [Ink, Jack]
        System.out.println(tset.tailSet("Pen")); //all elements >= [Pen, String, Test]
        System.out.println(tset.subSet("Jack","String"));
    }
}