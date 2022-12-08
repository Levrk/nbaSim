public class Player{

    private int fg;
    private int threeP;
    public String name;
    public int points;
    public int tov;
    public int rebounds;
    public int assists;
    public Team team;
    
    public Player (int fg, int threeP, String name) {
        
        this.fg = fg;
        this.threeP = threeP;
        this.name = name;
        //these stats initialize to 0;
        this.points = 0;
        this.rebounds = 0;
        this.tov = 0;
        this.assists = 0;

    }

    public Player shoot(Team team){
        //determines if the shot is a 2 or 3 based on player 3p %
        //fix it so kevon looney never shoots 3s (needs work)
        if (this.threeP > 40) {
            int chance = (int)(Math.random() * ((9) + 1));
            if (chance > 3) return this.shoot3(team);
            else return this.shoot2(team);
        }
        else if (this.threeP > 35){
            int chance = (int)(Math.random() * ((9) + 1));
            if (chance > 4) return this.shoot3(team);
            else return this.shoot2(team);

        }
        else {
            int chance = (int)(Math.random() * ((9) + 1));
            if (chance > 5) return this.shoot3(team);
            else return this.shoot2(team);
        }
            
    }
    
    
    public Player shoot2 (Team team) { 
        //team argument is used so the assister will not be the shooter
        //figure out if the shot is successful
        int chance = (int)(Math.random() * ((100- 0) + 1));
        boolean score = chance < this.fg;
        if (score == true) {
        //check if basket was made, update points, print
        points = points + 2 ;
        System.out.println(printMade2());
        if (chance < team.assistP){
            //check if assist,get passer, print, update stats
            Player passer = team.getPasser(this);
            System.out.println(team.printAssist(passer));
            System.out.println("");
            passer.assists++;
        }
        //return shooter
        return this;
        }
        else System.out.println(printMissed2());
        return null;
        
        
    }

    public Player shoot3 (Team team) { 
        //team argument is used so the assister will not be the shooter
        //figure out if the shot is successful
        int chance = (int)(Math.random() * ((100- 0) + 1));
        boolean score = chance < this.threeP;
        if (score == true) {
        //check if basket was made, update points, print
        points = points + 3 ;
        System.out.println(printMade3());
        if (chance < team.assistP){
            //check if assist,get passer, print, update stats
            Player passer = team.getPasser(this);
            System.out.println(team.printAssist(passer));
            System.out.println("");
            passer.assists++;
        }
        //return shooter
        return this;
        }
        else System.out.println(printMissed2());
        return null;
    }

    public String printMade3 (){
        //returns string for made 3
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " cashes in from deep!";
        else if (chance == 1) return name + " hits it from long range!";
        else return name + " drains it from distance!";
    }

    public String printMissed3 (){
        //returns string for missed 3
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " is off from deep";
        else if (chance == 1) return name + " misses from long range";
        else return name + " is way off from three";
    }

    public String printMade2 (){
        //returns string for made 2
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " converts from close range!";
        else if (chance == 1) return name + " with the finish";
        else return name + " floats it up and in";
    }

    public String printMissed2 (){
        //returns string for missed 2
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " is off from close range";
        else if (chance == 1) return name + " misses the shot";
        else return name + " misses the layup";
    }

    public static void main (String[] args){
        
        
    }
}