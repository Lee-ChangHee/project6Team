import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public int menu(){
        System.out.printf("MENU \n"
                +"1. Login \n"
                +"2. SignUp\n"
                +"3. exit \n"
                +"> ");
        int menu;
        return menu = sc.nextInt();
    }

    public int menuMyPage(){
        System.out.printf("MENU \n"
                +"1. Change Properties  \n"
                +"2. EXIT\n"
                +"> ");
        int menu;
        return menu = sc.nextInt();
    }

}
