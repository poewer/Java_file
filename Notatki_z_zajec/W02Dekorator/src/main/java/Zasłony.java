public class Zasłony extends DekoratorOkna {
    public Zasłony(Okno okno){
        super(okno);
    }

    @Override
    public void rysuj() {
        dekorowaneOkno.rysuj();
        System.out.println("Rysuję Zasłony");
    }
}
