package fr.isika.cda13.Puissance4.model;
import java.util.Scanner; 


public class Plateau {
	
	// initialisation des objets essentiels à this.plateauleau
	
	Joueur njoueur = new Joueur();
	Tour tourJoueur = new Tour();
	Scanner sU = new Scanner(System.in);
	
	// initiailisation des variables essentielles à this.plateauleau:
	
	String joueur = " ";
	int a; //la colonne du this.plateauleau
	int indiceCol0 =5;//on initialise tous les colonnes des this.plateauleaux
	int indiceCol1 =5;//
	int indiceCol2 =5;//
	int indiceCol3 =5;
	int indiceCol4 =5;
	int indiceCol5= 5;
	int indiceCol6= 5;

	
	public char[][] plateau;
	
	int colonneChoisie; // création du numéro de colonne choisie
	
	public Plateau() {
		plateau = new char[7][6];// création du this.plateauleau
		this.construction();
	}
	
	public char[][] construction() {
	for (int i=0 ; i<7 ; i++){
		  for (int j=0 ; j<6 ; j++){
			  plateau[i][j]= ' ';
		  }
		 
	  }
	return plateau;
	
	}
	
	public char[][] remplissage(){
		
		//on initialise le token du joueur en fonction du tour de jeu
		
		char joueurtoken = njoueur.jet((tourJoueur.tourPlus())%2);
		
		do {// on vérifie que a soit bien entre 0 et 6 et que la colonne ne soit pas déja remplie

			  System.out.println("\n\n					---------------------------\n\n"+"    De 0 à 6 donnez la colonne ou vous jouez votre jeton. Cette colonne doit avoir encore une place libre"+"\n\n					---------------------------");
			  a = sU.nextInt();// l'utilisateurdonne son numéro de colonne
			 
			  
		  }while (a>6 || a<0 || plateau [a][0] != ' ');
		 
		  
			if (this.a==0){// On remplit le this.plateauleau avec le token du joueur
				plateau[a][indiceCol0]= joueurtoken;
				indiceCol0--;
			}
			else if (a==1){
				plateau[a][indiceCol1]= joueurtoken;
				indiceCol1--;
				
			}
			else if (a==2){
				plateau[a][indiceCol2]= joueurtoken;
				indiceCol2--;
			}
			else if (a==3){
				plateau[a][indiceCol3]= joueurtoken;
				indiceCol3--;
			}
			else if (a==4){
				plateau[a][indiceCol4]= joueurtoken;
				indiceCol4--;
			}
			else if (a==5){
				plateau[a][indiceCol5]= joueurtoken;
				indiceCol5--;
			}
			else if (a==6){
				plateau[a][indiceCol6]= joueurtoken;
				indiceCol6--;
			}
			return plateau;
	}
	public char determinationVainqueur(){
		
		   
		for (int i = 0 ; i < 4 ; i++) {
			for (int j= 0 ; j < 3; j++){
				if (this.plateau[i][j] == this.plateau[i+1][j+1] && this.plateau[i][j] == this.plateau[i+2][j+2] && this.plateau[i][j] == this.plateau[i+3][j+3] && this.plateau[i][j]!=' '){
					return this.plateau[i][j];  
				}
			
			}
		  }
		for (int i = 6 ; i > 2 ; i--) {
			for (int j= 0 ; j < 3; j++){
				if (this.plateau[i][j] == this.plateau[i-1][j+1] && this.plateau[i][j] == this.plateau[i-2][j+2] && this.plateau[i][j] == this.plateau[i-3][j+3] && this.plateau[i][j]!=' '){
					return this.plateau[i][j];  
				}
					
			}
		  }
		for (int i = 0 ; i < 7 ; i++) {
			for (int j = 0 ; j < 3 ; j++ ) {
				if (this.plateau[i][j] == this.plateau[i][j+1] && this.plateau[i][j] == this.plateau[i][j+2] && this.plateau[i][j] == this.plateau[i][j+3] && this.plateau[i][j]!=' '){
					return this.plateau[i][j];  
				}

			}
		  }
		for (int i = 0 ; i < 4 ; i++) {
			for (int j = 0 ; j < 6 ; j++){
				if (this.plateau[i][j] == this.plateau[i+1][j] && this.plateau[i][j] == this.plateau[i+2][j] && this.plateau[i][j] == this.plateau[i+3][j] && this.plateau[i][j]!=' '){
					return this.plateau[i][j];  
				}
				
			}
		  }
		return ' ';
	}
	
	
	public void affichagePui(){
	
		
		System.out.println("					      -+-+-+-+-+-+-+-");
		System.out.println("				   	      |"+ this.plateau[0][0] + "|"+this.plateau[1][0]+"|"+this.plateau[2][0]+ "|"+this.plateau[3][0] + "|"+this.plateau[4][0]+"|"+this.plateau[5][0]+"|"+this.plateau[6][0]+"|");
		System.out.println("					      -+-+-+-+-+-+-+-");
		System.out.println("					      |"+this.plateau[0][1] + "|"+this.plateau[1][1]+"|"+this.plateau[2][1]+"|"+this.plateau[3][1] + "|"+this.plateau[4][1]+"|"+this.plateau[5][1]+"|"+this.plateau[6][1]+"|");
		System.out.println("					      -+-+-+-+-+-+-+-");
    	System.out.println("					      |"+this.plateau[0][2] + "|"+this.plateau[1][2]+"|"+this.plateau[2][2]+"|"+this.plateau[3][2] + "|"+this.plateau[4][2]+"|"+this.plateau[5][2]+"|"+this.plateau[6][2]+"|");
    	System.out.println("					      -+-+-+-+-+-+-+-");
    	System.out.println("					      |"+this.plateau[0][3] + "|"+this.plateau[1][3]+"|"+this.plateau[2][3]+"|"+this.plateau[3][3] + "|"+this.plateau[4][3]+"|"+this.plateau[5][3]+"|"+this.plateau[6][3]+"|");
    	System.out.println("					      -+-+-+-+-+-+-+-");
    	System.out.println("					      |"+this.plateau[0][4] + "|"+this.plateau[1][4]+"|"+this.plateau[2][4]+"|"+this.plateau[3][4] + "|"+this.plateau[4][4]+"|"+this.plateau[5][4]+"|"+this.plateau[6][4]+"|");
    	System.out.println("					      -+-+-+-+-+-+-+-");
    	System.out.println("					      |"+this.plateau[0][5] + "|"+this.plateau[1][5]+"|"+this.plateau[2][5]+"|"+this.plateau[3][5] + "|"+this.plateau[4][5]+"|"+this.plateau[5][5]+"|"+this.plateau[6][5]+"|");
    	System.out.println("					      -+-+-+-+-+-+-+-");
	
	
	}
}