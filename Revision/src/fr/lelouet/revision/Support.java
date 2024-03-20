package fr.lelouet.revision;

public class Support {
    public enum supports {PC, PS4, PS5}
    private supports nom;

    public supports getNom() {
        return nom;
    }

    public void setNom(supports nom) {
        this.nom = nom;
    }

    public String toString(){
        return getNom().toString();
    }

    public Support(supports var){
        setNom(var);
    }

    public Support(){
        this(supports.PC);
    }
}
