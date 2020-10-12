class Buecherregal {
    private Buch[] regal;
    private int size = 2;
    private int anzahl;
    
    public Buecherregal(){
        regal = new Buch [size];
        anzahl = 0;
    }

    int [] aktuellKapa = new int [size];
    public int kapazitaet (){
        return regal.length;
        }

    public boolean istVoll(){
        if (anzahl == regal.length){
            return true;
        }
        else {
            return false;
        }
    }
   

    
    void erweitere(){
        int sizeNew = anzahl*2;
         Buch []regalNeu = new Buch [sizeNew];
            for (int a = 0; a<anzahl; a++){
                regalNeu [a] = regal[a];
            }
            regal = regalNeu;
    

        }
        
//buchEinstellen
    void buchEinstellen(Buch b){
        if(istVoll()){
            erweitere();
        }
            regal[anzahl] = b;
            anzahl++;
    }
     

    public int anzahlBuecher(){
       return anzahl; 
    }
    
    public Buch buchMitTitelFinden (String titel){
        for(int index=0;index <anzahl; index++){
            if(regal[index].titelAusgeben().equals(titel)){
                //Buch b = regal[index];
                return regal[index];
            }
         }
        return null;
    }


    void buchMitTitelEntfernen (String titel){
        for(int index=0;index <anzahl; index++){
            if(regal[index].titelAusgeben().equals(titel)){
                Buch b = regal[index];
                regal[index] = regal[anzahl - 1];
                anzahl--;
                
            //return regal[index];
            }
        //return null;
        }
    }
                    
     
    public static void main(String[] args) {
        Buecherregal br = new Buecherregal();
        Buch b1 = new Buch("Ein Freund fuer Nanoka", "Saro Tekkotsu");
        Buch b2 = new Buch("2 Freunde fuer 4 Pfoten", "Michael Ende");
        Buch b3 = new Buch("Die 3 ???", "Robert Arthur");
        Buch b4 = new Buch("TKKG", "Stefan Wolf");
        Buch b5 = new Buch("Die 5 Freunde", "Enid Blyton");

        br.buchEinstellen(b1);
        br.buchEinstellen(b2);
        br.buchEinstellen(b3);
        br.buchEinstellen(b4);
        br.buchEinstellen(b5);
        Buch b6 = br.buchMitTitelFinden("Ein Freund fuer Nanoka");
        System.out.println(b2.autorAusgeben());
    }
}
