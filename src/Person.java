import java.util.Scanner; // Imported Scanner for user input
// TASK 1
public class Person { // Created Person class | TASK 1

    Scanner scanner = new Scanner(System.in); // Created scanner class

    private String Name; // Created private Name variable (String)
    private int Age; // Created private Age variable (int)

    // TASK 3
    public void setName(){ // Created setName method
        System.out.print("Set new Name: ");
        Name = scanner.nextLine(); // User input Name (String)
    }
    public void setAge(){ // Created setAge method
        System.out.print("Set new Age: ");
        Age = scanner.nextInt(); // Uer input Age (int)
    }


    public void getName(){ // Created getName methot for printing Name
        System.out.println("Name: " + Name);
    }

    public void getAge(){ // Created getName methot for printing Name
        System.out.println("Age: " + Age);
    }


    public void printDetails(){ // Created printDetails method | TASK 2 AND 4
        getName(); //Calling getName and getAge methods
        getAge();
    }

    Person(String Name, int Age){ //Created constructor for Person class | TASK 4
        this.Name = Name;
        this.Age = Age;
    }
}
