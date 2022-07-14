public class Datatypes {

    static int zahl = 10;
    static float kommazahl = 69.420f;
    static double kommazahl2 = 69.420;

    static String message = "Hallo";

    static boolean statement = true;

    static int[] intarray = {1, 2, 3, 4, 5};


    static Fahrzeug Audi = new Fahrzeug("Audi","TT",150, 8);
    static Fahrzeug VW = new Fahrzeug("VW", "Polo", 75, 6);

    public static void main(String[] args) {

        System.out.println( (kommazahl < kommazahl2) || zahl != 10);
        System.out.println(intarray[intarray.length - 1]);

        Audi.fahren();
        VW.fahren();

        System.out.println(Audi.getPortfolio());
        System.out.println(Audi.Geschwindigkeit());
        // hallo
        /*
        System.out.print(zahl);
        System.out.print(kommazahl);
        System.out.print(kommazahl2);
        System.out.print(message);
    */
    }



}
