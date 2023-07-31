public class cow extends Animal{
    int leg;
    public cow(int leg){
     super("hurra","gorey");
     System.out.println("I am a default constructor of cow");
     this.leg =leg;
 }

    @Override
    //this is same method but different feature from parent i.e. method overriding
    public void eat() {
        System.out.println("I eat grass only am herbivores");
    }
}
