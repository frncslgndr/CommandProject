public class Stock {
    private String nom = "ABC";
    private int quantite = 10;
    private int portefeuille = 0;

    public void passeOrdrePourAcheter(){
        System.out.println("");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> NOUVELLE COMMANDE !!!!");
        System.out.println("Merci d'ACHETER "+ quantite + " actions du type : "+nom);
        portefeuille = portefeuille + quantite;
        System.out.println("Nouvelle quantité dans le porteufeuille : " + portefeuille);
        System.out.println("-----------------------------------------------------------");
    }
    public void passeOrdrePourVendre(){
        System.out.println("");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>> NOUVELLE COMMANDE !!!!");
        System.out.println("Merci de VENDRE "+ quantite + " actions du type : "+nom);
        portefeuille = portefeuille - quantite;
        System.out.println("Nouvelle quantité dans le porteufeuille : " + portefeuille);
        System.out.println("-----------------------------------------------------------");
    }
}
