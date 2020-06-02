package ex_7_1;

public class CapTextFormatter implements TextFormatter{

	@Override
	public void format(String text) {
		System.out.println("[CapTextFormatter]: "+text.toUpperCase());
	}

}
