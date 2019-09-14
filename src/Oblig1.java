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

    //Oppgave 3

    public static int antallUlikeUsortert(int[] a){
        int en = 0;
        return en;
    }


    //Oppgave 4

    public static void delsortering(int[] a){

    }


    //Oppgave 5

    public static void rotasjon(int[] a){//SKAL VÆRE CHAR

        System.out.println("Urotert er: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

        for(int i = 0; i < a.length; i++){
            int siste = a.length-1;
            for (int j = a.length-1; j> 0; j--){
                a[j]=a[j-1];
            }
            a[0] = siste;
        }
        System.out.println("Rotert er: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

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
