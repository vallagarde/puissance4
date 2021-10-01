package fr.isika.cda13.Puissance4.model;


public class Joueur {
	
	public String joueur= "joueur";
	public char jeton =' ';
	
	public char jet(int a) {
		if (a == 1) {
			jeton= 'J';
			
		}
		else if (a==0) {
			jeton ='R';
		}
		return jeton;
	}
	public String jou(int b) {
		joueur += b;
		return joueur;
	}
}

