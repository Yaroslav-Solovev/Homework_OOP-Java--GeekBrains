package HWork_Les_4;

import java.util.ArrayList;
import java.util.Scanner;



public class main {
    
    static Scanner scanner = new Scanner(System.in);

    ArrayList<Family> Family;
    ArrayList<String> allActions;

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
        
        Printer printer = new Printer();
        String members[] = {"1. Отец;", "2. Мать;", "3. Брат;", "4. Сестра."};
        // System.out.println("Выбирите критерий поиска: 1. Отец; 2. Мать; 3. Брат; 4. Сестра.");
        System.out.println("Выбирите критерий поиска: ");
        printer.<String>print(members);
        EnterConsole enterConsole = new EnterConsole();
        int search = enterConsole.getInt();
        if (search == 1 | search == 2 | search == 3 | search == 4){
            for (int i = 0; i < Family.size(); i++) {
                if (search == 1 && Family.get(i).getMemberFamily().equalsIgnoreCase("Father") == true){
                    System.out.println(Family.get(i).getInfo());
                }
                if (search == 2 && Family.get(i).getMemberFamily().equalsIgnoreCase("Mother") == true){
                    System.out.println(Family.get(i).getInfo());
                }
                if (search == 3 && Family.get(i).getMemberFamily().equalsIgnoreCase("Brother") == true){
                    System.out.println(Family.get(i).getInfo());
                }
                if (search == 4 && Family.get(i).getMemberFamily().equalsIgnoreCase("Sister") == true){
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

    public static ArrayList<String> MemFamily() throws Exception{
        ArrayList<Family> Family = getArrayFamily();
        System.out.println("Введите имя человека: ");
        EnterConsole enterConsole = new EnterConsole();
        String enterNameHuman = enterConsole.getLine(); 
        ArrayList<String> nameMemberFamily = new ArrayList<String>();
        for (int i = 0; i < Family.size(); i++) { 
            String findNameHuman = Family.get(i).getName();
            if(findNameHuman.equalsIgnoreCase(enterNameHuman) == true){ 
                nameMemberFamily.add(enterNameHuman);
                nameMemberFamily.add(Family.get(i).getMemberFamily());
            }
        }
        return nameMemberFamily;
    }


    public static String getOpenDoor() throws Exception{
        // Вывод 1 члена семьи
        ArrayList<String> nameMemberFamily1 = MemFamily();
        String NameMemberFamily1 = nameMemberFamily1.get(0);
        String MemberFamily1 = nameMemberFamily1.get(1);
        // Вывод 2 члена семьи
        ArrayList<String> nameMemberFamily2 = MemFamily();
        String NameMemberFamily2 = nameMemberFamily2.get(0);
        String MemberFamily2 = nameMemberFamily2.get(1);
        
        ArrayList<String> allActions = getArrayActions();
        System.out.println("Список действий: " + allActions);
        Father father = new Father();
        Mother mother = new Mother();
        Child child = new Child();
        
        if (MemberFamily1.equalsIgnoreCase("Father") == true && MemberFamily2.equalsIgnoreCase("Mother") == true){
            System.out.printf(NameMemberFamily1);
            father.speak();
            System.out.println("Введите действие: ");
            EnterConsole enterConsole = new EnterConsole();
            String action = enterConsole.getLine();
            switch (action){
                case "yes":
                    System.out.printf(NameMemberFamily2);
                    mother.speak();
                    System.out.printf(NameMemberFamily1);
                    father.makeDo();
                    break;
                case "no":
                    System.out.printf(NameMemberFamily2);
                    mother.makeDo();
                    break;
                case "oops":
                    // System.out.printf(Child);
                    child.eat();
                    break;
                default:
                    System.out.printf("Вы решили ничего не делать.");
                }
                return action;  
        } else {
            System.out.println("Введите действие: ");
            EnterConsole enterConsole = new EnterConsole();
            String action = enterConsole.getLine();
            switch (action){
                case "yes":
                    System.out.printf(NameMemberFamily1);
                    System.out.printf(": Мяу!!!");
                    break;
                case "no":
                    System.out.printf(NameMemberFamily2);
                    System.out.printf(": Гав!!!");
                    break;
                case "oops":
                    // System.out.printf(Child);
                    System.out.printf(": System Error!");
                    break;
                default:
                    System.out.printf("Вы решили ничего не делать.");
                }
                return action;
            }

    }
  
    public static void main(String[] args) throws Exception{

        ArrayList<Family> Family = getArrayFamily();
        Printer printer = new Printer();
        String find[] = {"1. Поиск по критерию - член семьи;", "2. Выполнение действий членов семьи по открытию двери."};
        System.out.println("Выбирите критерий выполнения программы: ");
        printer.<String>print(find);
        EnterConsole enterConsole = new EnterConsole();
        String action = enterConsole.getLine();
        switch (action){
            case "1":
                findFamilyMember(Family); // Поиск по критерию - член семьи
                break;
            case "2":
                getOpenDoor(); // Выполнение программы по выполнению действий // Пример ввода: Homer - отец, Marge - мать;
                break;
            default:
                System.out.printf("Вы решили ничего не делать.");
            }

    }
}