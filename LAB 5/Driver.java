public class Driver extends RacePerson {
	private int points;
	private int numRacesParticipated;
	public static final int MAX_RACES=20;
	public static final int MIN_AGE=20;
	public static final int MIN_POINTS=5;

	public Driver(String name, int age, int ID, int points, int numRacesParticipated) {
		super(name,age,ID);
		this.points = points;
		this.numRacesParticipated = numRacesParticipated;
		calculateSkill();
	}

	public void participateInNewRace() {
		numRacesParticipated+=1;
		calculateSkill();
	}

	public boolean verifyValidity() {
		if(age>=MIN_AGE && (points>=MIN_POINTS && numRacesParticipated<MAX_RACES))
			return true;
		else
			return false;
	}

	public void calculateSkill() {
		skill =(points*100)/numRacesParticipated;
	}

	public String getInfo() {
		return toString()+"\n"+"Points : "+points+"\n"+"No. of races attempted : "+ numRacesParticipated;
	}

}
