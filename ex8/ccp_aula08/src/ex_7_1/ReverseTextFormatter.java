package ex_7_1;

public class ReverseTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		String inverso = "";
	    for (int i = text.length() - 1; i >= 0; i--) {
	      inverso += text.charAt(i);
	    }
		System.out.println("[ReverseTextFormatter]: "+inverso);
	}

}
