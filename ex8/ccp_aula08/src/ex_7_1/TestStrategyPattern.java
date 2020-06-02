package ex_7_1;

public class TestStrategyPattern {

	public static void main(String[] args) {
		TextFormatter formatter = new CapTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Testing text in caps formatter");
		
		formatter = new LowerTextFormatter();
		editor = new TextEditor(formatter);
		editor.publishText("Testing text in lower formatter");
		
		formatter = new DuplicateTextFormatter();
		editor = new TextEditor(formatter);
		editor.publishText("Testing text in duplicate formatter");
		
		formatter = new ReverseTextFormatter();
		editor = new TextEditor(formatter);
		editor.publishText("Testing text in reverse formatter");
	}

}
