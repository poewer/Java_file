public class Trebacz extends Muzyk{

    public Trebacz(String imie){
        super(imie);
    }

    @Override
    public void graj() {
        System.out.println(imie + ": Tu tu tu tu");
    }
}
