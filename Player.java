public class Player{

    private int ppg;
    private int rpg;
    private int apg;
    private int fg;
    private int threeP;
    public String name;
    public int points;
    public int tov;
    public int rebounds;
    public int assists;
    
    public Player (int ppg, int rpg, int apg, int fg, int threeP, String name) {
        this.ppg = ppg;
        this.rpg = rpg;
        this.apg = apg;
        this.fg = fg;
        this.threeP = threeP;
        this.name = name;
        this.points = 0;
        this.rebounds = 0;
        this.tov = 0;
        this.assists = 0;
    }

    public boolean shoot(){
        if (this.threeP > 40) {
            int chance = (int)(Math.random() * ((9) + 1));
            if (chance > 3) return this.shoot3();
            else return this.shoot2();
        }
        else if (this.threeP > 35){
            int chance = (int)(Math.random() * ((9) + 1));
            if (chance > 4) return this.shoot3();
            else return this.shoot2();

        }
        else {
            int chance = (int)(Math.random() * ((9) + 1));
            if (chance > 5) return this.shoot3();
            else return this.shoot2();
        }
            
    }
    
    public boolean shoot2 () { 
        int chance = (int)(Math.random() * ((100- 0) + 1));
        boolean score = chance < this.fg;
        if (score == true) {
        points = points + 2 ;
        System.out.println(printMade2());
        }
        else System.out.println(printMissed2());
        return score;
    }

    public boolean shoot3 () { 
        int chance = (int)(Math.random() * ((100- 0) + 1));
        boolean score = chance < this.threeP;
        if (score == true) {
            points = points + 3 ;
            System.out.println(printMade3());
            }
            else System.out.println(printMissed3());
            
        return score;
    }

    public String printMade3 (){
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " cashes in from deep!";
        else if (chance == 1) return name + " hits it from long range!";
        else return name + " drains it from distance!";
    }

    public String printMissed3 (){
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " is off from deep";
        else if (chance == 1) return name + " misses from long range";
        else return name + " is way off from three";
    }

    public String printMade2 (){
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " converts from close range!";
        else if (chance == 1) return name + " with the finish";
        else return name + " floats it up and in";
    }

    public String printMissed2 (){
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " is off from close range";
        else if (chance == 1) return name + " misses the shot";
        else return name + " misses the layup";
    }

    public static void main (String[] args){
        
        
    }
}