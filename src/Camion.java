public class Camion extends Thread{
    
    private Site[] sites;
    boolean turn;
    int i=0;
    int distance=0;
    public Camion(Site[] sites) {
        this.sites=sites;
        this.turn=true;
        //this.setDaemon(true);
       
        //TODO Auto-generated constructor stub
    }
    public void run(){
        while (turn ) {     
         // Le camion continue à faire sa tournée
                try {
                    
                    Thread.sleep(distance* 100);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                // Calcule du  trajet circulaire
            int siteDep = (i == 0) ? sites.length - 1 : i - 1;  // Site précédent
            int siteArr = i;  // Site actuel
             distance = Math.abs(sites[siteArr].getId() - sites[siteDep].getId());
            
            System.out.println("Camion se déplace de " + siteDep + " à " + siteArr + ". Distance parcourue : " + distance);
                sites[i].equilibreStock();
                i++;
                if(i==4){
                    i=0;
                }         
        }   
        }
    
        
        
    }
   


    

