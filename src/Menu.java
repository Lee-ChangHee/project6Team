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



}
