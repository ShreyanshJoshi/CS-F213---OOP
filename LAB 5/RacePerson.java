public abstract class RacePerson {
	protected String name;
	protected int age;
	protected int ID;
	protected int skill;

	public RacePerson(String name, int age,int ID) {
		this.name = name;
		this.age = age;
		this.ID = ID;
	} 

	public int getSkill() {
		return skill;
	}

	public abstract boolean verifyValidity();
	public abstract void calculateSkill();
	public abstract String getInfo();
	public String toString() {
		return ID+" "+name+" ("+age+" yrs)";
	}

}
