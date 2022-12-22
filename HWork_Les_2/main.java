package HWork_Les_2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    
    ArrayList<Family> Family;
    ArrayList<String> allActions;

    // Проверка на ввод с консоли на ошибку
    public static int getInt() throws Exception {
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
    public static String getLine() throws Exception {
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
    
    // Метод формирования списка людей
    public static ArrayList<Family> getArrayFamily(){
        Family Homer = new Family(1, "Homer", "Male", 30, "Nuclear scientist", "Simson","Father");
        Family Marge = new Family(2, "Marge", "Female", 24, "Housewife", "Simson", "Mother");
        Family Bart = new Family(3, "Bart", "Male", 16, "Schoolboy", "Simson", "Brother");
        Family Lisa = new Family(4, "Lisa", "Female", 12, "Schoolgirl", "Simson", "Sister");
        Family Meggie = new Family(5, "Meggie", "Female", 4, "Kindergarten","Simson", "Sister");
        Family Piter = new Family(6, "Piter", "Male", 30, "Worker", "Family Guy","Father");
        Family Lois = new Family(7, "Lois", "Female", 24, "Housewife", "Family Guy", "Mother");
        Family Chris = new Family(8, "Chris", "Male", 16, "Schoolboy", "Family Guy", "Brother");
        Family Meg = new Family(9, "Meg", "Female", 14, "Kindergarten", "Family Guy", "Sister");
        Family Stewie = new Family(10, "Stewie", "Male", 16, "Schoolboy", "Family Guy", "Brother");
        
        ArrayList<Family> Family = new ArrayList<Family>();
        Family.add(Homer);
        Family.add(Marge);
        Family.add(Bart);
        Family.add(Lisa);
        Family.add(Meggie);
        Family.add(Piter);
        Family.add(Lois);
        Family.add(Chris);
        Family.add(Meg);
        Family.add(Stewie);
        return Family;
    }

    // Поиск по критерию - член семьи
    public static void findFamilyMember(ArrayList<Family> Family) throws Exception{
        System.out.println("Выбирите критерий поиска: 1. Отец; 2. Мать; 3. Брат; 4. Сестра.");
        int search = getInt();
        if (search == 1 | search == 2 | search == 3 | search == 4){
            for (int i = 0; i < Family.size(); i++) {
                if (search == 1 && Family.get(i).getMemberFamily() == "Father"){
                    System.out.println(Family.get(i).getInfo());
                }
                if (search == 2 && Family.get(i).getMemberFamily() == "Mother"){
                    System.out.println(Family.get(i).getInfo());
                }
                if (search == 3 && Family.get(i).getMemberFamily() == "Brother"){
                    System.out.println(Family.get(i).getInfo());
                }
                if (search == 4 && Family.get(i).getMemberFamily() == "Sister"){
                    System.out.println(Family.get(i).getInfo());
                }
            }
        }
        else{
            System.out.println("Список пуст.");
        }      
    }

    public static ArrayList<String> getArrayActions() throws Exception{
        ArrayList<String> allActions = new ArrayList<String>();
        // allActions.add("speak");
        // allActions.add("do");
        allActions.add("yes");
        allActions.add("no");
        allActions.add("oops");
        return allActions;
    }

    public static String MemFamily1 () throws Exception{

        ArrayList<Family> Family = getArrayFamily();
        for (int i = 0; i < Family.size(); i++) {
            System.out.println(Family.get(i).getName());
        }
        System.out.println("Введите имя человека № 1: ");
        String enterNameHuman1 = getLine();
        String findMemberFamily1 = "Mother";
        for (int i = 0; i < Family.size(); i++) { 
            String name = Family.get(i).getName();
            if(name == enterNameHuman1){
                findMemberFamily1 = Family.get(i).getMemberFamily();
                if(findMemberFamily1 != "Mother"){
                    System.out.println("Это не мама!");
                }else{
                    findMemberFamily1 = Family.get(i).getMemberFamily();
                }
            }
        }
        return findMemberFamily1;
    }

    public static String MemFamily2() throws Exception{
        ArrayList<Family> Family = getArrayFamily();
        System.out.println("Введите имя человека № 2: ");
        String enterNameHuman2 = getLine();
        String findMemberFamily2 = "Father";
        for (int i = 0; i < Family.size(); i++) { 
            String name = Family.get(i).getName();
            if(name == enterNameHuman2){
                findMemberFamily2 = Family.get(i).getMemberFamily();
                if(findMemberFamily2 != "Father"){
                    System.out.println("Это не отец!");
                }else{
                    findMemberFamily2 = Family.get(i).getMemberFamily();
                }
            }
        }
        return findMemberFamily2;
    }

    public static String getOpenDoor() throws Exception{

        String Father = "Homer: ";
        String Mother = "Marge: ";
        String Child = "Meggie: ";
        // ArrayList<String> allActions = getArrayActions();
        // System.out.println("Список действий: " + allActions);
        // System.out.println("Введите действие: ");
        System.out.printf(Father);
        Father father = new Father();
        Mother mother = new Mother();
        Child child = new Child();
        father.speak();
        System.out.println("Введите действие: ");
        String action = getLine();
        switch (action){
            case "yes":
                System.out.printf(Mother);
                mother.speak();
                System.out.printf(Father);
                father.makeDo();
                break;
            case "no":
                System.out.printf(Mother);
                mother.makeDo();
                break;
            case "oops":
                System.out.printf(Child);
                child.speak();
                break;
            default:
                System.out.printf("Вы решили ничего не делать.");
            }
            return action;  

    }

    public static void main(String[] args) throws Exception {
        ArrayList<Family> Family = getArrayFamily();
        for (int i = 0; i < Family.size(); i++) { // Проверка вывода всего списка людей
            System.out.println(Family.get(i).getInfo());
        }
        ArrayList<String> allActions = getArrayActions();

        // findFamilyMember(Family); // Поиск по критерию - член семьи

        getOpenDoor(); // Выполнение программы по выполнению действий
    }
}