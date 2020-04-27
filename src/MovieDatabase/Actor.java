package MovieDatabase;

public class Actor extends Premiu {
    private String nume;
    private int varsta;
    private Premiu[] premii;

    public Actor (String nume, int varsta, Premiu[] premii ){
        this.nume=nume;
        this.varsta=varsta;
        this.premii=premii;
    }
    public String getNume(){
        return nume;

    }
    public int getVarsta(){
        return varsta;

    }
    public Premiu[] getPremii(){
        return premii;

    }

}
