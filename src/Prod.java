public class Prod implements Formula{
    private Formula f1;
    private Formula f2;

    public Prod(Formula f1, Formula f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public String asString() {
        return "la chaine de produit est :("+f1.asString()+","+f2.asString()+")";
    }

    @Override
    public double asValue() {
        return f1.asValue()*f2.asValue();
    }
}
