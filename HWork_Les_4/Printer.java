package HWork_Les_4;

public class Printer {
// обобщенный метод
    public <T> void print(T[] items){
         for(T item: items){
            System.out.println(item);
        }
    }
}
