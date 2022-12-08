public class Team {
    
    public String name;
    public Player[] team;
    private int[] shooters;
    private int[] passers;
    private int[] rebounders;
    private int Dreb;
    private int Oreb;
    private int tov;
    public int assistP;

    public Team (String name, Player[] team, int[] shooters, int[] passers, int[] rebounders, int Oreb, int Dreb, int assistP, int tov){
        this.name = name;
        this.team = team;
        // these arrays indicate probability of a given player to shoot/pass/rebound 
        //based on their index in team
        this.shooters = shooters;
        this.passers = passers;
        this.rebounders = rebounders;
        this.Dreb = Dreb;
        this.Oreb = Oreb;
        this.tov = tov;
        this.assistP = assistP;
    }


    @Override
    public String toString (){
        //prints statsheet
        String output = this.name + " box score \n------------------\n";
        for (Player p : team)
            output = output + (p.name + " " +Integer.toString(p.points) + " Points, "  + Integer.toString(p.rebounds) + " Rebounds, " + Integer.toString(p.assists)+ " Assists, " + Integer.toString(p.tov) + " Turnovers, "  + "\n");
        return output;
    }

    public void printWinner(){
        System.out.println();
        System.out.println(name + " win!!!");
    }

    public Player getShooter(){
        //returns the shooter
        int chance = (int)(Math.random() * ((shooters.length-1) + 1));
        return team[shooters[chance]];
    }

    public Player getRebounder(){
        //returns the rebounder 
        int chance = (int)(Math.random() * ((rebounders.length-1) + 1));
        return team[rebounders[chance]];
    }

    public Player getPasser(Player shooter){
        //returns the passer
        int chance = (int)(Math.random() * ((passers.length-1) + 1));
        while (team[passers[chance]]==shooter){
            chance = (int)(Math.random() * ((passers.length-1) + 1));
        };
        return team[passers[chance]];
    }

    public Player getRandomPlayer(){
        //returns random player
        //currently using this function for turnovers
        int chance = (int)(Math.random() * ((team.length-1) + 1));
        return team[chance];
    }

    public String printAssist(Player passer){
        //prints assist message
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return "Off the pass from " + passer.name;
        else if (chance == 1) return "Off the feed from " + passer.name;
        else return "Assisted by " + passer.name;
    }

    public String printStartPlay (){
        //prints a message at the start of the play
        int chance = (int) (Math.random() * ((2) + 1));
        if (chance == 0) return name + " take the ball up the court";
        else if (chance == 1) return name + " looking to score";
        else return name + " ball";
    }

    public String printRebound (Player rebounder, Team team,Boolean opponent){
        //prints rebound message
        //opponent==false indicates a defensive rebound
        int chance = (int)(Math.random() * ((2) + 1));
        if (opponent == false) return rebounder.name + " keeps the play alive for the " + team.name;
        if (chance == 0) return rebounder.name + " grabs the board for the " + team.name;
        else if (chance == 1) return rebounder.name + " with the rebound for the " + team.name;
        else return rebounder.name + " picks that one up off the miss  " ;
    }



    public void runPlay (Team opponent) {
        System.out.println(printStartPlay());
        //checking if there was a turnover prior to the shot
        int chance = (int)(Math.random() * ((100) + 1));
        if (chance < tov) {
            System.out.println(name + " turn over the ball");
            System.out.println();
            getRandomPlayer().tov++;
            return;
        }
        while (true){
            //find out who shoots and return if they make it
            Player shooter = getShooter();
            if (shooter.shoot(this) == shooter) return;
            //calculate who gets the rebound
            chance = (int)(Math.random() * ((Oreb + opponent.Dreb) + 1));
            if (chance > Oreb) {
                //indicates offensive rebound
                //pick rebounder, update stats, print, end play
                Player rebounder = opponent.getRebounder();
                System.out.println(printRebound(rebounder,opponent,true));
                rebounder.rebounds++;
                System.out.println();
                return;
            }
            else {
                //indicates defensive rebound
                //pick rebounder, update stats, print, shoot again
                Player rebounder = this.getRebounder();
                System.out.println(printRebound(rebounder,this,false));
                rebounder.rebounds++;
            }
                System.out.println();
            
    }
    }

    public static void main (String[] args){
    }
}
