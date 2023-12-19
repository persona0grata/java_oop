public class Main { //Created Main class
    public static void main(String[] args){
        Person person1 = new Person("Batyrkhan", 17); // Created an object of type object Person | TASK 1

        person1.printDetails(); // Printing information about person1 | TASK 1

        System.out.println(); // Empty line printing


        person1.setName(); // Setting Name for person1 | TASK 3
        person1.setAge(); // Setting Age for person1 | TASK 3

        System.out.println(); // Empty line
        System.out.println("UPDATED INFORMATION:");
        person1.printDetails(); // Printing updated information about person 1 | TASK 3 AND 4
    }
}
