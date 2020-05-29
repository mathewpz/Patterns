package exercicio_2_1;

public class NomeDiretoParser extends NameParseCreator {

	@Override
	protected NameParser getParser() {
		return new NomeDireto();
	}

}
