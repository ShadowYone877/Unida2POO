// Nombre de la clase
class MainM {

    // Método principal
    public static void main(String[] args) {

        // Creacion del primer objeto
        Multiplicacion mul1 = new Multiplicacion();
        // Asignacion de valores a los atributos del primer objeto
        mul1.setNum1(156);
        mul1.setNum2(98);

        // Creacion del segundo objeto
        Multiplicacion mul2 = new Multiplicacion();
        // Asignacion de valores a los atributos del segundo objeto
        mul2.setNum1(2);
        mul2.setNum2(4);

        // Impresion del resultado de la multiplicacion de ambos objetos
        System.out.println(mul1.getNum1() * mul1.getNum2());
        System.out.println(mul2.getNum1() * mul2.getNum2());

    }
}