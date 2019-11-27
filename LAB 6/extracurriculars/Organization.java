package extracurriculars;
public interface Organization {
	static final int BASE_BUDGET = 10000;

	int calculateBudget();
	boolean addNewMember();
}
