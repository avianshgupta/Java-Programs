import java.util.*;

class Movie{
    String name,actor,genre;
    int year;
    float rating;
    public Movie(String name,String actor,String genre,int year,float rating){
        this.name = name;
        this.actor = actor;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public void display(){
        System.out.printf("Name: %s\nActor: %s\nGenre: %s\nYear: %d\nRating: %.1f\n",name,actor,genre,year,rating);
    }
}

class SortByRating implements Comparator<Movie>{
    public int compare(Movie a,Movie b){
        if(a.rating > b.rating)
            return a.rating;
        return b.rating;
    }
}

class SortByYear implements Comparator<Movie>{
    public int compare(Movie a,Movie b){
        if(a.year > b.year)
            return a.year;
        return b.year;
    }
}

class TestMovieQueue{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String name,actor,genre;
        int year;
        float rating;
        LinkedList<Movie> mque = new LinkedList<Movie>();
        System.out.println("CHOICES\n1: Add a Movie at Last\n2: Remove a Movie from front\n3: Display Movie Details\n4: Dispaly movies based on rating score\n5: Display movies based on recent release");
        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();
        do{
            switch(choice){
                case 1: System.out.print("Enter the name of the movie: ");
                        name = sc.nextLine();
                        System.out.print("Enter the name of the actor: ");
                        actor = sc.nextLine();
                        System.out.print("Enter the genre: ");
                        genre = sc.nextLine();
                        System.out.print("Enter the year of release: ");
                        year = sc.nextInt();
                        System.out.print("Enter the rating(Eg. 6.6): ");
                        rating = sc.nextFloat();
                        mque.addLast(new Movie(name,actor,genre,year,rating));
                        break;
                case 2: System.out.println("Movie Removed:");
                        mque.removeFirst().display();
                        break;
                case 3: ListIterator<Movie> litr = mque.listIterator();
                        System.out.println("------------------------------------------");
                        while(litr.hasNext()){
                            Movie ele = litr.next();
                            ele.display();
                        }
                        System.out.println("------------------------------------------");
                        break;
                case 4: LinkedList<Movie> ratingque = new LinkedList<Movie>();
                        ratingque = (LinkedList)mque.clone();
                        Collections.sort(ratingque,new SortByRating());
                        ListIterator<Movie> litr1 = ratingque.listIterator();
                        System.out.println("------------------------------------------");
                        while(litr1.hasNext()){
                            Movie ele = litr1.next();
                            ele.display();
                        }
                        System.out.println("------------------------------------------");
                        break;
                case 5: LinkedList<Movie> yearque = new LinkedList<Movie>();
                        yearque = (LinkedList)mque.clone();
                        Collections.sort(yearque,new SortByYear());
                        ListIterator<Movie> litr2 = yearque.listIterator();
                        System.out.println("------------------------------------------");
                        while(litr2.hasNext()){
                            Movie ele = litr2.next();
                            ele.display();
                        }
                        System.out.println("------------------------------------------");
                        break;
            }
            System.out.println("CHOICES\n1: Add a Movie at Last\n2: Remove a Movie from front\n3: Display Movie Details\n4: Dispaly movies based on rating score\n5: Display movies based on recent release");
            System.out.print("\nEnter your choice(To stop enter -1): ");
            choice = sc.nextInt();
        }while(choice != -1);
    }
}