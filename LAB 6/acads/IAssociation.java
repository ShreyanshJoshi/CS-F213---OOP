package acads;
import extracurriculars.Organization;
public interface IAssociation extends Organization {
	static final int BASE_BUDGET=20000;

	int calculateProjectBudget();
}
