import java.util.*;
import java.io.*;

public class Book extends java.lang.Object implements java.lang.Comparable<Book> {
	public static HashMap<Book,Shelf> bookToShelf;
	private int id;
	private String name;
	private String author;

	public Book(String name, String author,int id) {
		this.name =  name;
		this.id = id;
		this.author = author;
		bookToShelf = new HashMap<Book,Shelf> ();
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int compareTo(Book obj) {
		if(this.id==obj.id)
			return 0;

		else if(this.id>obj.id)
			return 1;

		else
			return -1;
	}

	public boolean equals​(Book obj) {
		if(this.id==obj.id && this.name==obj.name && this.author==obj.author)
			return true;

		else 
			return false;
	}

	public Shelf getShelf() {
		return Book.bookToShelf.get(this);
	}

}
