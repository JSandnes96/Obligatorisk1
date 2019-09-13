public class Main {

    public static void main(String[] args) {

        int[] test = {31,14,42,34,3,4,4};

        Oblig1 sort1 = new Oblig1();

        System.out.println(sort1.maks(test) + " " + sort1.ombyttninger(test));
        System.out.println(sort1.antallUlikeSortert(test));
    }
}
