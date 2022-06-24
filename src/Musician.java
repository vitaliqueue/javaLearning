public abstract class Musician {
    private String name;
    protected static String band;
    Musician(String name, String band) {
        this.band = band;
        this.name = name;
    }
    protected String getName() {return name;}
    protected static String getBand() {return band;}
    protected abstract void introduce();
    protected abstract void playMusic();
}
