package interfaceEx;

public class MemberMain {

	public static void main(String[] args) {
		MemberDTO dto = new MemberDTO(1L, "David");
		
		MemberController c = new MemberController();
		c.insertMember(dto);

	}

}
