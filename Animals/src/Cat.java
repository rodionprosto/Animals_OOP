public class Cat extends Animal {
    public Cat(String name){
        this.name=name;
    }
    public void selectname(String name){
        this.name=name;
    }
    public void walk() {
        System.out.println("кот "+name+" идёт");
    }
    public void eat() {
        System.out.println("кот "+name+" ест");
    }
    public void sleep() {
        System.out.println("кот "+name+" спит");
    }
}
