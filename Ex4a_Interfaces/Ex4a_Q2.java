import java.util.*;

interface Vehicle{
    public String getName();
    public void setName(String Name);
    public int getMaxPassengers();
    public void setMaxPassengers(int maxpsg);
    public int getMaxSpeed();
    public void setMaxSpeed(int maxspeed);
}

interface LandVehicle extends Vehicle{
    public int getNumWheels();
    public void setNumWheels(int wheels);
    public void drive();
}

interface SeaVehicle extends Vehicle{
    public int getDisplacement();
    public void setDisplacement(int disp);
    public void launch(); 
}

interface EmergencyVehicle{
    public void soundSiren();
}

class Jeep implements LandVehicle{
    String name;
    int maxpsg,maxspeed,wheels;
    public String getName(){
        return name;
    }
    public void setName(String Name){
        name = Name;
    }
    public int getMaxPassengers(){
        return maxpsg;
    }
    public void setMaxPassengers(int maxpsg){
        this.maxpsg = maxpsg;
    }
    public int getMaxSpeed(){
        return maxspeed;
    }
    public void setMaxSpeed(int maxspeed){
        this.maxspeed = maxspeed;
    }
    public int getNumWheels(){
        return wheels;
    }
    public void setNumWheels(int wheels){
        this.wheels = wheels;
    }
    public void drive(){
        System.out.print("Jeep Drive\t");
    }
    void SoundHorn(){
        System.out.println("Jeep Horn");
    }
}

class Frigate implements SeaVehicle{
    String name;
    int maxpsg,maxspeed,disp;
    public String getName(){
        return name;
    }
    public void setName(String Name){
        name = Name;
    }
    public int getMaxPassengers(){
        return maxpsg;
    }
    public void setMaxPassengers(int maxpsg){
        this.maxpsg = maxpsg;
    }
    public int getMaxSpeed(){
        return maxspeed;
    }
    public void setMaxSpeed(int maxspeed){
        this.maxspeed = maxspeed;
    }
    public int getDisplacement(){
        return disp;
    }
    public void setDisplacement(int disp){
        this.disp = disp;
    }
    public void launch(){
        System.out.print("Frigate Launch\t");
    }
    void fireGun(){
        System.out.println("Frigate fire Gun");
    }  
}

class HoverCraft implements LandVehicle,SeaVehicle{
    String name;
    int maxpsg,maxspeed,wheels,disp;
    public String getName(){
        return name;
    }
    public void setName(String Name){
        name = Name;
    }
    public int getMaxPassengers(){
        return maxpsg;
    }
    public void setMaxPassengers(int maxpsg){
        this.maxpsg = maxpsg;
    }
    public int getMaxSpeed(){
        return maxspeed;
    }
    public void setMaxSpeed(int maxspeed){
        this.maxspeed = maxspeed;
    }
    public int getNumWheels(){
        return wheels;
    }
    public void setNumWheels(int wheels){
        this.wheels = wheels;
    }
    public int getDisplacement(){
        return disp;
    }
    public void setDisplacement(int disp){
        this.disp = disp;
    }
    public void launch(){
        System.out.println("Hovercraft Launch");
    } 
    public void drive(){
        System.out.println("Hovercraft Drive");
    }
    void enterLand(){
        System.out.println("Hovercraft Enter Land");
    }
    void enterSea(){
        System.out.println("Hovercraft Enter Sea");
    }
}

class Ambulance implements LandVehicle,EmergencyVehicle{
    String name;
    int maxpsg,maxspeed,wheels;
    public String getName(){
        return name;
    }
    public void setName(String Name){
        name = Name;
    }
    public int getMaxPassengers(){
        return maxpsg;
    }
    public void setMaxPassengers(int maxpsg){
        this.maxpsg = maxpsg;
    }
    public int getMaxSpeed(){
        return maxspeed;
    }
    public void setMaxSpeed(int maxspeed){
        this.maxspeed = maxspeed;
    }
    public int getNumWheels(){
        return wheels;
    }
    public void setNumWheels(int wheels){
        this.wheels = wheels;
    }
    public void drive(){
        System.out.print("Ambulance Drive\t");
    }
    public void soundSiren(){
        System.out.print("Ambulance Siren\t");
    }
    public void patientln(){
        System.out.println("Ambulance patient");
    }
}

class TestInterface{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String name;
        int maxpsg,maxspeed,wheels,disp,choice;
        System.out.println("CHOICES\n1: Jeep\n2: Frigate\n3: Hovercraft\n4: Ambulance");
        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();
        do{
            sc.nextLine();            
            System.out.print("Enter the name of vehicle: ");
            name = sc.nextLine();
            //sc.nextLine();
            System.out.print("Enter the max passengers and speed: ");
            maxpsg = sc.nextInt();
            maxspeed = sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter the number of wheels: ");
                        wheels = sc.nextInt();
                        Jeep j = new Jeep();
                        j.setName(name);
                        j.setMaxPassengers(maxpsg);
                        j.setMaxSpeed(maxspeed);
                        j.setNumWheels(wheels);
                        System.out.println("Name\tMax Passengers\tMax Speed\tNum of wheels\tDrive\tHorn Sound");
                        System.out.printf("%s\t%d\t\t%d\t\t%d\t",j.getName(),j.getMaxPassengers(),j.getMaxSpeed(),j.getNumWheels());
                        j.drive();
                        j.SoundHorn();
                        break;
                case 2: System.out.print("Enter the displacement: ");
                        disp = sc.nextInt();
                        Frigate f = new Frigate();
                        f.setName(name);
                        f.setMaxPassengers(maxpsg);
                        f.setMaxSpeed(maxspeed);
                        f.setDisplacement(disp);
                        System.out.println("Name\tMax Passengers\tMax Speed\tDisplacement\tLaunch\tFire Gun");
                        System.out.printf("%s\t%d\t%d\t%d\t",f.getName(),f.getMaxPassengers(),f.getMaxSpeed(),f.getDisplacement());
                        f.launch();
                        f.fireGun();
                        break;
                case 3: System.out.print("Enter the number of wheels and displacement: ");
                        wheels = sc.nextInt();
                        disp = sc.nextInt();
                        HoverCraft h = new HoverCraft();
                        h.setName(name);
                        h.setMaxPassengers(maxpsg);
                        h.setMaxSpeed(maxspeed);
                        h.setNumWheels(wheels);
                        h.setDisplacement(disp);
                        System.out.println("Name\tMax Passengers\tMax Speed\tNum of Wheels\tDisplacement");
                        System.out.printf("%s\t%d\t%d\t%d\t%d",h.getName(),h.getMaxPassengers(),h.getMaxSpeed(),h.getNumWheels(),h.getDisplacement());
                        break;
                case 4: System.out.print("Enter the number of wheels: ");
                        wheels = sc.nextInt();
                        Ambulance a = new Ambulance();
                        a.setName(name);
                        a.setMaxPassengers(maxpsg);
                        a.setMaxSpeed(maxspeed);
                        a.setNumWheels(wheels);
                        System.out.println("Name\tMax Passengers\tMax Speed\tNum of wheels\tDrive\tSiren Sound\tPatient");
                        System.out.printf("%s\t%d\t%d\t%d\t",a.getName(),a.getMaxPassengers(),a.getMaxSpeed(),a.getNumWheels());
                        a.drive();
                        a.soundSiren();
                        a.patientln();
                        break;
            }
            System.out.println("\nCHOICES\n1: Jeep\n2: Frigate\n3: Hovercraft\n4: Ambulance");
            System.out.print("\nEnter your choice(To stop enter -1): ");
            choice = sc.nextInt();
        }while(choice != -1);
        sc.close();
    }
}