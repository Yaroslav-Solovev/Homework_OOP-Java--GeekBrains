package HWork_Les_5.Core.Operations;

import java.util.Scanner;

public class EnterConsole {
    
    static Scanner scanner = new Scanner(System.in);
    
    public String getLine() throws Exception {
        String world;
        if (scanner.hasNextLine()) {
            world = scanner.nextLine();
        } else {
            System.out.println("Error: Вы ввели не слово!");
            scanner.next();
            world = scanner.nextLine();
        }
        return world;
    }

    public int getInt() throws Exception {
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Error: Вы ввели не число!");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static void main(String[] args) throws Exception {
        EnterConsole enterConsole = new EnterConsole();
        enterConsole.getLine();
        enterConsole.getInt();
    } 
}