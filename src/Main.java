import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        MemberService memberService = new MemberService();
        MemberStore memberStore = new MemberStore(); // 멤버값 메모리 저장
        Menu returnMenu = new Menu();

        // 메뉴 호출
        int menu = returnMenu.menu();

        switch (menu){
            case 1: // Login호출
                System.out.printf("id : ");
                String id = sc.next();
                System.out.printf("pw : ");
                String pw = sc.next();
                boolean login =
                break;
            case 2: //
                break;
            case 3:
                break;
        }
    }
}
