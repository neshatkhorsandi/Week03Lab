package models;

import java.io.Serializable;

/**
 *
 * @author 784789
 */
public class Note implements Serializable
{
    String title;
    String content;
    
    public Note()
    {
        
    }

    public Note(String title, String content) 
    {
        this.title = title;
        this.content = content;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getContent() 
    {
        return content;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }
    

    
}
