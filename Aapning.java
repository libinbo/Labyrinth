class Aapning extends HvitRute{

    public Aapning( int rad, int kolonner, Labyrint lab){
        super( rad,kolonner, lab); // arver alle egenskapene fra Rute klassen 
    }
   
   
    @ Override
    public void finn(Rute fra ){ // dette  er 
        System.out.println("(" + rad + "," + kolonner +")");
    
    }

}