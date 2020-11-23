public class DVD extends LibraryItem{

    private String title;
    private String director;

    /*
     * Constructs a DVD object
     */
    
    public DVD(String title, String director, int year) {
        super(year);
        this.title = title;
        this.director = director;

    }

    /*
     * Returns the title of the DVD
     */
    public String getTitle()
    {
        return title;
    }
    
    /*
     * Returns the director of the DVD
     */
    public String getDirector()
    {
        return director;
    }
     
    
    /*
     * Sets the title of the DVD
     */
    public void setTitle(String title)
    {
        this.title=title;
    }
    
    /*
     * Sets the director of the DVD
     */
    public void setDirector(String director)
    {
       this.director=director;
    }
    
   
    /**
     * Compares two DVDs to check if they are the same. 
     * Two DVDs are the the same if they have same title and director.
     */
    public boolean equals(DVD d) {
        return title.equals(d.title) && director.equals(d.director); 
      }
           

    @Override
    public String toString()
    {
    	String r = String.format("Title: %-40s Director: %-40s", title, director); 
    	return r;
    }

}