public class ProsteOkno implements Okno{

    @Override
    public void rysuj() {
     System.out.println("Rysuję proste okno");
    }

    @Override
    public Okno zdejmijOstatnioDodanyDekoracyjny() {
//        throw new UnsupportedOperationException("Not supported");
//        return null;
        return this;
    }
}
