public class SelectAnimal{

    public static Animal select(String name, String s) {
        switch (s) {
            case ("кот"):
                System.out.print("имя ");
                return new Cat(name);
            case ("собака"):
                System.out.print("имя ");
                return new Dog(name);
        }
            return null;

            }
}
