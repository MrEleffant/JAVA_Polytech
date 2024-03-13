package fr.lelouet.exercice5A;

public class Exercice5A implements CharSequence {

    public String reversedString;

    @Override
    public int length() {
        return reversedString.length();
    }

    @Override
    public char charAt(int index) {
        return reversedString.charAt(index);
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public String toString(){
        return reversedString;
    }

    // setter that reverse the string
    public void setReversedString(String reversedString) {
        this.reversedString = new StringBuilder(reversedString).reverse().toString();
    }

    public Exercice5A(String str){
        setReversedString(str);
    }

    public static void main(String[] args){
        Exercice5A test = new Exercice5A("alphabet");
        System.out.println(test.toString());
        System.out.println(test.charAt(test.length()-1));
        System.out.println(test.charAt(0));
    }
}
