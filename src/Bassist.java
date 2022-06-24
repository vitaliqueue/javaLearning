public class Bassist  extends Musician{
    private String instrument;
    private String amplifier;
    protected Bassist(String name, String band, String instrument, String amplifier){
        super(name, band);
        this.instrument = instrument;
        this.amplifier = amplifier;
    }
    protected void introduce() {
        System.out.println("The bassist name is "+ super.getName() + " and his istrument is " + instrument + " and his amplifier is " + amplifier);
    }

    protected void playMusic() {
        System.out.println("Bass line: D1-D1-F1~A2-G1-x-x");
    }
}
