public class Book extends LibraryItem implements Comparable <Book>{

    private String title;
    private String author;
    private String isbn;

    /*
     * Constructs a book object
     */
    
    public Book(String title, String author, String isbn, int year) {
        super(year);
    	this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    /*
     * Returns the title of the book
     */
    public String getTitle()
    {
        return title;
    }
    
    /*
     * Returns the author of the book
     */
    public String getAuthor()
    {
        return author;
    }
     
    /*
     * Returns the ISBN of the book
     */
    public String getIsbn()
    {
        return isbn;
    }
    
    /*
     * Sets the title of the book
     */
    public void setTitle(String title)
    {
        this.title=title;
    }
    
    /*
     * Sets the author of the book
     */
    public void setAuthor(String author)
    {
       this.author=author;
    }
    
    /*
     * Sets the ISBN of the book
     */
    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }
   
    /**
     * Compares two books to check if they are the same. 
     * Two books are the the same if they have the same ISBN number.
     */
    public boolean equals(Book b) {
    	return isbn.equals(b.isbn);
      }
      

    @Override
    /*
     * This is where we write the logic to sort. This method sort the books
     * automatically by the ISBN numbers
     */
    public int compareTo(Book b){
       return this.isbn.compareTo(b.isbn);
    }
    
    
    @Override
    public String toString()
    {
    	String r = String.format("Title: %-40s Author: %-40s ISBN: %-40s", title, author, isbn); 
    	return r;
    }
    
    
}