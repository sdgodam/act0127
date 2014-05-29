import java.util.ArrayList;
/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 */
 
public class PhotoPost extends Post
{
	private String filename;
	private String caption;

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
	public PhotoPost(String username, String filename, String caption)
	{
		super(username);
		this.filename = filename;
		this.caption = caption;
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
}
 