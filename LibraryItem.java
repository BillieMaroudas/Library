abstract public class LibraryItem {
	String idNumber;
	private int year;
	static boolean on_loan;
	
	static int serialNumber;
	static int currentSerialNumber = 1;


	/*
     * Constructs a LibraryItem object
     */
    
    public LibraryItem(int year) {
        this.year = year;
        on_loan = false;
	    idNumber = LibraryItem.generateIdNumber();
    }
    
    /*
     * Returns the unique ID of the library item
     */
    public String getIdNumber()
    {
        return idNumber;
    }
    
    /*
     * Returns the year that the item was published
     */
    public int getYear()
    {
        return year;
    }
    
    
    /*
     * Sets the year that the item was published
     */
    public void setYear(int year)
    {
        this.year=year;
    }
    
    /*
     * Generates unique ID of the form "L-2345"
     */
    static String generateIdNumber() 
    {
    	serialNumber = LibraryItem.currentSerialNumber;
	    LibraryItem.currentSerialNumber++;
	    String uniqueId = "L-"+serialNumber;
	   return uniqueId;
    }
    
    public String toString()
    {
    	String r = String.format("Year: %-40s ID Number: %-40s", year, idNumber); 
    	return r;
    }

    
}

