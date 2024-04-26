import java.util.Scanner;

class Oblig7{


    public static void main (String [] args){

        

       String fil= args[0];
       Labyrint labyrint = new Labyrint(fil);
       System.out.println("Skriv inn kordinater <rad> <kolonne>.Trykk -1 for å kunn avslutte hele programmet");
       Scanner input =new Scanner(System.in);
       String Strengen=input.nextLine();

        while (! Strengen.equals("-1")){
            System.out.println("Aapningen er:");
            String[] strengbiter= Strengen.split(" ");
            int rad=Integer.parseInt(strengbiter[0]);
            int kol=Integer.parseInt(strengbiter[1]);
            
            if(rad<= labyrint.rad -1 && kol <= labyrint.kol -1){
                labyrint.finnutveifra(rad,kol);
            
            }
            else{
                System.out.println("Det ser ut som dette var ulovelige kordinater");
                break;
            }

            System.out.println("Skriv inn kordinater <rad> <kolonne>.Trykk -1 for å kunn avslutte hele programmet");
            input=new Scanner(System.in);
            Strengen=input.nextLine();
        }
        input.close();

        
    }
}
    

    
