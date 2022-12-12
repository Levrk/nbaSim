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
    Player KevonLooney = new Player(67,0, "Kevon Looney");
    int[] warriorsShooters = {0,0,0,1,1,1,2,3,3,4};
    int[] warriorsRebounders = {0,1,2,2,3,3,4,4};
    int[] warriorsPassers = {0,0,1,2,2,3,4};
    Player[] warriorsRoster = {StephenCurry,KlayThompson,DraymondGreen,AndrewWiggins,KevonLooney};
    Team warriors = new Team("Warriors",warriorsRoster,warriorsShooters,warriorsRebounders,warriorsPassers,26,71,70,16);
    return warriors;
}

public  static Team cavsSetup(){
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

public static Team bucksSetup(){
    //sets up nets instances
    Player greekfreak = new Player(55,26,"Giannis Antetokounmpo");
    Player JHoliday = new Player(45,34,"Jrue Holiday");
    Player BLopez = new Player(49,41, "Brooke Lopez");
    Player BPortis = new Player(49,32,"Bobby Portis");
    Player KMiddleton = new Player(36,31, "Khris Middleton");
    int[] bucksShooters = {0,0,0,1,1,2,3,4,4};
    int[] bucksRebounders = {0,0,1,2,2,3,4};
    int[] bucksPassers = {0,0,1,1,1,2,3,4,4};
    Player[] bucksRoster = {greekfreak,JHoliday,BLopez,BPortis,KMiddleton};
    Team bucks = new Team("Bucks",bucksRoster,bucksShooters,bucksRebounders,bucksPassers,30,75,61,15);
    return bucks;
}


public static Team netsSetup(){
    //sets up nets instances
    Player kd = new Player(55,35,"Kevin Durant");
    Player kyrie = new Player(48,32,"Kyrie Irving");
    Player nicClaxton = new Player(47,42, "Nic Claxton");
    Player sethCurry = new Player(49,32,"Seth Curry");
    Player benSimmons = new Player(61,0, "Ben Simmons");
    int[] netsShooters = {0,0,0,1,1,1,2,3};
    int[] netsRebounders = {0,0,1,2,2,3,4};
    int[] netsPassers = {0,0,1,1,2,3,4,4};
    Player[] netsRoster = {kd,kyrie,nicClaxton,sethCurry,benSimmons};
    Team nets = new Team("Nets",netsRoster,netsShooters,netsRebounders,netsPassers,22,68,63,15);
    return nets;
}

    public static Team nuggetsSetup(){
        //sets up nuggets instances
        Player jokic = new Player(63,32,"Nicola Jokic");
        Player jamalMurray = new Player(43,36,"Jamal Murray");
        Player AaronGordon = new Player(61,40, "Aaron Gordon");
        Player mpj = new Player(47,43,"Michael Porter Jr.");
        Player kcp = new Player(46,46, "Kentavius Caldwell-Pope");
        int[] nuggetsShooters = {0,0,0,1,1,1,2,2,3,4};
        int[] nuggetsRebounders = {0,0,0,2,2,1,3,4};
        int[] nuggetsPassers = {0,0,0,1,1,2,3,4};
        Player[] nuggetsRoster = {jokic,jamalMurray,AaronGordon,mpj,kcp};
        Team nuggets = new Team("Nuggets",nuggetsRoster,nuggetsShooters,nuggetsRebounders,nuggetsPassers,22,68,63,15);
        return nuggets;
    }

    public static Team heatSetup(){
        //sets up heat instances
        Player JButler = new Player(53,38,"Jimmy Butler");
        Player KLowry = new Player(40,35,"Kyle Lowry");
        Player MStrus = new Player(42,35, "Max Strus");
        Player THerro = new Player(45,38,"Tyler Herro");
        Player BAdebayo = new Player(53,10, "Bam Adebayo");
        int[] heatShooters = {0,0,0,1,1,2,2,3,4,4,4};
        int[] heatRebounders = {0,0,1,2,3,3,4,4,4};
        int[] heatPassers = {0,0,1,1,2,3,4};
        Player[] heatRoster = {JButler,KLowry,MStrus,THerro,BAdebayo};
        Team heat = new Team("Heat",heatRoster,heatShooters,heatRebounders,heatPassers,26,73,62,15);
        return heat;
    }

    public static Team sunsSetup(){
        //sets up suns instances
        Player DBooker = new Player(48,38,"Devin Booker");
        Player CPaul = new Player(38,32,"Chris Paul");
        Player Cjohnson = new Player(45,43, "Cam Johnson");
        Player MBridges = new Player(49,43,"Mikal Bridges");
        Player DAyton = new Player(63,31, "Deandre Ayton");
        int[] sunsShooters = {0,0,0,1,2,3,3,4,4};
        int[] sunsRebounders = {0,0,1,2,2,3,3,4,4,4,4};
        int[] sunsPassers = {0,0,1,1,1,2,3,4};
        Player[] sunsRoster = {DBooker,CPaul,Cjohnson,MBridges,DAyton};
        Team suns = new Team("Suns",sunsRoster,sunsShooters,sunsRebounders,sunsPassers,32,72,63,14);
        return suns;
    }

    public static Team hawksSetup(){
        //sets up hawks instances
        Player TYoung = new Player(41,29,"Trey Young");
        Player DMurray = new Player(45,37,"Dejounte Murray");
        Player BBogdonavic= new Player(42,39, "Bogdan Bogdonavic");
        Player JCollins = new Player(48,22,"John Collins");
        Player ClintCapela = new Player(63,0, "Clint Capela");
        int[] hawksShooters = {0,0,0,1,1,2,2,3,3,4,4};
        int[] hawksRebounders = {0,1,2,3,3,4,4};
        int[] hawksPassers = {0,0,0,1,1,2,3,4};
        Player[] hawksRoster = {TYoung,DMurray,BBogdonavic,JCollins,ClintCapela};
        Team hawks = new Team("Hawks",hawksRoster,hawksShooters,hawksRebounders,hawksPassers,29,72,55,13);
        return hawks;
    }



public static Team[] setMatchup(String arg0, String arg1){
    //sets up matchup as array of two teams

    //setting up team instances
    Team warriors = warriorsSetup();
    Team celtics = celticsSetup();
    Team cavs = cavsSetup();
    Team bucks = bucksSetup();
    Team nets = netsSetup();
    Team nuggets = nuggetsSetup();
    Team heat = heatSetup();
    Team suns = sunsSetup();
    Team hawks = hawksSetup();
    Team teamA = null;
    Team teamB = null;
    //checking CL arguments
    if (arg0.equals("warriors"))  teamA = warriors;
    if (arg0.equals("celtics")) teamA = celtics;
    if (arg0.equals("cavs")) teamA = cavs;
    if (arg0.equals("bucks")) teamA = bucks;
    if (arg0.equals("nets")) teamA = nets;
    if (arg0.equals("nuggets")) teamA = nuggets;
    if (arg0.equals("heat")) teamA = heat;
    if (arg0.equals("suns")) teamA = suns;
    if (arg0.equals("hawks")) teamA = hawks;

    if (arg1.equals("warriors")) teamB = warriors;
    if (arg1.equals("celtics")) teamB = celtics;
    if (arg1.equals("cavs")) teamB = cavs;
    if (arg1.equals("bucks")) teamB = bucks;
    if (arg1.equals("nets")) teamB = nets;
    if (arg1.equals("nuggets")) teamB = nuggets;
    if (arg1.equals("heat")) teamB = heat;
    if (arg1.equals("suns")) teamB = suns;
    if (arg1.equals("hawks")) teamB = hawks;

    Team[] teams = {teamA,teamB};
    return teams;

}




    public static void main(String[] args){
       
        Team[] teams = setMatchup(args[0],args[1]);
        Game game = new Game(teams[0],teams[1]);
        game.playGame(teams[0],teams[1]);
    }
}
