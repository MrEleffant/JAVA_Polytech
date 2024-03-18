import fr.lelouet.playstation.*;

public class Main {
    public static void main(String[] args) {
        JeuPS4 rayman = new JeuPS4("Rayman", 7);
        JeuPS4 godOfWar = new JeuPS4("GOW", 3);
        
        /*
        MesJeux collec = new MesJeux();

        collec.addJeu(rayman);
        System.out.println(collec.size());

        collec.addJeu(godOfWar);
        System.out.println(collec.size());

        System.out.println(collec.toString());

        collec.removeJeu(rayman);
        System.out.println(collec.toString());

        collec.removeJeu("GOW");
        System.out.println(collec.toString());
        */


        Mesjeux2 collec2 = new Mesjeux2();

        System.out.println(collec2.add(rayman));
        System.out.println(collec2);

        System.out.println(collec2.add("Rayman", 7));
        System.out.println(collec2);


        System.out.println("here " + collec2.getJeu("Rayman"));


    }
}