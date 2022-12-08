public class Team {
    
    private String name;
    private Player[] team;
    private int[] shooters;
    private int[] passers;
    private int[] rebounders;
    private int Dreb;
    private int Oreb;
    private int tov;
    public int assistP;
    public int points;

    public Team (String name, Player[] team, int[] shooters, int[] passers, int[] rebounders, int Oreb, int Dreb, int assistP, int tov){
        this.name = name;
        this.team = team;
        this.shooters = shooters;
        this.passers = passers;
        this.rebounders = rebounders;
        this.Dreb = Dreb;
        this.Oreb = Oreb;
        this.tov = tov;
        this.assistP = assistP;
        this.points = points;
    }


    @Override
    public String toString (){
        String output = "";
        for (Player p : team)
            output = output + (p.name + " " +Integer.toString(p.points) + " Points, "  + Integer.toString(p.rebounds) + " Rebounds, " + Integer.toString(p.assists)+ " Assists, " + Integer.toString(p.tov) + " Turnovers, "  + "\n");
        return output;
    }

    public void printTeam(){
        



    }

    public Player getShooter(){
        int chance = (int)(Math.random() * ((shooters.length-1) + 1));
        return team[shooters[chance]];
    }

    public Player getRebounder(){
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
        int chance = (int)(Math.random() * ((team.length-1) + 1));
        return team[chance];
    }

    public String printAssist(Player passer){
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return "Off the pass from " + passer.name;
        else if (chance == 1) return "Off the feed from " + passer.name;
        else return "Assisted by " + passer.name;
    }

    public String printStartPlay (){
        int chance = (int)(Math.random() * ((2) + 1));
        if (chance == 0) return name + " take the ball up the court";
        else if (chance == 1) return name + " looking to score";
        else return name + " ball";
    }



    public void runPlay (Team opponent) {
        System.out.println(printStartPlay());
        int chance = (int)(Math.random() * ((100) + 1));
        if (chance < tov) {
            System.out.println(name + " turn over the ball");
            System.out.println();
            getRandomPlayer().tov++;
            return;
        }
        while (true){
            Player shooter = getShooter();
            if (shooter.shoot(this) == shooter) return;
            chance = (int)(Math.random() * ((Oreb + opponent.Dreb) + 1));
            if (chance > Oreb) {
                System.out.println(opponent.name + " come up with the rebound");
                System.out.println();
                return;
            }
            else 
                System.out.println(name + " grab the rebound");
                System.out.println();
            
    }
    }

    public static void main (String[] args){
    }
}
