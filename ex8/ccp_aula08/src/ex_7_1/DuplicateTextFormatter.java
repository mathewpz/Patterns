package ex_7_1;

public class DuplicateTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		String str = "";
		int vezes = 2; 
		for (int i = 0; i < vezes; i++) {
			str += "("+text+")"; 
		}
		System.out.println("[DuplicateTextFormatter]: "+str);
	}

}
