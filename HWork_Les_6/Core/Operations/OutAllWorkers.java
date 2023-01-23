package HWork_Les_6.Core.Operations;

import java.util.ArrayList;
import HWork_Les_6.Core.Data.Base;
import HWork_Les_6.Core.Data.EnterBase;

public class OutAllWorkers { //** Вывод всей базы сотрудников*/
    public static EnterBase enterBase = new EnterBase();

    public static ArrayList<Base> printBase() throws Exception {
        ArrayList<Base> allWorkers = enterBase.getArrayWorkers();
        for (int i = 0; i < allWorkers.size(); i++) { 
            System.out.println(allWorkers.get(i).getInfo());
        }
        return allWorkers;
    } 
}
