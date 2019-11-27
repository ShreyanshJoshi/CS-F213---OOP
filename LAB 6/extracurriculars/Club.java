package extracurriculars;
public class Club extends java.lang.Object implements Organization {
	private static String name;
	private int eventCount;
	private int budget;
	private int memberCount;
	private static final int MAX_NO_OF_MEMBERS=40;

	public Club​(String name, int eventCount,int memberCount) {
		this.name = name;
		this.eventCount = eventCount;
		this.memberCount = memberCount;
		budget = 0;
	}

	public static String getName() {
		return name;
	}

	public int getEventCount() {
		return eventCount;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public int calculateBudget() {
		budget = 3000*eventCount*memberCount;
		return budget;
	}

	public boolean addNewMember() {
		if(memberCount<MAX_NO_OF_MEMBERS) {
			memberCount+=1;
			return true;
		}
		else
			return false;
	}
}	
