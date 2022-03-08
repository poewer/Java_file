public class Klamka extends DekoratorOkna{

    public Klamka(Okno okno){
     super(okno);
    }

    @Override
    public void rysuj() {
        dekorowaneOkno.rysuj();
        System.out.println("rysuję klamkę");
    }
}
