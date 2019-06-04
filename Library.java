/**
 * @author albertyen
 *
 */
public class Library {
	
	Book[] unsorted = new Book[7];
	int sortedsize = 0; //The number of books in the sorted array;
	int dups = 0; //The number of duplicate books;
	int unsortedsize = 0;
	
	//This will create a new instance of the Book class, and added to the unsorted array of books;
	public void inputBook(String title, String author, String subject, long ISBN)
	{
		Book newbook = new Book(title, author, subject, ISBN);
		unsorted[unsortedsize] = newbook;
		unsortedsize++;
	}
	
	//This will return the number of books in the sorted array.
	public int getSortedSize()
	{
		return sortedsize;
	}

	//This will display the data for each book in the sorted array for testing purposes.
	public void display()
	{
		for (int i=0; i<sortedsize; i++) 
		{
			System.out.println(unsorted[i].toString());
		}
	}

	//This will sort the array of books in the Library class;
	//Duplicates will be removed;
	//The variable 'dups' will be incremented by 1 to keep track of duplicates removed;
	public int bookSort(Book[] v)
	{
		if (v.length > 1) {
	      int n1 = v.length/2;
	      int n2 = v.length - n1;
	      Book[] left = new Book[n1]; 
	      Book[] right = new Book[n2];
	      System.arraycopy(v, 0, left, 0, n1); 
	      System.arraycopy(v, n1, right, 0, n2);
	      bookSort(left);
	      bookSort(right);
	      Merge(v, left, right);
	   }
		return dups;
	}

	public void Merge(Book[] arr, Book[] left, Book[] right)
	{
	   int p, p1, p2;
	   p = p1 = p2 = 0;
	   
	   
	   while (p1 < left.length && p2 < right.length) 
	   { 
		   if(left[p1].compareTo(right[p2]) == -1)
	       { 
	         arr[p++]= left[p1++];   
	       }
	       
		   
	       else if (left[p1].compareTo(right[p2]) == 1)
	       {
	    	   	arr[p++]= right[p2++];
	       }
	       
	       else
	       {
	    	   	p1++;
	        dups++;
	       }
	   }
	   
	   while (p1 < left.length)
	   {
	       
	       arr[p++]= left[p1++];
	   }
	   
	   while (p2 < right.length)
	   {
	       
	      arr[p++]=right[p2++];
	   }
	   sortedsize = p;
	   unsorted = arr;
	 }
	


}