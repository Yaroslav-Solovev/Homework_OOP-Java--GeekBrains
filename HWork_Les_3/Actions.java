package HWork_Les_3;

public interface Actions {
    public void speak();

    public void eat();
   
    public void run();
    
    public void makeDo();

    public default void nothing() {
        System.out.println(": :) Надо вздремнуть!");
    }
 }