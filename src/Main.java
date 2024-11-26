public class Main {
    public static void main(String[] args) {
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4);
        Variable z = new Variable("z", 3);

        Formula formula = new Sum(x,y,z);
        System.out.println(formula.asString());
        System.out.println(formula.asValue());
        System.out.println("kfkfk");
    }
}
