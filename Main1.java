package fr.isika.cda13.Puissance4.model;

public class Main1 {		
		public static void main(String[] args) {
			
			char vic =' '; // la disposition de victoire
			Plateau plateau = new Plateau();
			Tour tourJoueur = new Tour();
			plateau.affichagePui();
			tourJoueur.tourJJ();
		
			 while (tourJoueur.tourJJ() <42 && vic == ' ' ) {
				 
			
			plateau.remplissage();	 
			plateau.affichagePui();
			vic = plateau.determinationVainqueur();	 
				 
			System.out.println("Nous sommes au tour :" + tourJoueur.tourJJ()); 
			 }
			
			System.out.println("\n\n						---------------------------\n\n"+"le vainqueur est joueur "+ vic);
		}
}

	

