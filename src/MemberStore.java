import java.util.HashMap;
import java.util.Map;

class MemberStore implements IMemberStore{
	
	static Map<String, MemberVO> store = new HashMap<>();
	// store�� ����� �� key�� MemberId
	public void save(MemberVO member) {
		store.put(member.getId(),member);
	}
	
	public MemberVO showMyPage(String memberId) {
		return store.get(memberId);
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
}
