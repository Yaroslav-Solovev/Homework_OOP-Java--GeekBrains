package HWork_Les_5.Core.Operations;

import java.util.ArrayList;

import HWork_Les_5.Core.Data.Base;

public class FindWorker {
    public static EnterBase enterBase = new EnterBase();
    public static EnterConsole enterConsole = new EnterConsole();

    public static ArrayList<Base> printBase() throws Exception { //** Вывод данных о сотруднике по поиску */
        System.out.println("Введите фамилию сотрудника: ");
        String surnameWorker = new String (enterConsole.getLine());
        ArrayList<Base> allWorkers = enterBase.getArrayWorkers();
        for (int i = 0; i < allWorkers.size(); i++) { 
            // if (allWorkers.get(i).getSurnameWorker().equalsIgnoreCase(surnameWorker) == true){
            //     System.out.println(allWorkers.get(i).getInfo());
            // }
            String nameWorkerBase = new String (allWorkers.get(i).getSurnameWorker());
            if (surnameWorker.equalsIgnoreCase(nameWorkerBase) == true){
                System.out.println(allWorkers.get(i).getInfo());
            }
        }
        return allWorkers;
    }
}
