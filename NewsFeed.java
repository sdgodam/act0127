import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a
 * social network application (like FaceBook or Google+).
 * 
 * Display of the posts is currently simulated by printing the
 * details to the terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not
 * provide any search or ordering functions.
 */
public class NewsFeed
 {
 	private ArrayList<MessagePost> messages;
 	private ArrayList<PhotoPost> photos;


    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
    	messages = new ArrayList<>();
    	photos = new ArrayList<>();
    }
    
    
    /**
     * Add a text post to the news feed.
     * 
     * @param text  The text post to be added.
     */
    public void addMessagePost(MessagePost message) 
    {
    	messages.add(message);        
    }
    
    /**
     * Add a photo post to the news feed.
     * 
     * @param photo  The photo post to be added.
     */
    public void addPhotoPost(PhotoPost photo)    
    {
    	photos.add(photo);
   	}
 
    /**
     * Show the news feed. Currently: print the news feed details
     * to the terminal. (To do: replace this later with display
     * in web browser.)
     */
    public void show()  
    {
		for(MessagePost mensaje: messages){
		  mensaje.display();
		  System.out.println();
		}

		for(PhotoPost foto: photos){
		   foto.display();
		   System.out.println();
		} 
    } 
 }