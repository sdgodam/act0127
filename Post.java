import java.util.ArrayList;

/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    private String username;
	private long timestamp;
	private int likes;
	private ArrayList<String> comments;

    /**
     * Constructor for objects of class Post
     */
    public Post(String username)
    {
        this.username = username;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Record one more 'Like' indication from a user.
     */
    public void like()
    {
    	likes++;
    }	
	
    /**
     * Record that a user has withdrawn his/her 'Like' vote.
     */
    public void unlike()
    {
    	if (likes>0){
    		likes--;
    	}  	
    }	
    
    /**
     * Add a comment to this post.
     * 
     * @param text  The new comment to add.
     */
    public void addComment(String text)
    {
		comments.add(text);
    }
    
     /**
     * Return the time of creation of this post.
     * 
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp()
    {	
    	return timestamp;
    }
	
    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {	
		System.out.println("Usuario: "+ username);
		System.out.println(timeString(timestamp));

		System.out.println(likes + " me gusta");
		
		if(comments.isEmpty()) {
			System.out.println("No hay comentarios");		
		}
		else {
			System.out.println("Hay " + comments.size() + " comentario(s)");
			for (String comment : comments) {
				System.out.println(comment);
			}
		}
		

	}
	
    /**
     * Create a string describing a time point in the past in terms 
     * relative to current time, such as "30 seconds ago" or "7 minutes ago".
     * Currently, only seconds and minutes are used for the string.
     * 
     * @param time  The time value to convert (in system milliseconds)
     * @return      A relative time string for the given time
     */
    
    private String timeString(long time)
    {	
    	String mensaje= "";
    	long timeNow = System.currentTimeMillis();
    	long diferencia=timeNow-time; 
    	long minutos = diferencia / 60000;   	
    	if(minutos == 0){
			mensaje = "Hace " + (diferencia/1000) + " segundos";
    	}
    	else {
    		mensaje = "Hace " + minutos + " minutos";
    	} 	  
    	return mensaje;
    }
}
