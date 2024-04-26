class SortRute extends Rute {

    public SortRute ( int rad, int kolonner, Labyrint lab){

        super( rad,kolonner, lab);

    }

    @ Override
    public void finn(Rute fra ){ // dette  er 
        if(fra == null){
            System.out.println("kan ikke starte i sort rute ");
        }
    }

    @Override
    public String toString(){
        return "#";

    }

}
