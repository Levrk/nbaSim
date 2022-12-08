public class Game {
    

    public Team teamA;
    public Team teamb;



    public Game (Team teamA, Team teamB){
        this.teamA = teamA;
        this.teamA = teamA;
    }



    public static void playQuarter(Team teamA,Team teamB,Integer q){

        System.out.println("Quarter "+q);

        for (int i = 0;i<1;i++){
            teamA.runPlay(teamB);
            teamB.runPlay(teamA);
        }
        System.out.println("");
        System.out.println("The quarter is nearly over");
        System.out.println("");

        teamA.runPlay(teamB);
        teamB.runPlay(teamA);
        teamA.runPlay(teamB);
        System.out.println("");
        System.out.println("As the clock is winding down...");

        teamB.runPlay(teamA);



        System.out.println(teamA);
        System.out.println(teamB);
        


    }

    public static Team endGame (Team teamA,Team teamB){
        //System.out.println(teamA.name + ": " + teamA.points);
        //System.out.println(teamB.name + ": " + teamB.points);
        
        //temp
        return teamA;
    }



    public static Team playGame(Team teamA,Team teamB){


        playQuarter(teamA, teamB,1);
        playQuarter(teamA, teamB,2);
        playQuarter(teamA, teamB,3);
        playQuarter(teamA, teamB,4);

        endGame(teamA,teamB);
        
        //temp
        return teamA;
    
    }

   
    public static void main (String[] args){
        Player JasonTatum = new Player(31,8,4,48,36,"Jason Tatum");
        Player JaylenBrown = new Player(27,7,4,50,35,"Jaylen Brown");
        Player MarcusSmart = new Player(12,3,8,45,36, "Marcus Smart");
        Player DerrickWhite = new Player(11,3,3,47,43,"Derrick White");
        Player AlHorford = new Player(10,6,3,54,47, "Al Horford");
        int[] celticsShooters = {0,0,0,0,1,1,1,2,2,3,4};
        int[] celticsRebounders = {0,0,0,1,1,2,2,3,4,4,4};
        int[] celticsPassers = {0,0,1,1,2,2,2,3,4};
        Player[] celticsRoster = {JasonTatum,JaylenBrown,MarcusSmart,DerrickWhite,AlHorford};
        Team celtics = new Team("Celtics",celticsRoster,celticsShooters,celticsRebounders,celticsPassers,23,73,63,14);
        



        Player StephenCurry = new Player(30,7,7,50,43,"Stephen Curry");
        Player KlayThompson = new Player(18,4,3,40,40,"Klay Thompson");
        Player DraymondGreen = new Player(9,6,7,56,31, "Draymond Green");
        Player AndrewWiggins = new Player(19,5,2,51,45,"Andrew Wiggins");
        Player KevonLooney = new Player(6,7,3,67,10, "Kevon Looney");
        int[] warriorsShooters = {0,0,0,1,1,1,2,3,3,4};
        int[] warriorsRebounders = {0,1,2,2,3,3,4,4};
        int[] warriorsPassers = {0,0,1,2,2,3,4};
        Player[] warriorsRoster = {StephenCurry,KlayThompson,DraymondGreen,AndrewWiggins,KevonLooney};
        Team warriors = new Team("Warriors",warriorsRoster,warriorsShooters,warriorsRebounders,warriorsPassers,26,71,70,16);
        




        playGame(celtics,warriors);
        System.out.println();
        
        






    }
}
