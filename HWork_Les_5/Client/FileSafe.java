package HWork_Les_5.Client;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import HWork_Les_5.Core.Data.Base;
import HWork_Les_5.Core.Operations.EnterBase;

public class FileSafe {
    
    public static EnterBase enterBase = new EnterBase();
    
    public static void fileSafe() throws Exception{
        
        try (FileWriter fw = new FileWriter("baseWorkers.txt", false)) {
            ArrayList<Base> allWorkers = enterBase.getArrayWorkers();
            for (int i = 0; i < allWorkers.size(); i++) { 
                fw.append(allWorkers.get(i).getInfo());
                fw.append('\n');
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    } 
}
