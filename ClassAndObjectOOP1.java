public class Human {

  String name;
  int age;
  int height;
  int heightInInches;
  String shoeColor;

  public Human(){

  }

  public void speak(){
    System.out.println("Hi! My name is " + name + ", I am " + heightInInches + " inches tall, " + age + " years old, and I have " + shoeColor " colored shoes.");
  }

  public void eat(){
    System.out.println("eating...");
  }
  public void walk(){
    System.out.println("walking...");
  }
  public void work(){
    System.out.println("working...");
  }


}
