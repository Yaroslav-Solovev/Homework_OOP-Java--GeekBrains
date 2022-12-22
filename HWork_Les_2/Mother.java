package HWork_Les_2;

public class Mother implements Actions {
    
    @Override
    public void speak() {
        System.out.println("Разрешаю тебе открыть дверь шкафа.");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void makeDo() {
        System.out.println("Сиди уже. Я сама открыла дверь шкафа.");
        
    }

    public static void main(String[] args) {
        Mother mother = new Mother();
        mother.speak();
        mother.makeDo();
        mother.nothing();
    } 
}
