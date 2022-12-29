package HWork_Les_4;

public class Father implements Actions{
    
    @Override
    public void makeDo() {
        System.out.println(": Открываю дверь шкафа.");
    }

    @Override
    public void speak() {
        System.out.println(": Ласточка, можно открыть дверь?");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.makeDo();
        father.speak();
    } 
}
