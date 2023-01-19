package HWork_Les_5.Core.Operations;

import java.util.ArrayList;
import HWork_Les_5.Core.Data.Base;

public class OutPO { //** Вывод базы сотрудников Производственного отдела */
    public static EnterBase enterBase = new EnterBase();

    public static ArrayList<Base> printBase() throws Exception {
        ArrayList<Base> allWorkers = enterBase.getArrayWorkers();
        for (int i = 0; i < allWorkers.size(); i++) { 
            if (allWorkers.get(i).getSubdivision() == "Производственный отдел"){
                System.out.println(allWorkers.get(i).getInfo());
            }
        }
        return allWorkers;
    }
}
