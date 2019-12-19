package extracurriculars;
public class Department extends java.lang.Object implements Organization {
	private static String name;
	private int sessionCountPerWeek;
	private int budget;
	private int memberCount;
	private int maxMemberCount;

	public Department​(String name, int sessionCountPerWeek,int memberCount)  {
		this.name = name;
		this.sessionCountPerWeek = sessionCountPerWeek;
		this.memberCount = memberCount;
		budget = 0;
		maxMemberCount = 30*sessionCountPerWeek;
	}

	public static String getName() {
		return name;
	}

	public int getSessionCountPerWeek() {
		return sessionCountPerWeek;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public int calculateBudget() {
		budget = 5000*sessionCountPerWeek*memberCount;
		return budget;
	}

	public boolean addNewMember() {
		if(memberCount<maxMemberCount) {
			memberCount+=1;
			return true;
		}
		else
			return false;
	}
}
