public class Animal {
    private String breed;
    private String name;

    public void eat(){
        System.out.println("I eat so many things");
    }

    //this parameterized constructor is called through super() method in child
    public Animal(String breed, String name) {
        this.breed = breed;
        this.name = name;

    }

    //The default constructor is called automatically in child
//    public Animal(){
//        System.out.println("Am a animal");
//    }
}
