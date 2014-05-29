
/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 */
 
public class MessagePost extends Post
{
	private String message;

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
	public MessagePost(String username, String message)
	{
		super(username);
	    this.message = message;
	}
	
    /**
     * Return the text of this post.
     * 
     * @return The post's text.
     */
    public String getText()
    {	
		return message;
    }	
}