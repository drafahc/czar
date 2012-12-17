package br.com.naptec.agenda.teste;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.naptec.agenda.beans.Evento;
import br.com.naptec.agenda.beans.Palestra;
import br.com.naptec.agenda.beans.Palestrante;
import br.com.naptec.agenda.services.EventoService;
import br.com.naptec.agenda.services.PalestraService;
import br.com.naptec.agenda.services.PalestranteService;

public class Teste {
	public static void main(String[] args) {
		ApplicationContext beans = new ClassPathXmlApplicationContext("applicationContext.xml");

		PalestraService pser = (PalestraService) beans.getBean("palestraService");
//		if(pser.getPalestraDao() != null){
//			System.out.println("Ok, seguir");
//		}else{
//			System.err.println("Erro: nulo");
//			return;
//		}
////		Evento evento = (Evento) beans.getBean("evento");
////		evento.setNome("Loucura");
////		evento.setDataInicioEvento(new Date());
////		evento.setDataFimEvento(new Date());
//		
//		Palestrante palestrante = (Palestrante) beans.getBean("palestrante");
//		palestrante.setNome("Falcão");
//		palestrante.setPaisOrigem("Brasil");
//		palestrante.setEspecialidade("Música");
//		
//		PalestranteService ps = (PalestranteService) beans.getBean("palestranteService");
//		ps.gravar(palestrante);
//		
//		EventoService es = (EventoService) beans.getBean("eventoService");
////		es.gravar(evento);
//		
//		Evento evento = es.buscarPorId(1L);
//		
//		Palestra palestra = new Palestra();
//		palestra.setEvento(evento);
//		palestra.setPalestrante(palestrante);
//		palestra.setDataPalestra(new Date());
//		palestra.setHoraPalestra(new Date());
//		
//		pser.gravar(palestra);
		
		List<Palestra> palestras = pser.listar();
		
		for(Palestra palestra : palestras){
			System.out.println(palestra);
		}
		
		
	}
}
