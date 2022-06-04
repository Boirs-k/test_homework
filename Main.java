import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        int stepTarget = 10000;
        while (true){
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1){
                chooseMonth();
                int choosenMonth = scanner.nextInt();
                System.out.println("Введите дату");
                int choosenDay = scanner.nextInt();
                System.out.println("Введите количество шагов");
                int steps = scanner.nextInt();
                stepTracker.changeSteps(choosenMonth, choosenDay, steps);
            } else if (userInput == 2){
                chooseMonth();
                int choosenMonth = scanner.nextInt();
                stepTracker.trackerStat(choosenMonth, stepTarget);
            } else if (userInput == 3){
                System.out.println("Нынешняя цель по шагам:" + stepTarget + " шагов. Введите новую цель");
                int stepTargetInp = scanner.nextInt();
                if (stepTargetInp >= 0) {
                    stepTarget = stepTargetInp;
                } else {
                    System.out.println("Некооректный ввод, цель по шагам осталась прежней");
                }
            } else if (userInput == 0){
                break;
            } else {
                System.out.println("Такая команда отсутсвует, введите одну из существующих команд!");
            }
        }
    }
    private static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1- Ввести количество шагов за определенный день");
        System.out.println("2- Напечатать статистику за определенный месяц");
        System.out.println("3- Изменить цель по количеству шагов в день");
        System.out.println("0- выйти из приложения");
    }
    private static void chooseMonth (){
        System.out.println("Введите число, которое соответсвует необходимому месяцу");
        System.out.println("0- Январь");
        System.out.println("1- Февраль");
        System.out.println("2- Март");
        System.out.println("3- Апрель");
        System.out.println("4- Май");
        System.out.println("5- Июнь");
        System.out.println("6- Июль");
        System.out.println("7- Август");
        System.out.println("8- Сентябрь");
        System.out.println("9- Октябрь");
        System.out.println("10 - Ноябрь");
        System.out.println("11- Декабрь");
    }
}