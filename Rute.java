abstract class Rute{

    public Labyrint lab;
    public int kolonner;
    public int rad;
    public Rute vest;
    public Rute soer;
    public Rute nord;
    public Rute oest;

    public Rute naboruter;
// lager nod, sør 
    public Rute( int rad, int kolonner, Labyrint lab){
        this.lab= lab;
        this.kolonner= kolonner;
        this.rad= rad;


    }

    abstract public void finn(Rute fra);


}