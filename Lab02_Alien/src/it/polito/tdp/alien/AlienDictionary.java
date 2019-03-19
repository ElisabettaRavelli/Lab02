package it.polito.tdp.alien;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {

	private List<Word> listaword = new LinkedList<Word>();
	
	public AlienDictionary() { //costruttore
		
	}
	
	/*
	 *Il metodo viene chiamato dal Controller per l’aggiunta, nel dizionario, di una nuova
	alienWord con corrispondente translation . Se alienWord è già presente, la traduzione
	deve essere aggiornata.
	 */
	public void addWord(String alienWord , String translation ) {
		
		Word w=new Word(alienWord, translation); //creo un oggetto della classe Word
		
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
		
		
		
	}
	
	/*
	 * Il metodo viene chiamato dal Controller per la traduzione della parola alienWord passata
	come parametro. Il metodo restituisce la parola tradotta, altrimenti null se alienWord non è
	presente nel dizionario
	 */
	public String translateWord(String alienWord ) {
		
		for(Word tmp: listaword) {
			if(tmp.getAlienWord().equals(alienWord)) {
				return tmp.getTraslation();
			}
			
		}
		//se sono arrivato qui il ciclo for è finito senza mai entrare nell'if quindi la parola 
		// non è presente nella listaword
		return null;
	}
}
