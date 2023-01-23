package HWork_Les_6.Core.Operations;

import java.util.ArrayList;

import HWork_Les_6.Client.ConsoleLine;
import HWork_Les_6.Core.Data.Base;
import HWork_Les_6.Core.Data.EnterBase;

public class FindWorker {
    public static EnterBase enterBase = new EnterBase();
    public static ConsoleLine consoleLine = new ConsoleLine();
    
    public static ArrayList<Base> printBase() throws Exception { //** Вывод данных о сотруднике по поиску */
        System.out.println("Введите фамилию сотрудника: ");
        String surnameWorker = new String (consoleLine.getLine());
        ArrayList<Base> allWorkers = enterBase.getArrayWorkers();
        for (int i = 0; i < allWorkers.size(); i++) { 
            if (allWorkers.get(i).getSurnameWorker().equalsIgnoreCase(surnameWorker) == true){
                System.out.println(allWorkers.get(i).getInfo());
            }
        }
        return allWorkers;
    }
}
