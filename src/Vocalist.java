public class Vocalist extends Musician implements afterGig, beforeGig {
    private String tembre;
    private String guitar;
    private String amplifier;
    boolean isGuitarRequired;

    protected Vocalist (String name, String band, String tembre){
        super(name, band);
        //super(band);
        this.tembre = tembre;
        isGuitarRequired = false;
    }

    protected Vocalist (String name, String band, String tembre, String guitar, String amplifier){
        super(name, band);
        this.tembre = tembre;
        this.guitar = guitar;
        this.amplifier = amplifier;
        isGuitarRequired = true;
    }

    protected void introduce() {
        if(!isGuitarRequired)
        System.out.println("The vocalists name is "+ super.getName() + " and his tembre is " + tembre);
        else
        System.out.println("The vocalists name is "+ super.getName() + " and his tembre is " + tembre + " today he's also plaing the guitar " + guitar + " using amp " + amplifier);
    }
    protected void playMusic() {
        if(isGuitarRequired)
            System.out.println("Vocal line: la la la\nGuitar line: D2-D2-F2~A3-G2-x-x");
        else
            System.out.println("Vocal line: la la la");
    }

    public void greetings(){
        System.out.println("Hola! we are " + band);
    };
    public void finalSpeech(){
        System.out.println("Thank you very much, see you\n");
    };

}
