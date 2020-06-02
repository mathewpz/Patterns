package ex_6_1;

import java.util.Calendar;
import java.util.Date;

public class Mensageiro {
	public void enviarMensagem() {
		int diaDaSemana = -1;
		MensagemDoDia mdd;
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		diaDaSemana = c.get(Calendar.DAY_OF_WEEK);
		switch(diaDaSemana) {
		case 2:
			mdd = new MensagemDaSegunda();
			break;
		case 3:
			mdd = new MensagemDaTerca();
			break;
		case 4:
			mdd = new MensagemDaQuarta();
			break;
		default:
			mdd = new DiaSemMensagem();
			break;
		}
		System.out.println(mdd.mensagem());
	}
}
