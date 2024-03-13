package fr.lelouet.exercice31;

import java.util.ArrayList;

public class Fibonacci {
    public ArrayList<Long> suiteDeFibonacci = new ArrayList<Long>();

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long prev = 0, next = 1;
        for (int i = 2; i <= n; i++) {
            long sum = prev + next;
            prev = next;
            next = sum;
        }
        return next;
    }

    public Boolean isIntInFibonacci(Long n){
        return suiteDeFibonacci.contains(n);
    }

    public void print(){
        System.out.println(suiteDeFibonacci);
    }

    public Fibonacci(int index){
        for(int i=0; i<index; i++){
            suiteDeFibonacci.add(fibonacci(i));
        }
    }

    public static void main(String[] args){
        Fibonacci F = new Fibonacci(80);
        F.print();

        System.out.println(F.isIntInFibonacci(4182L));

        System.out.println(F.isIntInFibonacci(832040L));
        if (F.isIntInFibonacci(832040L)){
            System.out.println(F.suiteDeFibonacci.indexOf(832040L));
        }

        System.out.println(F.suiteDeFibonacci.stream().filter(e -> e%2==0).count());
        System.out.println(F.suiteDeFibonacci.stream().filter(e -> e > 1000000).findFirst());

    }
}
