public class Main  {

    public static void main(String[] args) {
	// write your code here
        Animal a= SelectAnimal.select("кот","собака");
        try {
            System.out.println(a.name);

            a.walk();
            a.sleep();
            a.eat();
        }catch (Exception e){
            System.out.println("такого животного нет");
        }
    }
}
