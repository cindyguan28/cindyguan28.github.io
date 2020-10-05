public class Haarfoehn {

    boolean stromschalter = false;
    int temperatur = 1;
    
    void einschalten(){
        stromschalter = true;
    }
    void ausschalten(){
        stromschalter = false;
    }
    
    void hochschalten(){
        if (temperatur < 2){
            temperatur = temperatur + 1;
        }
    }
        
    void runterschalten(){
        if (temperatur > 0){
            temperatur = temperatur - 1;
        }
    }


    String luftstrom() {
        if (stromschalter == false) { 
            return ""; 
        } 
        else{
            if (temperatur == 0){
                return "*****";
            }
            else if (temperatur == 1){
                return"=====";
            }
         
            else if (temperatur == 2){
                return"#####";
            }
        }
        return ""; 
    }

    void zeigen() {
        System.out.println();
        System.out.println("  ______  ");
        System.out.println(" (______O " + luftstrom());
        System.out.println("  / /     ");
        System.out.println(" /_/      ");
    }

    public static void main(String[] args) {
        Haarfoehn foehn = new Haarfoehn();
        foehn.zeigen();
        foehn.einschalten();
        foehn.zeigen();
        foehn.hochschalten();
        foehn.zeigen();
        foehn.runterschalten();
        foehn.zeigen();
        foehn.runterschalten();
        foehn.zeigen();
        foehn.ausschalten();
        foehn.zeigen();
    }
}
