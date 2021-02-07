import java.util.HashMap;
import java.util.Map;

class MemberStore implements IMemberStore{
	
	static Map<String, MemberVO> store = new HashMap<>();
	// store�� ����� �� key�� MemberId
	public void save(MemberVO member) {
		store.put(member.getId(),member);
	}


	public void showMyPage(String memberId) {
		MemberVO memberVO = new MemberVO(null, null, null, null);
		memberVO = store.get(memberId);
		System.out.println("MY PAGE \n"
				+"NAME : " + memberVO.getName()
				+"ID : " + memberVO.getId()
				+"PASSWORD : " + memberVO.getPassword()
				+"PHONENUMBER : " + memberVO.getPhoneNumber());

	}

	public int check(String chId) {		
		if(store.containsKey(chId)) {
			return 1;						//�Է��� ID�� key������ �����Ѵٸ� 1�� ����
		}
		else {
			return 0;						//�Է��� ID�� key������ �������� �ʴ´ٸ� 2�� ����
		}
	}
	public void chMember(String chId,String chPw ,String chName ,String chPn) {
		MemberVO mv = new MemberVO(chName,chPw,chId,chPn);
		store.replace(chId, mv);
		
	}

	public boolean Login(String id, String password,MemberVO memberVO) {

		boolean bool;
		if(memberVO.getId() == id && memberVO.getPassword() == password) {
			System.out.println("로그인 성공");
			bool = true;
		}else {
			System.out.println("로그인 실패");
			bool = false;
		}
		return bool;
	}
}
