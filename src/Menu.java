import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);


    public int menu(){
        System.out.printf("메뉴 입력 \n "
        +"1. Login  호출 \n"
        +"2. SignUp 호출 \n"
        +"3. exit \n"
        +"> ");
        int menu;
        return menu = sc.nextInt();
    }



}
