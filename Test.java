/**
 * @author albertyen
 *This class will hold the main method;
 *An instance of the Library class will created;
 *Several books will be added using the inputBook method to the Library instance, called 'newLibrary.';
 *There will be 2 duplicates, which will be deleted;
 *The bookSort method will sort the books by ISBN number, which is a long type;
 *The display method will display the books' info;
 */
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//This will create a new instance of the Library class, named variable 'newLibrary';
		Library newLibrary = new Library();
		
		newLibrary.inputBook("The Better Angels of Our Nature", "Steven Pinker", "Civilization Studies", 1234567897777L);
		newLibrary.inputBook("Einstein", "Walter Isaacson", "Biography", 1234567891111L);
		newLibrary.inputBook("Broke Genius", "Joel Shurkin", "Biography", 1234567892222L);
		newLibrary.inputBook("Leonardo da Vinci", "Walter Isaacson", "Biography", 1234567893333L);
		//Einstein by Walter Issacson is the first duplicate book that got removed;
		newLibrary.inputBook("Einstein", "Walter Isaacson", "Biography", 1234567891111L);
		newLibrary.inputBook("Origin Story", "David Christian", "Civilization Studies", 1234567895555L);
		//Broke Genius by Joel Shurkin is the second duplicate book that got removed;
		newLibrary.inputBook("Broke Genius", "Joel Shurkin", "Biography", 1234567892222L);

		
		//This will sort the library by ISBN number;
		int duplicates = newLibrary.bookSort(newLibrary.unsorted);
		
		//Einstein by Walter Issacson and Broke Genius by Joel Shurkin are two duplicates in the library;
		//Both were removed, and this will return the number 2, which represents 2 duplicates that were moved;
		//duplicates will be stored with the int value 1;
		System.out.println(duplicates);
		newLibrary.display();
	}

}
