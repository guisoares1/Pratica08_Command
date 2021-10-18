import java.util.ArrayList;

public class Document 
{
	private ArrayList<String> _textArray = new ArrayList<String>();
	
	public void Write(String text)
	{
		_textArray.add(text);
	}
	
	public void Erase(String text)
	{
		_textArray.remove(text);
	}
	
	public void Erase(int textLevel)
	{
		_textArray.remove(textLevel);
	}
	
	public String  ReadDocument()
	{
		StringBuilder sb = new StringBuilder();
	     for(String text : _textArray)
	     {
	    	 sb.append(text);
	     }
	     return sb.toString();
	}
	

}
