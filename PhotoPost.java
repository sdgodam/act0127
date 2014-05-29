import java.util.ArrayList;
/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 */
 
public class PhotoPost
{
	private String username;
	private String filename;
	private String caption;
	private long timestamp;
	private int likes;
	private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
	public PhotoPost(String username, String filename, String caption)
	{
		this.username = username;
		this.filename = filename;
		this.caption = caption;
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
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
    	return filename;
    }
    
    
    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption() {
           return caption;
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
		System.out.println("Nombre imagen: " + filename);
		System.out.println("Titulo: " + caption);
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
 