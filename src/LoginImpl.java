import java.util.HashMap;

public class LoginImpl implements ILogIn{
	HashMap<String, MemberVO> store = new HashMap<String, MemberVO>();
	@Override
	public boolean Login(String id, String password) {

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


	@Override
	public MemberVO findMyPage(String id) {

		return null;
	}

}
