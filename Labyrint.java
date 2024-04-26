import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Labyrint{

    public int  rad;
    public int kol;
    public  Rute [][] rutearray;

    public Labyrint(String filnavn){
        lesinfil(filnavn);
        settnaboer();

    }

    @Override

    public String toString(){

        String teskt ="";

        for(int r=0;  r < rad; r ++){
            for (int k= 0; k < kol ; k ++){

                teskt+=rutearray[r][k]; // iterer over rute arrayee 

            }


        }
        return teskt;

    }
    // lager if sjekk for å lage naboer 8 
    
    

    

    public void lesinfil(String filnavn) {

       Scanner fil = null;

       try{

        fil = new Scanner (new File(filnavn));

       } catch (FileNotFoundException e){
            System.out.println("finner ikke filen");
            System.exit(1);

       }

       String [] verdier =fil.nextLine().split(" "); // splitter på mellomrommet 
       rad = Integer.parseInt(verdier[0]);
       kol = Integer.parseInt(verdier[1]);
       
       rutearray = new Rute[rad][kol]; // lager objektene her 


        while(fil.hasNextLine()){

            for (int r=0; r< rad; r ++){
                char [] linjer = fil.nextLine().toCharArray();

                for (int k= 0; k < kol; k ++){
                    // svart rote 

                    if( linjer[k] =='#') {
                        SortRute rutesvart= new SortRute(r,k, this);
                        rutearray[r][k] = rutesvart;
                        
                        
                    }

                    else if(linjer[k] =='.'){ // for lokke r = 0, r-1 , eller kolonner = 0, eller kolonner -1  // lage et  objekt av åpneing 

                       

                        if (r==0|| r==rad -1|| k==0 || k==kol-1){
                            Aapning aapning = new Aapning (r,k, this);
                            rutearray[r][k] = aapning;
                            
                        }
                        else{
                            HvitRute hvit = new HvitRute(r,k,this);
                            rutearray[r][k]= hvit;
                        }
                        


                    }
    
                }


            }

        
           

        }fil.close();




    }

    public  void settnaboer(){
        for (int r= 0; r < rad; r++){

            for(int k = 0; k < kol; k ++){

                Rute rute= rutearray[r][k];

                if (r-1>=0 && r+1 <= rad -1 && k-1 >= 0 && k+1<= rad -1 ){
                    if( rutearray[r][k-1] !=null){
                        rute.vest = rutearray[r][k-1] ;// vest nabo
                    }
                    if(rutearray[r][k+1] != null){
                        rute.oest= rutearray[r][k+1];

                    }
                    if( rutearray[r-1][k] != null){
                        rute.nord = rutearray[r-1][k];
                    }
                    if(rutearray[r+1][k] != null){
                        rute.soer =rutearray[r+1][k];
                    }
                }

            }


        }

    }
    public void finnutveifra(int rad, int kol){
        if(rutearray[rad][kol] != null){
            rutearray[rad][kol].finn(null);
        }

    }



}
