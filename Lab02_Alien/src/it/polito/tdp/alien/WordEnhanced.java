package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	
	private String alienWord;
	private List<String> translationList = new LinkedList<String>();
	
	/*
Il costruttore è giusto crearlo ma non cosi perchè quando crei un nuovo oggetto della classe WordEnhanced non hai gia la lista delle traduzioni ma le vuoi aggiungere tu una per volta
Quindi o crei un costruttore solo con la alienWord e la prima traduzione  oppure lasci il costruttore vuoto e fai tutto con i metodi setter

	public WordEnhanced(String alienWord, List<String> translation) {
		this.alienWord = alienWord;
		this.translationList = translationList;
		
	}
	*/

	public WordEnhanced(){
		//lascio il costruttore vuoto
	}

	//getter 
	public String getAlienWord() {
		return alienWord;
	}

	//setter
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	
	//getter
	public List<String> getTraslation() {
		return translationList;
	}
	
	//nella classe pricipale dove devi aggiungere le parole al dizionario farai un ciclo for sulla lista di WordEnhanced 
	//e se la alienWord esiste gia allora chiami questo metodo per aggiungere la traduzione
	//se invece la alien word non esiste ancora creerai un nuovo oggetto WordEnhanced con la alienWord quella appena letta dalla finestra grafica
	//e come unico elemento della lista (translationList) la traduzione letta dalla finestra
	public void addTranslation(String translation){
		translationList.add(translation);
	}

	//public void setTranslationList(List<String> translationList) {
	//	this.translationList = translationList;
	//}
	
	

}


