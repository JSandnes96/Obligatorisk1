public class Main {

    public static void main(String[] args) {

        int[] test = {1,2,26,2,26,54,311};

        Oblig1 sort1 = new Oblig1();

        //System.out.println("Opppgave 1a: " +sort1.maks(test));
        //System.out.println("Oppgave 1b: " + sort1.ombyttninger(test));
        //System.out.println("Oppgave 2: " + sort1.antallUlikeSortert(test));

        sort1.rotasjon(test);

    }
}
