class HvitRute extends Rute{

    public HvitRute( int rad, int kolonner, Labyrint lab){
        super(rad,kolonner, lab); // arver alle egenskapene fra Rute klassen 
    }
   
    @ Override
    public void finn(Rute fra ){ // dette  er 
        if(fra != soer && soer != null){
            soer.finn(this);
        }

        if(fra != nord && nord != null){
            nord.finn(this);

        }
        if(fra != vest && vest != null){
            vest.finn(this);
        }
        if(fra != oest && oest != null){
            oest.finn(this);
        }
    }


    @Override

    public String toString(){
        return ".";

    }

    

    
}