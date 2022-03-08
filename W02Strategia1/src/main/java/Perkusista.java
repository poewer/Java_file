public class Perkusista extends Muzyk{
    public Perkusista(String imie){
        super(imie);
    }

    @Override
    public void graj() {
        System.out.println(imie + ": Bum Bum");
    }
}
