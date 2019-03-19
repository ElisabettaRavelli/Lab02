package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String traslation;
	
	public Word(String alienWord, String traslation) { //costruttore
		this.alienWord=alienWord;
		this.traslation=traslation;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { //metodo equals per controllare se la parola alienWord
										//è già presente nel dizionario
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	
	
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	
	
	public String getTraslation() {
		return traslation;
	}
	public void setTraslation(String traslation) {
		this.traslation = traslation;
	}
	

}
