
/**
 * Write a description of class WriteIFs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WriteIFs
{
 
    public void playerDied(boolean player1) {
        if(this.isAlive(player1)==false){
            this.displayGameOver(player1);
        }
       
    }
    
    public String thermoSTAT(int room) {
        String returnString;
        if(tempurature(room)<70){
            returnString = this.heatOn();
        }
        else{
            returnString =this.coolOn();
        }
        return returnString;
        // Write an IF statement that checks the 
        // “temperature(room)” and if that check is less than 70, 
        // calls “heatOn()” else calls “coolOn()”

    }

    public void fireplaceControl(Object fireplace1) {
        if(outsideTemp()<50 && insideTemp()<62)
            this.startAFire(fireplace1);
       
        
        
        // Write an IF statement that checks 
        // “outsideTemp()” is less than 50 
        // AND 
        // “insideTemp()” is less than 62, 
        // calls “startAFire(fireplace1)”

    }

    public void checkFuel(double fuelLevel) {
        if(fuelLevel<0.08){
            refuel();
        }
        
        // Write an IF statement that checks “fuelLevel” 
        // and if that check is less than 0.08, calls “refuel()”

    }


    

   int x;
   int tt_t;
   int tt_s;
   int oo1, oo2;
   String ss;


  
  public WriteIFs()
  {
      // initialise instance variables
      int x = 0;
      int tt_t = 0;
      int tt_s = 1;
      String ss = "test";
      int oo1 = 61;
      int oo2 = 49;
  }

    // associated routines
    public boolean isAlive(boolean p) {
        return !p;
    }
    private int tempurature(int t) {
        return t+2;
    }
    private String heatOn() {
        this.ss = "heating";
        return this.ss;
    }
    private String coolOn() {
        this.ss = "cooling";
        return this.ss;
    }
 
    private int insideTemp() {
        return oo1;
    }
    private int outsideTemp() {
        return oo2;
    }
    private void startAFire(Object o) {
        this.tt_s = 213;
    }
    private void refuel() {
        this.x = 99;
    }
    private void displayGameOver(boolean b) {
        this.ss = "Game Over!";
    }
}
