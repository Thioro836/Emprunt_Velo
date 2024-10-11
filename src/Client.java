public class Client extends Thread {
  
   private Site siteDep;
   private Site siteArr;
   private int temps=0;
   public Client (Site siteDep, Site siteArr){
      this.siteDep = siteDep;  
      this.siteArr = siteArr;
    
   }
    
   
   public void run() {
   
     try {
      // calcul du trajet des cyclistes
      temps=Math.abs(siteDep.getId()-siteArr.getId());
      siteDep.empruntVelo();
      Thread.sleep(temps*1000); 
      siteArr.depotVelo();
     } catch (InterruptedException e) {
    //gestion de l'interruption
      Thread.currentThread().interrupt();
  } catch (Exception e) {
      // Autres erreurs potentielles
      e.printStackTrace();
  }
}
}
