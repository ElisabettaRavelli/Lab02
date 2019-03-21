package it.polito.tdp.alien;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {

	//public List<Word> listaword = new LinkedList<Word>();

	private List<WordEnhanced> listaword = new LinkedList<WordEnhanced>(); //LA LISTA NON E PIU DI OGGETTI Word MA DI OGGETTI WordEnhanced

	
	public AlienDictionary() { //costruttore
		
	}
	
	
	public void addWord(String alienWord , String translation ) {
		
		//Word w=new Word(alienWord, translation); //creo un oggetto della classe Word
		
		/*

		for (Word word : listaword) { //word è una variabile temporanea usata per scorrere la lista 
									//che assume i valori della listaword
			
			if(    word.equals(w)    ) { //if(  word.getAlienWord().equals(w.getAlienWord())  )
				//esiste gia e quindi devo aggiornare il campo translate di questo oggetto word nella lista
				
				
				word.setTraslation(w.getTraslation());
				
				return; //return esce dal metodo
			}
		}
		//se sono arrivato qua vuol dire che il ciclo for è finito e non ho trovato una corrispondenza 
		//quindi devo aggiungere questa word alla lista
		listaword.add(w);
		*/

		

		for (WordEnhanced word : listaword) { //word è una variabile temporanea usata per scorrere la lista 
									//che assume i valori della listaword
			
			if( word.getAlienWord().equals(alienWord)  ) { //ho usato questo medoto anziche il .equals come sopra perchè non ho voglia di implementare il .equals nella classe WordEnhanced
				
				//PRIMA DOVEVAMO AGGIORNARE IL CAMPO TRANSALTION SE LA PAROLA ESISTEVA GIA, ADESSO ANZICHE AGGIORNARE LA TRADUZIONE DOBBIAMO INSERIRE 
				//QUESTA TRADUZIONE COME NUOVA TRADUZIONE NELLA LISTA.
				
				word.addTranslation(translation); //SE TU VAI A VEDERE IL METODO addTranslation() DELLA CLASSE WordEnhanced VEDRAI CHE FA UNA ADD NELLA LISTA
				
				return; //return esce dal metodo
			}
		}

		//SE SONO ARRIVATO QUA E' PERCHE LA ALIENWORD NON ESISTE ANCORA
		//QUINDI CREO UN NUOVO OGGETTO DI TIPO WordEnhanced, GLI SETTO LA ALIENWORD E AGGIUNGO LA TRADUZIONE ALLA LISTA DI TRADUZIONI

		WordEnhanced w = new WordEnhanced();
		w.setAlienWord(alienWord);
		w.addTranslation(translation);
		//INFINE AGGIUNGO QUESTO OGGETTO ALLA MIA LISTA DI WordEnhanced
		listaword.add(w);

		//A QUESTO PUNTO HO UNA LISTA CHE CONIENE TANIT OGGETTI WordEnhanced OGNUNO DEI QUALI CONTIENE UNA LISTA DI TRADUZIONI
		
	}
	
	/*
	//VECCHO METODO
	public String translateWord(String alienWord ) { 
		
		for(Word tmp: listaword) {
			if(tmp.getAlienWord().equals(alienWord)) {
				return tmp.getTraslation(); 
			
		}
		
		return null;
	}
	*/
	
	public List<String> translateWord(String alienWord ) { //QUESTO METODO ADESSO ANZICHE RITORNARE UNA SOLA STRINGA RITORNA UNA LISTA DI STRINGHE (TUTTE LE TRADUZIONI DI QUELLA alienWord)
		
		for(WordEnhanced tmp: listaword) {
			if(tmp.getAlienWord().equals(alienWord)) {
				return tmp.getTraslation(); //SE VAI A VEDERE INTERNAMENTE IL METODO getTranslation() DELLA CLASSE WordEnhanced RITORNA APPUNTO UNA List<String>
			}
			
		}
		
		return null;
	}
}
