public abstract class DekoratorOkna  implements Okno{
    protected Okno dekorowaneOkno;

    public DekoratorOkna(Okno dekorowaneOkno){
        this.dekorowaneOkno = dekorowaneOkno;
    }

    @Override
    public Okno zdejmijOstatnioDodanyDekoracyjny() {
        return dekorowaneOkno;
    }
}
