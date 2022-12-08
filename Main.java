public class Main {
    

public static Team celticsSetup(){
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



    public static void main(String[] args){
       
        Team warriors = warriorsSetup();
        Team celtics = celticsSetup();

        Game game = new Game(celtics,warriors);
        game.playGame(celtics,warriors);
    }
}
