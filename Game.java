public class Game {
    

    public Team teamA;
    public Team teamb;



    public Game (Team teamA, Team teamB){
        //constructor
        this.teamA = teamA;
        this.teamA = teamA;
    }


    


    public static void playQuarter(Team teamA,Team teamB,Integer q, int pos){
        //runs i plays for each team and then 2 more each with special end of quarter messages
        System.out.println("Quarter "+q);
        System.out.println("---------");
        System.out.println("");

        for (int i = 0;i<pos;i++){
            if (i==pos-2) System.out.println("\nThe quarter is almost finished...\n");
            teamA.runPlay(teamB);
            if (i==pos-1) System.out.println("\nAs the clock is winding down...");
            teamB.runPlay(teamA);
        }

        // I can probably fit this into the for loop (needs work)
        System.out.println(teamA);
        System.out.println(teamB);


    }

    public static Team endGame(Team teamA,Team teamB){
        //this function will be used to print final scores
        // it will also return the winner
        int aTotal = 0;
        for (Player A : teamA.team){
            aTotal = aTotal + A.points;
        }
        int bTotal = 0;
        for (Player B : teamB.team){
            bTotal = bTotal + B.points;
        }
        System.out.println(teamA.name + " " + aTotal + " Points" );
        System.out.println(teamB.name + " " + bTotal + " Points" );
        //teamA wins in case of tie
        if (bTotal > aTotal) return teamB;
        else return teamA;
    }


    public static Team playGame(Team teamA,Team teamB){
        //simulates a game between 2 teams
        //returns the winner (not yet)
        //might want to add a tip off to randomize who starts with the ball(needs work)
        // if i do the above i will have to swap off between who is team a and b in the play quarter calls

        playQuarter(teamA, teamB,1,20);
        playQuarter(teamA, teamB,2,20);
        playQuarter(teamA, teamB,3,20);
        playQuarter(teamA, teamB,4,20);

        Team winner = endGame(teamA,teamB);
        winner.printWinner();
        //add function to reset all player stats to zero (needs work)
        //maybe also a function to write box-scores as a .txt (needs work)

        return winner;
    
    }

   
    public static void main (String[] args){
        Player JasonTatum = new Player(48,36,"Jason Tatum");
        Player JaylenBrown = new Player(50,35,"Jaylen Brown");
        Player MarcusSmart = new Player(45,36, "Marcus Smart");
        Player DerrickWhite = new Player(47,43,"Derrick White");
        Player AlHorford = new Player(54,47, "Al Horford");
        int[] celticsShooters = {0,0,0,0,1,1,1,2,2,3,4};
        int[] celticsRebounders = {0,0,0,1,1,2,2,3,4,4,4};
        int[] celticsPassers = {0,0,1,1,2,2,2,3,4};
        Player[] celticsRoster = {JasonTatum,JaylenBrown,MarcusSmart,DerrickWhite,AlHorford};
        Team celtics = new Team("Celtics",celticsRoster,celticsShooters,celticsRebounders,celticsPassers,23,73,63,14);
        



        Player StephenCurry = new Player(50,43,"Stephen Curry");
        Player KlayThompson = new Player(40,40,"Klay Thompson");
        Player DraymondGreen = new Player(56,31, "Draymond Green");
        Player AndrewWiggins = new Player(51,45,"Andrew Wiggins");
        Player KevonLooney = new Player(67,10, "Kevon Looney");
        int[] warriorsShooters = {0,0,0,1,1,1,2,3,3,4};
        int[] warriorsRebounders = {0,1,2,2,3,3,4,4};
        int[] warriorsPassers = {0,0,1,2,2,3,4};
        Player[] warriorsRoster = {StephenCurry,KlayThompson,DraymondGreen,AndrewWiggins,KevonLooney};
        Team warriors = new Team("Warriors",warriorsRoster,warriorsShooters,warriorsRebounders,warriorsPassers,26,71,70,16);
        




        playGame(celtics,warriors);
        System.out.println();
        
        






    }
}
