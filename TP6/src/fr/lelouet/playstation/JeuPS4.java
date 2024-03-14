package fr.lelouet.playstation;

public class JeuPS4 {
    private String titre;
    private int pegi;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String toString(){
        return getTitre() + " - " + getPegi();
    }

    public JeuPS4(String titre, int pegi){
        setTitre(titre);
        setPegi(pegi);
    }

    public boolean equals(Object o) {
        if(o==null)
            return false;
        if(!o.getClass().equals(getClass())) {
            return false;
        }
        JeuPS4 j = (JeuPS4) o;
        if (j.getTitre().equals(titre) && j.getPegi() == pegi){
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return titre.hashCode()+pegi;
    }


    public JeuPS4(){
        this("", 3);
    }
}
