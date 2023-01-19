package HWork_Les_5.Client;
import HWork_Les_5.Core.Views.View;
import HWork_Les_5.Core.Operations.OutAllWorkers;
import HWork_Les_5.Core.Operations.OutPO;
import HWork_Les_5.Core.Operations.FindWorker;
import HWork_Les_5.Core.Operations.OutAUP;
import HWork_Les_5.Core.Operations.OutMiddleSalary;

public class Menu {
    
    public static OutAllWorkers outAllWorkers = new OutAllWorkers();
    public static OutAUP outAUP = new OutAUP();
    public static OutPO outPO = new OutPO();
    public static FindWorker findWorker = new FindWorker();

    View ui;

    public Menu() {
        ui = new ConsoleView();
    }
    
    public void start() throws Exception {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Вывод всей базы сотрудников\n")
                .append("2 - Вывод Главного управления\n")
                .append("3 - Вывод Производственного отдела\n")
                .append("4 - Поиск сотрудника\n")
                .append("5 - Сохранение базы в файл\n")
                .append("6 - Среднее арифметическое значение по зарплатам\n")
                .append("0 - exit\n");
        
        while (true) {
            ui.set(sb.toString());
            switch (ui.get()) {
                case "1":
                    outAllWorkers.printBase();
                    break;
                case "2":
                    outAUP.printBase();
                    break;
                case "3":
                    outPO.printBase();
                    break;
                case "4":
                    findWorker.printBase();
                    break;
                case "5":
                    FileSafe.fileSafe();
                    break;
                case "6":
                    OutMiddleSalary.middleSalary();
                    break;
                case "0":
                    return;
                default:
                    return;
            }   
        }
    }
}
