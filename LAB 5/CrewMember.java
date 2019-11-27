public class CrewMember extends RacePerson {
	private int experience;
	public static int MIN_AGE = 20;
	public static int MIN_EXPERIENCE = 2;

	public CrewMember(String name, int age, int ID, int experience) {
		super(name,age,ID);
		this.experience = experience;
		calculateSkill();
	}

	public boolean verifyValidity() {
		if(age>=MIN_AGE && experience>=MIN_EXPERIENCE)
			return true;
		else
			return false;
	}

	public void calculateSkill() {
		skill = (experience*100/age);
	}

	public String getInfo() {
		return toString()+"\n"+"Experience : "+experience;
	}

}
