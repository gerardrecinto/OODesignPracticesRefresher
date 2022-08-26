public class User {
    //fields (attributes)
    public String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //methods
    public void sayHello(){
        System.out.println("Hi my name is: " + name);
    }
}
