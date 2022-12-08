public class Main {
    

public static Team celticsSetup(){
    //sets up celtics instances
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
    return celtics;
}
public static Team warriorsSetup(){
    //sets up warriors instances
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
    return warriors;
}

public static Team cavsSetup(){
    //sets up cavs instances
    Player DMitchell = new Player(50,42,"Donovan Mitchell");
    Player DGarland = new Player(44,40,"Darius Garland");
    Player EMobley = new Player(56,22, "Evan Mobley");
    Player JAllen = new Player(60,0,"Jarret Allen");
    Player KLove = new Player(42,39, "Kevin Love");
    int[] cavsShooters = {0,0,0,1,1,2,3,4};
    int[] cavsRebounders = {0,1,2,2,3,3,4,4};
    int[] cavsPassers = {0,0,1,1,1,2,3,4};
    Player[] cavsRoster = {DMitchell,DGarland,EMobley,JAllen,KLove};
    Team cavs = new Team("Cavaliers",cavsRoster,cavsShooters,cavsRebounders,cavsPassers,28,74,58,15);
    return cavs;
}



public static Team[] setMatchup(String arg0, String arg1){
    //sets up matchup as array of two teams

    //setting up team instances
    Team warriors = warriorsSetup();
    Team celtics = celticsSetup();
    Team cavs = cavsSetup();
    Team teamA = null;
    Team teamB = null;
    //checking CL arguments
    if (arg0.equals("warriors"))  teamA = warriors;
    if (arg0.equals("celtics")) teamA = celtics;
    if (arg0.equals("cavs")) teamA = cavs;
    if (arg1.equals("warriors")) teamB = warriors;
    if (arg1.equals("celtics")) teamB = celtics;
    if (arg1.equals("cavs")) teamB = cavs;
    Team[] teams = {teamA,teamB};
    return teams;

}




    public static void main(String[] args){
       
        Team[] teams = setMatchup(args[0],args[1]);
        Game game = new Game(teams[0],teams[1]);
        game.playGame(teams[0],teams[1]);
    }
}
