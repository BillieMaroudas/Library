import java.util.ArrayList; 
import java.util.Collections;


public class LibraryCatalogue {
	static ArrayList<LibraryItem> ItemsList = new ArrayList<LibraryItem>();
	static ArrayList<LibraryItem> onLoan = new ArrayList<LibraryItem>();

	
	/*
     * Constructor
     */
    public LibraryCatalogue() {
		super();
	}

    /*
     * Add a new book to the catalogue given a title, author, ISBN and year published.
     */
	public static boolean addBook(String title, String author, String isbn, int year) {
		return ItemsList.add(new Book(title, author, isbn, year));

	}	
	
	
    /*
     * Add a new DVD to the catalogue given a title, director and year published.
     */
	public static boolean addDVD(String title, String director, int year) {
		return ItemsList.add(new DVD(title, director, year));
	}	
	
	/*
     * Create a list with the items that are on loan
     */
	public void loanItem(String idNumber) {
		for(int i=0;i<ItemsList.size();i++)
        {
			if(ItemsList.get(i).getIdNumber().equals(idNumber)) {
				if(ItemsList.get(i).on_loan=true) {		
					onLoan.add(ItemsList.get(i));
				}
			}

        }	
	}
	
	/*
     * Return the  number of library items which are out on loan
     */
	public static int onLoanNumber() {
		return onLoan.size();
	}	
	
	/*
     * Return the total number of library items in the catalogue
     */
	public static int totalNumber() {
		return ItemsList.size();
	}	

    /*
     * Remove a library item from the Catalogue given the ID
     */
	public static void removeItem(String idNumber) {
        boolean itemFound=false;
		for(int i=0;i<ItemsList.size();i++)
        {
			if(ItemsList.get(i).getIdNumber().equals(idNumber)) {
				ItemsList.remove(i);
				itemFound = true;
			}
		}
        if(!itemFound)
        	System.out.println("\nThere is no such library item");
	}
	

	/**
	   * Test program 
	   */
	  public static void main(String[] args) {
		LibraryCatalogue lib = new LibraryCatalogue();
	    
	  
	    lib.addDVD("Adams", "Liftarens guide till galaxen", 38);
	    lib.addDVD("Adams", "Liftaren", 39);
	    lib.addBook("Adams", "Liftarens guide till galaxen", "77", 38);


	    System.out.println(lib.totalNumber());
	    
	    lib.removeItem("L-1");
	    lib.loanItem("L-2");

	    System.out.println(lib.totalNumber());
	    System.out.println(lib.onLoanNumber());



}
}
