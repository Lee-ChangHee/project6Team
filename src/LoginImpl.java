import java.util.HashMap;
<<<<<<< HEAD
=======
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
>>>>>>> refs/remotes/origin/master

public class LoginImpl implements ILogIn{
	HashMap<String, MemberVO> store = new HashMap<String, MemberVO>();
	@Override
	public boolean Login(String id, String password) {
<<<<<<< HEAD

=======
		
>>>>>>> refs/remotes/origin/master
		boolean bool;
		if(store.containsKey(id)) {
			System.out.println("로그인 성공");
			bool = true;
		}else {
			System.out.println("로그인 실패");
			bool = false;
		}
		return bool;
	}

<<<<<<< HEAD

=======
	
>>>>>>> refs/remotes/origin/master
	@Override
	public MemberVO findMyPage(String id) {

		return null;
	}

}
