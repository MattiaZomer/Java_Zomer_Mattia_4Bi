package classi;

public class Stagione {
    int episodi;
    String sceneggiatore;
    String trama;
    int stagione;

    public Stagione() {
        episodi = 0;
        sceneggiatore = "Ignoto";
        stagione = 1;
    }
    
    public Stagione(int episodi, int stagione, String sceneggiatore, String trama) {
        setEpisodi(episodi);
        this.stagione = stagione;
        this.sceneggiatore = sceneggiatore;
        this.trama = trama;
    }
    
    
    public void setEpisodi(int episodi) {
        if (episodi < 0) {
            episodi = 0;
            System.err.print("Attenzione! Gli episodi inseriti sono meno di 0. La quantità di episodi ora è 0");
        } else {
            this.episodi = episodi;
        }
    }
    
    public void setTrama(String trama) {
        this.trama = trama;
    }
    
    public void setStagione(int stagione) {
        // Il controllo per verificare se ci sono due numeri uguali lo faccio in Telefilm
        // Se in Telefilm vedo che ci sono 2 stagioni con lo stesso numero, lo cambio col setter
        if (stagione < 1) {
            stagione = 1;
            System.err.print("Attenzione! Il numero della stagione è inferiore a 1. La stagione ora è stata preimpostata a 1");
        }
        this.stagione = stagione;
    }
    
    
    public void setSceneggiatore(String sceneggiatore) {
        this.sceneggiatore = sceneggiatore;
    }
    
    public String getTrama() {
        return trama;
    }
    
    public int getStagione() {
        return stagione;
    }
    
    public String getSceneggiatore() {
        return sceneggiatore;
    }
    
    public int getEpisodi() {
        return episodi;
    }
}
