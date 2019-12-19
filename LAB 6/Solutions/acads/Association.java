package acads;
public class Association extends java.lang.Object implements java.lang.Comparable<Association>, IAssociation {
	private String name;
	private String prez;
	private int memberCount;
	private int budget;
	private static final int MAX_NO_OF_MEMBERS = 1000;

	public Association​(String name,String prez,int memberCount) {
		this.name = name;
		this.prez = prez;
		this.memberCount = memberCount;
		budget = 0;
	}

	public String getName() {
		return name;
	}

	public String getPrez() {
		return prez;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public int compareTo​(Association assoc) {
		if(memberCount==assoc.getMemberCount())
			return 0;

		else if(memberCount>assoc.getMemberCount())
			return 1;

		else
			return -1;
	}

	public int calculateBudget() {
		budget = 20000 + calculateProjectBudget();
		return budget;
	}

	public int extraBudget() {
		return 20000-10000;
	}

	public int calculateProjectBudget() {
		return 3000*memberCount;
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
