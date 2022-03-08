public class Main {
    public static void main(String[] args) {
        Okno okno = new ProsteOkno();
        okno = new Klamka(okno);
        okno = new Firanka(okno);
        okno = new Zasłony(okno);

        okno.rysuj();

        System.out.println("----------------------------");
        okno = okno.zdejmijOstatnioDodanyDekoracyjny();
        okno.rysuj();
        System.out.println("----------------------------");
        okno = okno.zdejmijOstatnioDodanyDekoracyjny();
        okno.rysuj();
        System.out.println("----------------------------");
        okno = okno.zdejmijOstatnioDodanyDekoracyjny();
        okno.rysuj();
        System.out.println("----------------------------");
        okno = okno.zdejmijOstatnioDodanyDekoracyjny();
        okno.rysuj();

    }
}
