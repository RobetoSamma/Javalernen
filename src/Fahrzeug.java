public class Fahrzeug {
    private String Marke;
    private String Modell;
    private int PS;
    private int Zylinder;
    public Fahrzeug(String Marke, String Modell, int PS, int Zylinder){
        this.Marke = Marke;
        this.Modell = Modell;
        this.PS = PS;
        this.Zylinder = Zylinder;
    }
    public void fahren(){

        System.out.println(this.Marke+" brum");

    }

    public String getPortfolio(){
        return "Das Auto ist ein " + this.Marke + this.Modell + " mit " + this.Zylinder + " Zylindern und " + this.PS;

    }

    public double Geschwindigkeit(){

        double Geschwindigkeit;

        Geschwindigkeit = this.PS * 1.2;

        return Geschwindigkeit;
    }


}
