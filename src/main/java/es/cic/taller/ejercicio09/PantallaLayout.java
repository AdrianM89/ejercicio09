package es.cic.taller.ejercicio09;

import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.VerticalLayout;

import es.cic.taller.ejercicio09.mus.Baraja;
import es.cic.taller.ejercicio09.mus.Carta;
import es.cic.taller.ejercicio09.mus.Tapete;

public class PantallaLayout extends GridLayout {

	private TapeteForm tapete1;
	private TapeteForm tapete2;
	private TapeteForm tapete3;
	private TapeteForm tapete4;
	
	private MyUI myUI;
	
	private Baraja baraja;
	
	public PantallaLayout(MyUI myUI, Baraja baraja) {
		this.myUI = myUI;
		this.baraja = baraja;
		Tapete manoTapete1 = baraja.getTapete();
		
		tapete1 = new TapeteForm(myUI);
		tapete1.setTapete(manoTapete1);

		
		Tapete manoTapeteDorso = new Tapete();
		manoTapeteDorso.setCarta1(Carta.getDorso());
		manoTapeteDorso.setCarta2(Carta.getDorso());
		manoTapeteDorso.setCarta3(Carta.getDorso());
		manoTapeteDorso.setCarta4(Carta.getDorso());
		
		tapete2 = new TapeteForm(myUI);
		tapete2.setTapete(manoTapeteDorso);
		
		tapete3 = new TapeteForm(myUI);
		tapete3.setTapete(manoTapeteDorso);
		
		tapete4 = new TapeteForm(myUI);
		tapete4.setTapete(manoTapeteDorso);

		setRows(4);
		setColumns(4);
		
		VerticalLayout verticalLayout = new VerticalLayout();
		Button botonMus = new Button("Mus");
		botonMus.addClickListener(e-> {
			 
		});
		Button botonNoMus = new Button("No Mus");
		botonMus.addClickListener(e-> {
			 
		});
		verticalLayout.addComponents(botonMus, botonNoMus);
		
		addComponent(tapete1, 1, 2);
		addComponent(verticalLayout, 2, 2);
		addComponent(tapete2, 1, 0);
		addComponent(tapete3, 0, 1);
		addComponent(tapete4, 3, 1);
//		addComponent(botonMus,1,3);
	}
	
	
	
}
