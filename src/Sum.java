public class Sum implements Formula {
    private Formula[] formulas;

    public Sum(Formula... formulas) {
        this.formulas = formulas;
    }


    @Override
    public String asString() {
        String result = "(";
        for (int i = 0; i < formulas.length; i++) {
            result += formulas[i].asString();
            if (i < formulas.length - 1) {
                result += "+";
            }
        }
        result += ")";
        return result;

    }

    @Override
    public double asValue() {
        double sum = 0;
       for(int i=0;i<formulas.length;i++){
           sum +=formulas[i].asValue();
       }
       return sum;
    }
}
