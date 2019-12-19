public class Race {
	private Team[] teams;
	private String raceType;
	private int numTeams;
	public static final int MAX_TEAMS=10;

	public Race(String raceType) {
		teams = new Team[MAX_TEAMS];
		this.raceType = raceType;
		numTeams = 0;
	}

	public boolean addTeam(Team team) {
		if(numTeams<MAX_TEAMS && team.verifyValidity(raceType)) {
			team.getDriver().participateInNewRace();
			teams[numTeams] = team;
			numTeams+=1;
			return true;
		}
		else
			return false;
	}

	public Team findWinner() {
		int i,temp=0,largest=-1;
		for(i=0;i<numTeams;i++) {
			if(teams[i].getTeamSkill() >largest) {
				temp = i;
				largest = teams[i].getTeamSkill();
			}
		}
		return teams[temp];
	}
}
