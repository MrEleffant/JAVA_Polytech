package fr.lelouet.jeu_carte;

public class StringImmuable {
    private String s1 = "toto";
    private String s2 = "toto";


    static public void main(String[] args ){
        StringImmuable TEST = new StringImmuable();
        System.out.println(TEST.s1 == TEST.s2);
        System.out.println(TEST.s1.equals(TEST.s2));

        String s3 = new String("toto");
        System.out.println(s3 == TEST.s1);
        System.out.println(s3.equals(TEST.s1));

    }
}
