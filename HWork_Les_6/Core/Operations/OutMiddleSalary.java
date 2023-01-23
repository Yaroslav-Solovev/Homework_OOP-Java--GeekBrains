package HWork_Les_6.Core.Operations;

import java.util.ArrayList;
import HWork_Les_6.Core.Data.Base;
import HWork_Les_6.Core.Data.EnterBase;

public class OutMiddleSalary { //** Вывод средне-арифметического значения по зарплатам*/
    public static EnterBase enterBase = new EnterBase();

    public static void middleSalary() throws Exception {
        Integer sum = 0;
        Integer allSalary = 0;
        ArrayList<Base> allWorkers = enterBase.getArrayWorkers();
        for (int i = 0; i < allWorkers.size(); i++) { 
            sum += allWorkers.get(i).getSalary();
            allSalary = i+1;
        }
        Double result = (double) (sum/allSalary);
        // System.out.println("allSalary: " + allSalary); //** Код проверки*/
        // System.out.println("sum: " + sum); //** Код проверки*/
        System.out.println("Среднее арифметическое значение по зарплатам: " + result);
    } 
}