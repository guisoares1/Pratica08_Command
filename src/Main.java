
public class Main {
	public static void main(String[] args) {
		 DocumentInvoker doc = new DocumentInvoker();
		 doc.Write(" This is original text.");
		 doc.Write(" Here is some other text.");
		 doc.Undo(1);
		 doc.Redo(1);
		 doc.Write(" And a little more text.");
		 doc.Undo(2);
		 doc.Redo(2);
		 doc.Undo(1);
	}
}
