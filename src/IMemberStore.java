
public interface IMemberStore {
	
	public void save(MemberVO member);
	public void showMyPage(String memberId);
	public int check(String chId);
	public void chMember(String chId,String chPw ,String chName ,String chPn);

}

