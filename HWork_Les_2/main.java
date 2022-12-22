package HWork_Les_2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);
    
    ArrayList<Human> Family;
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
    public static ArrayList<Human> getArrayFamily(){
        Human Homer = new Human(1, "Homer", "Male", 30, "Nuclear scientist", "Simson","Father");
        Human Marge = new Human(2, "Marge", "Female", 24, "Housewife", "Simson", "Mother");
        Human Bart = new Human(3, "Bart", "Male", 16, "Schoolboy", "Simson", "Brother");
        Human Lisa = new Human(4, "Lisa", "Female", 12, "Schoolgirl", "Simson", "Sister");
        Human Meggie = new Human(5, "Meggie", "Female", 4, "Kindergarten","Simson", "Sister");
        Human Piter = new Human(6, "Piter", "Male", 30, "Worker", "Family Guy","Father");
        Human Lois = new Human(7, "Lois", "Female", 24, "Housewife", "Family Guy", "Mother");
        Human Chris = new Human(8, "Chris", "Male", 16, "Schoolboy", "Family Guy", "Brother");
        Human Meg = new Human(9, "Meg", "Female", 14, "Kindergarten", "Family Guy", "Sister");
        Human Stewie = new Human(10, "Stewie", "Male", 16, "Schoolboy", "Family Guy", "Brother");
        
        ArrayList<Human> Family = new ArrayList<Human>();
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

    // // Поиск по критерию - член семьи
    // public static void findFamilyMember(ArrayList<Human> Family) throws Exception{
    //     System.out.println("Выбирите критерий поиска: 1. Отец; 2. Мать; 3. Брат; 4. Сестра.");
    //     int search = getInt();
    //     if (search == 1 | search == 2 | search == 3 | search == 4){
    //         for (int i = 0; i < Family.size(); i++) {
    //             if (search == 1 && Family.get(i).getMemberFamily() == "Father"){
    //                 System.out.println(Family.get(i).getInfo());
    //             }
    //             if (search == 2 && Family.get(i).getMemberFamily() == "Mother"){
    //                 System.out.println(Family.get(i).getInfo());
    //             }
    //             if (search == 3 && Family.get(i).getMemberFamily() == "Brother"){
    //                 System.out.println(Family.get(i).getInfo());
    //             }
    //             if (search == 4 && Family.get(i).getMemberFamily() == "Sister"){
    //                 System.out.println(Family.get(i).getInfo());
    //             }
    //         }
    //     }
    //     else{
    //         System.out.println("Список пуст.");
    //     }      
    // }

    public static ArrayList<String> getArrayActions() throws Exception{
        ArrayList<String> allActions = new ArrayList<String>();
        // allActions.add("speak");
        // allActions.add("do");
        allActions.add("yes");
        allActions.add("no");
        return allActions;
    }

    // public static String MemFamily1 () throws Exception{

    //     ArrayList<Human> Family = getArrayFamily();
    //     for (int i = 0; i < Family.size(); i++) {
    //         System.out.println(Family.get(i).getName());
    //     }
    //     System.out.println("Введите имя человека № 1: ");
    //     String enterNameHuman1 = getLine();
    //     String findMemberFamily1 = "Mother";
    //     for (int i = 0; i < Family.size(); i++) { 
    //         String name = Family.get(i).getName();
    //         if(name == enterNameHuman1){
    //             findMemberFamily1 = Family.get(i).getMemberFamily();
    //             if(findMemberFamily1 != "Mother"){
    //                 System.out.println("Это не мама!");
    //             }else{
    //                 findMemberFamily1 = Family.get(i).getMemberFamily();
    //             }
    //         }
    //     }
    //     return findMemberFamily1;
    // }

    // public static String MemFamily2() throws Exception{
    //     ArrayList<Human> Family = getArrayFamily();
    //     System.out.println("Введите имя человека № 2: ");
    //     String enterNameHuman2 = getLine();
    //     String findMemberFamily2 = "Father";
    //     for (int i = 0; i < Family.size(); i++) { 
    //         String name = Family.get(i).getName();
    //         if(name == enterNameHuman2){
    //             findMemberFamily2 = Family.get(i).getMemberFamily();
    //             if(findMemberFamily2 != "Father"){
    //                 System.out.println("Это не отец!");
    //             }else{
    //                 findMemberFamily2 = Family.get(i).getMemberFamily();
    //             }
    //         }
    //     }
    //     return findMemberFamily2;
    // }

    public static String getOpenDoor() throws Exception{

        String Father = "Homer: ";
        String Mother = "Marge: ";
        // ArrayList<String> allActions = getArrayActions();
        // System.out.println("Список действий: " + allActions);
        // System.out.println("Введите действие: ");
        System.out.printf(Father);
        Father father = new Father();
        Mother mother = new Mother();
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
            case "sleep":
                System.out.printf(Mother);
                mother.nothing();
            // default:
            //     System.out.printf("Вы решили ничего не делать.");
            }
            return action;  

    }


    public static void main(String[] args) throws Exception {
        ArrayList<Human> Family = getArrayFamily();
        // for (int i = 0; i < Family.size(); i++) { // Проверка вывода всего списка людей
        //     System.out.println(Family.get(i).getInfo());
        // }
        ArrayList<String> allActions = getArrayActions();

        // findFamilyMember(Family); // Поиск по критерию - член семьи

        getOpenDoor(); // Выполнение программы по выполнению действий
    }
}