# merge-sort-library-books

Book class will hold data about an individual book:

Title;
Author;
Subject;
ISBN; 


Library Class Instance Data: 

Note: that the number of sorted books may be less than the number of unsorted books, so the sorted array will be only in the range from index 0 to the array's length - dups.

int sortedsize: The number of books in the sorted array.

int dups: The number of duplicate books.

Instance Methods:

inputBook method: This will create an instance of a book class and add it to the array.

getSortedSize method: This will return the number of books in the sorted array.

bookSort method:  This will sort the unsorted array of books using the merge sort algorithm introduced in the modules.  As the array is sorted, each book with a unique ISBN from the unsorted array should be placed in the sorted array in order.  Duplicates are allowed in the unsorted array but not in the sorted array. So, if a duplicate is found during the sort, count it by incrementing the dups variable, but do not include it in the sorted array.

When comparing two Books in the merge step, if the Book ISBNs are the same, pointer will be moved without loading that Book into the sorted array to skip it.

display method: This will display the data for each book in the sorted array for testing purposes.


Test Class:

This class will hold the main method. An instance of the Library class will be used to add several books using the inputBook method, including at least 2 duplicates. The bookSort method will sort the duplicates, then the display method will display the sorted Books. 
