// Nombre de la clase
class MainMod {

    // Método principal
    public static void main(String[] args) {

        // Creacion del primer objeto
        Modulo mod1 = new Modulo();
        // Asignacion de valores a los atributos del primer objeto
        mod1.setNum1(90);
        mod1.setNum2(7);

        // Creacion del segundo objeto
        Modulo mod2 = new Modulo();
        // Asignacion de valores a los atributos del segundo objeto
        mod2.setNum1(42);
        mod2.setNum2(5);

        // Impresion del resultado de la operacion de modulo de ambos objetos
        System.out.println(mod1.getNum1() % mod1.getNum2());
        System.out.println(mod2.getNum1() % mod2.getNum2());

    }
}