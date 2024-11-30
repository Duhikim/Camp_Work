package interfaceEx;
public class MemberDTO {
	// 멤버 필드
	private Long memId;
	private String memName;
	
	// 생성자
	public MemberDTO(Long memId, String memName) {
		this.memId = memId;
		this.memName = memName;
	}

	// Getters & Setters
	public Long getMemId() {
		return memId;
	}

	public void setMemId(Long memId) {
		this.memId = memId;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	@Override
	public String toString() {

		return "MemberDTO [memId = " + memId + ", memName = " + memName + "]";
		//return super.toString();
	}
		
	
}