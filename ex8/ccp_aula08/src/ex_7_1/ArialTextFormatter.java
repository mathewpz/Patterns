package ex_7_1;

public class ArialTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[ArialTextFormatter]: "+text);
	}

}
