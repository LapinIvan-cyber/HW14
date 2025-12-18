//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            String firstName = "Ivan";
            String middleName = "Ivanov";
            String lastName = "ivanovich";
            String fullName = "Ivanov Ivan Ivanovich";
            System.out.println("Ф.И.О сотрудника = " + fullName);

            String fullName1 = "Ivanov Ivan Ivanovich";
            String small = "Ivanov Ivan Ivanovich";
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета = " + small.toUpperCase());

            String fullName2 = "Иванов Семён Семёнович";
            fullName2 = fullName2.replace("ё", "е");
            System.out.println("Данные Ф. И. О. сотрудника = " + fullName2);











        }
    }
}