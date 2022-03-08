public class Firanka extends DekoratorOkna{

    public Firanka(Okno okno){
        super(okno);
    }

    @Override
    public void rysuj() {
        dekorowaneOkno.rysuj();
        System.out.println("Rysuję firankę");
    }
}
