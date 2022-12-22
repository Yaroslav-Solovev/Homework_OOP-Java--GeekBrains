package HWork_Les_2;

public class Child implements Actions{

    @Override
    public void speak() {
        System.out.println("Я ХОЧУ КУШАТЬ!!!");
    }

    @Override
    public void eat() {
        System.out.println("ХРУМ-ХРУМ...");  
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
    }

    @Override
    public void makeDo() {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.speak();
        child.eat();
    } 
}
