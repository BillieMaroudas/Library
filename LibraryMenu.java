import java.util.Scanner;


public class LibraryMenu {
	
	public static void displayMenu() {

        System.out.println("\n** Welcome to the Lirary **");
        System.out.println("-------------------------\n");
        System.out.println("Please select one of the following options:\n ");
        System.out.println("1 - Enter a new Book or a new DVD to the catalogue");
        System.out.println("2 - Remove a library item from the catalogue given the ID");
        System.out.println("3 - Print out details of all LibraryItems in the Catalogue");
        System.out.println("4 - Print out the number of LibraryItems which are out on loan");
        System.out.println("5 - Close the program");
	}
	

	

    public static void main(String[] args) {

        try
        {
	        Scanner scanner = new Scanner(System.in);
	        
	        int choice;
	
	        do{
	        	displayMenu();
	        
		        System.out.print("\nEnter a valid choice: ");
		
		        choice = scanner.nextInt();
		
		        switch (choice) {
		            case 1:
		                System.out.print("Please press 1 for book or 2 for DVD: ");
		                int selection = scanner.nextInt();
		                if (selection==1) {
		                	scanner.nextLine();  // Consume newline left-over
		                	System.out.print("\nEnter the title of the book: ");
		                    String bookTitle = scanner.nextLine();
		                    System.out.print("\nEnter the author of the book: ");
		                    String author = scanner.nextLine();
		                    System.out.print("\nEnter the ISBN of the book: ");
		                    String isbn = scanner.nextLine();
		                    System.out.print("\nEnter the year that the book was published: ");
		                    int bookYear = scanner.nextInt();
		                    LibraryCatalogue.addBook(bookTitle, author, isbn, bookYear);

		                }
		                else if (selection==2){
		                	scanner.nextLine();  // Consume newline left-over
		                	System.out.print("\nEnter the title of the DVD: ");
		                    String DVDtitle = scanner.nextLine();
		                    System.out.print("\nEnter the director of the DVD: ");
		                    String director = scanner.nextLine();
		                    System.out.print("\nEnter the year that the DVD was published: ");
		                    int DVDyear = scanner.nextInt();
		                    LibraryCatalogue.addDVD(DVDtitle, director, DVDyear);
		                }
		                else{
		                	System.out.print("Invalid Option. ");
		                }
		                break;
		            case 2:
		            	scanner.nextLine();  // Consume newline left-over
		            	System.out.print("Enter the ID of the library item you want to remove: ");
		                String id = scanner.nextLine();
		                LibraryCatalogue.removeItem(id);
		                break;
		            case 3:
		            	System.out.println(" ****Catalogue Items**** ");
		            	for(int i=0;i<LibraryCatalogue.totalNumber();i++)
		            		System.out.println(LibraryCatalogue.ItemsList.get(i));
		                break;
		            case 4:
		            	System.out.println("On Loan Items: " + LibraryCatalogue.onLoanNumber());
		                break;
		            case 5:
		            	System.out.print("\n** Thank you for visiting the Library **");
		             	break;
		            default:
		            	System.out.print("\nInvalid option. Please try again.");
		        	}
	        }while(choice != 5);
	       
	        scanner.close();
        } catch (Exception e)
        {
            System.out.println("Invalid Input");
        }


   }
}

