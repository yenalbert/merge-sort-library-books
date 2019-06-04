/**
 * 
 */

/**
 * @author albertyen
 *
 */
public class Book implements Comparable<Book> {

	String Title;
	String Author;
	String Subject;
	long ISBN;
	
	//The book constructor will take 4 parameters;
	public Book (String Title, String Author, String Subject, long ISBN)
	{
		this.Title = Title;
		this.Author = Author;
		this.Subject = Subject;
		this.ISBN = ISBN;
	}
	
	@Override
	public int compareTo(Book Bk) {
		if (ISBN == Bk.ISBN)
		{
			return 0;
		}
		else if (ISBN > Bk.ISBN)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	
	//This will return the book's 4 variables - title, author, subject, and ISBN number (long, not integer);
	public String toString()
	{		
		return "Title is: " + this.Title + "; By: " + this.Author + "; Subject: " + this.Subject + "; ISBN: " + this.ISBN;
	}

	
}

