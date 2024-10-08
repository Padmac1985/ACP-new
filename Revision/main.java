 class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name=name;
        this.age=age;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void makeSound() {
        System.out.println(" The animal make a sound ");
    }
}
 class dog extends Animal {
    private String breed;
    public dog(String name, int age, String breed) {
        super(name,age);
        this.breed=breed;
    }
    public String getBreed() {
        return breed;
    }
    public void makeSound() {
        System.out.println(" The dog barks ");
    }
}
 class cat extends Animal {
    private boolean isindoor;
    public cat( String name, int age, boolean isindoor) {
      super(name,age);
      this.isindoor=isindoor;  
    }
    public boolean getisindoor() {
        return isindoor;
    }
    public void makeSound() {
        System.out.println(" The cat meows ");

    }
}
public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("lion", 10);
        dog pet = new dog(" pup ", 8, " Golden Retriever ");
        cat object = new cat(" cat ", 9, true);
      System.out.println(" The name of the animal is " + animal.getName() + " and its age is " + animal.getAge());
      animal.makeSound();
      System.out.println(" The name of the animal is " + pet.getName() + " and its age is " + pet.getAge() + " The breed type is " + pet.getBreed());
      pet.makeSound();
      System.out.println(" The name of the animal is " + object.getName() + " and its age is " + object.getAge() + " The breed type is " + object.getisindoor());
      object.makeSound();
    }

}