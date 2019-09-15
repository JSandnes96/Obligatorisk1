package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {

        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen er tom");

        for (int i = 0; i < a.length-1; i++ ){
            if(a[i]>a[i+1]){
                int verdi = a[i];
                a[i] = a[i+1];
                a[i+1] = verdi;
            }
        }
        return a[a.length-1];
    }


    public static int ombyttinger(int[] a) {

        int teller = 0;

        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen er tom");

        for (int i = 0; i < a.length-1; i++ ){
            if(a[i]>a[i+1]){
                int verdi = a[i];
                a[i] = a[i+1];
                a[i+1] = verdi;
                teller++;
            }
        }
        return teller;
    }



    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        int antallUlike = 1; //maa starte på en siden det alltid vil vaere en ulik med mindre arrayet er tomt

        for (int i = 0; i < a.length-1; i++ ){

            if(a[i+1]>a[i]){
                antallUlike++;
            }

            if(a[i] > a[i+1])
                throw new IllegalStateException("Tabellen må være sortert stigende");
        }

        if(a.length == 0){
            antallUlike = 0; //Hvis arrayet er tomt er det 0 ulike
        }

        return antallUlike;
    }



    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        int antallUlike = 0;

        for(int i = 0; i < a.length; i++){
            antallUlike++;
        }

        return antallUlike;
    }



    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {
        throw new NotImplementedException();
    }



    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        System.out.println("\nUrotert er: " + Arrays.toString(a));

        //DENNE SKRIVER UT SAMME ARRAY PÅ NYTT
        /*for(int i = 0; i < a.length; i++){
            char siste = a[a.length-1];
            int j;
            for (j = a.length-1; j> 0; j--){
                a[j]=a[j-1];
            }
            a[0] = siste;
        }*/

        //DENNE SKRIVER UT RIKTIG MEN HAR LAGD NYTT ARRAY :(

        char[] b = new char[a.length];

        for(int i = 0; i <= a.length-1; i++){
            b[(i+1) % a.length ] = a[i];
        }

        System.out.println("\nRotert er: " + Arrays.toString(b));
    }



    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {

        throw new NotImplementedException();
    }



    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {

        throw new NotImplementedException();
    }

    /// 7b)
    public static String flett(String... s) {

        throw new NotImplementedException();
    }



    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {

        throw new NotImplementedException();
    }



    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {

        throw new NotImplementedException();
    }



    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {

        throw new NotImplementedException();
    }

    public static boolean inneholdt(String a, String b) {

        throw new NotImplementedException();
    }

}  // Oblig1
