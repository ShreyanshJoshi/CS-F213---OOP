import java.util.*;
import java.io.*;

public class Library {
	private String name;
	private int maxShelves;
	private List<Shelf> shelvesList;

	public Library​(String name,int capacity) {
		this.name = name;
		this.maxShelves = capacity;
		shelvesList = new ArrayList<Shelf>();
	}

	public boolean addShelf​(String category, int capacity) {
		Shelf x = new Shelf(category,capacity);
		
		if(shelvesList.size()<maxShelves) {
			shelvesList.add(x);
			return true;
		}
		else
			return false;
	}
	public int getNumBooks() {
		int sum=0;
		for(int i=0;i<shelvesList.size();i++) {
			sum+=this.shelvesList.get(i).getNumBooks();
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public int getMaxShelves() {
		return maxShelves;
	}

	public List<Shelf> getShelvesList() {
		return shelvesList;
	}

	public Set<Shelf> searchBook​(String name) {
		Set<Shelf> x = new HashSet<Shelf>();

		for(int i=0;i<shelvesList.size();i++) {
			Shelf b = shelvesList.get(i);

			for(int j=0;j<b.getBooks().size();j++) {
				if(b.getBooks().get(j).getName()==name) {
					x.add(b);
					break;
				}
			}
		}
		return x;	
	}

	public Shelf getShelf​(java.lang.Integer i) {
		return shelvesList.get(i);
	}
	public java.lang.Integer getNumShelves() {
		return shelvesList.size();
	}
}
