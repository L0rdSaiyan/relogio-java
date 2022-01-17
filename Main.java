public class Main
{
    public static void main(String[] args) {

     int horas=0, minutos=0, segundos=0;

      while(segundos>-1){

       System.out.println(horas+" Horas "+minutos+" Minutos "+segundos+" Segundos");

         try{

          Thread.sleep(1000);

           }catch(InterruptedException goku){

         }

          segundos++;

           if(segundos==60){

            segundos=0;
             minutos++;
       }

              if(minutos==60){

               minutos=0;
                horas++;

    }
                 if(horas==24){
           
                  horas=0;
            
     }
   }
  }
}