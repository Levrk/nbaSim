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
        if (q<=4) System.out.println("Quarter "+q);
        else System.out.println("Overtime");
        System.out.println("---------");
        System.out.println("");
        for (int i = 0;i<pos;i++){
            if (i==pos-2) System.out.println("\nThe quarter is almost finished...\n");
            teamA.runPlay(teamB);
            if (i==pos-1) System.out.println("\nAs the clock is winding down...");
            teamB.runPlay(teamA);
        }
        //check if the game is over
        if (q==4) System.out.println("\n- - Game Over!!! - -\n");
        System.out.println(teamA);
        System.out.println(teamB);
    }

    public static Boolean tieCheck(Team teamA,Team teamB){
        //this function will be used to check if the game is tied
        // it will return true or false
        int aTotal = 0;
        for (Player A : teamA.team){
            aTotal = aTotal + A.points;
        }
        int bTotal = 0;
        for (Player B : teamB.team){
            bTotal = bTotal + B.points;
        }
        
        if(bTotal == aTotal) return true;
        else return false;
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
        if(bTotal == aTotal) return null;
        if (bTotal > aTotal) return teamB;
        else return teamA;
    }


    public static Team playGame(Team teamA,Team teamB){
        //simulates a game between 2 teams
        //might want to add a tip off to randomize who starts with the ball(needs work)
        playQuarter(teamA, teamB,1,28);
        playQuarter(teamB, teamA,2,18);
        playQuarter(teamA, teamB,3,18);
        playQuarter(teamB, teamA,4,18);
        //check for overtime
        while (tieCheck(teamA,teamB)==true){
            playQuarter(teamA, teamB,5,5);
        }
        //check winnner and endgame
        Team winner = endGame(teamA,teamB);
        winner.printWinner();
        //reset player stats
        teamA.resetStats();
        teamB.resetStats();
        return winner;
    
    }

   
    public static void main (String[] args){


    }
}
