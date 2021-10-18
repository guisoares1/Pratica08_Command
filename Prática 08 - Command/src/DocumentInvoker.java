import java.util.ArrayList;

public class DocumentInvoker 
{
	private ArrayList<DocumentEditCommand> _commands = new ArrayList<DocumentEditCommand>();
	private Document _doc = new Document();
	
	public void Redo(int level)
	{	
		System.out.printf("---- Redo %d level \n", level);
		_commands.get(level).Redo();
		System.out.printf(Read());	
	}
	
	public void Undo( int level )
	{	
		System.out.printf("---- Undo %d level \n", level);
		_commands.get(level).Undo();
		System.out.printf(Read());
	}
	
	public void Write(String text) 
	{
		DocumentEditCommand cmd = new DocumentEditCommand(_doc, text);
		_commands.add(cmd);
	}
	
	public String Read() 
	{
		return _doc.ReadDocument()+"\n";
	}
}
