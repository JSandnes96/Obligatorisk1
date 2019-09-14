public class Oblig1 {

    //Oppgave 1

    public static int maks(int[] a){

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

    public static int ombyttninger(int[] a){

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

    //Oppgave 2

    public static int antallUlikeSortert(int[] a){
        int antallUlike = 0;

        for (int i = 0; i < a.length-1; i++ ){
            if(a[i] > a[i+1])
                throw new IllegalStateException("Tabellen må være sortert stigende");

            if(a[i+1]>a[i]){
                antallUlike++;
            }
        }

        return antallUlike;
    }

    //Oppgave 3

    public static int antallUlikeUsortert(int[] a){
        int en = 0;
        return en;
    }


    //Oppgave 4

    public static void delsortering(int[] a){

    }


    //Oppgave 5

    public static void rotasjon(char[] a){

    }


    //Oppgave 6

    public static void rotasjon(char[] a, int k){

    }


    //Oppgave 7

    public static String flett(String s, String t){
        return "Hei";
    }

    public static String flett(String s){
        return "Hei";
    }


    //Oppgave 8
    /*
    public static int[] indekssortering(int[] a){

    }*/


    //Oppgave 9
    /*
    public static int[] tredjeMin(int[] a){

    }*/


    //Oppgave 10

    public static boolean inneholdt(String a, String b){
        return true;
    }


}
