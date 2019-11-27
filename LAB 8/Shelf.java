import java.util.*;
import java.io.*;

public class Shelf {
	private String category;
	private List<Book> books;
	private int capacity;

	public Shelf​(String category,int capacity) {
		this.category = category;
		this.capacity = capacity;
		books = new ArrayList<Book> ();
	}

	public String getCategory() {
		return category;
	}

	public Book getBooks​(int id) {
		for(int i=0;i<books.size();i++) {
			if(this.books.get(i).getId()==id)
				return this.books.get(i);
		}
		return null;
	}

	public boolean addBook​(String name, String author,int id) {
		Book x = new Book(name,author,id); 							// Creating object of the book to be added

		if(books.size()<capacity) {
			for(int i=0;i<books.size();i++) {
				if(this.books.get(i).equals(x))
					return false;
				
			}
			books.add(x);
			return true;
		}
		else
			return false;
	}

	public boolean addBook​(Book book) {
		if(books.size()<capacity) {
			for(int i=0;i<books.size();i++) {
				if(this.books.get(i).equals(book))
					return false;
				
			}
			books.add(book);
			return true;
		}
		else
			return false;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getNumBooks() {
		return books.size();
	}

	public Boolean organize() {
		Collections.sort(books);
		return true;
	}

	public Boolean isRedundant​(Shelf shelf) {
		if(shelf.books.containsAll(books))
			return true;
		else
			return false;
	}

	public java.util.List<Book> getBooks() {
		return books;
	}
}
