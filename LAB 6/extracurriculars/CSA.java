package extracurriculars;
public class CSA {
	private Organization[] orgList;
	private int orgCount;
	private static final int MAX_NO_OF_ORGANIZATIONS=30;

	public CSA() {
		orgList = new Organization[MAX_NO_OF_ORGANIZATIONS];
		orgCount = 0;
	}

	public boolean createNewOrganization​(Organization o) {
		if(orgCount<MAX_NO_OF_ORGANIZATIONS) {
			orgList[orgCount] = o;
			orgCount+=1;
			return true;
		}
		else
			return false;
	}

	public int allocateBudget() {
		int i,sum=0;
		for(i=0;i<orgCount;i++)
			sum+=orgList[i].calculateBudget();

		return sum;
	}

}
