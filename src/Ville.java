
public class Ville {
	
    private String nomVille;
	private String nomPays;
	private int nbrhabitant;
	
	public Ville(){
		System.out.println("création d'une ville !");
		nbrhabitant= 0;
		nomVille="inconnu";
		nomPays="inconnu";	
	}
	
	public Ville(String nv , int nbr , String np){
		System.out.println("création d'une ville avec des paramétres");
		nbrhabitant=nbr;
		nomVille=nv;
		nomPays=np;
		
	}

	public String getNom(){
		return nomVille;
	}
	public String getNomPays(){
		return nomPays;
		
	}
	public int getnbr(){
		return nbrhabitant;
		
	}
	
	public void setNom(String pnom){
		nomVille=pnom;
	}
	
	public void setNomPays(String pnomp){
		nomPays=pnomp;
	}
	
	public void setnbr(int pnbr){
		nbrhabitant=pnbr;
	}
}
