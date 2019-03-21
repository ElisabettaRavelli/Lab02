package it.polito.tdp.alien;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary dizionario = new AlienDictionary(); //creo un oggetto della classe AlienDictionary
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtResult.clear();
    	txtWord.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	/*
    	 * if (c'è una sola parola){
    	 * 		translate(); stampo la traduzione nella textArea
    	 * }
    	 * else {
    	 * 		addWord(); sggiungo la parola e la sua traduzione alla lista 
    	 * }
    	 */
    	
    	//creo un vettore di stringhe per prendere separatamente i valori inseriti nel txtWord
    	String[] vett = txtWord.getText().split(" ");
    	
    	
    	if (vett.length == 1 && vett[0].matches("[a-zA-Z]+")) {
    		String parola0 = vett[0].toLowerCase();
    		//String result = dizionario.translateWord(parola0);  //salvo nella stringa result quello che il metodo mi ritorna
    		
    		List<String> result = dizionario.translateWord(parola0); //salvo nella lista result quello che il metodo mi ritorna
    		
    		if(result == null) {
    			txtResult.appendText("Errore: parola non presente nel dizionario\n");
    			
    		} else  {txtResult.appendText(result + "\n");
    				txtWord.clear();
    		}
    	}
    	else if (vett.length == 2 && vett[0].matches("[a-zA-Z]+") && vett[1].matches("[a-zA-Z]+")) {
    		String parola0 = vett[0].toLowerCase();
    		String parola1 = vett[1].toLowerCase();
    		dizionario.addWord(parola0, parola1);
    		txtResult.appendText("Hai inserito correttamente la parola nel dizionario\n");
    		txtWord.clear();
    	}
    	else { txtResult.appendText("Errore nell'input\n");
    		
    	}
    	

    }

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
