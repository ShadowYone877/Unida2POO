// Nombre de la clase
class MainS {

    // Metodo principal
    public static void main(String[] args) {

        // Creacion del primer objeto
        Suma sum1 = new Suma();
        // Asignacion de valores a los atributos del primer objeto
        sum1.setNum1(8);
        sum1.setNum2(15);

        // Creacion del segundo objeto
        Suma sum2 = new Suma();
        // Asignacion de valores a los atributos del segundo objeto
        sum2.setNum1(28);
        sum2.setNum2(231);

        // Impresion de los resultados de la suma de ambos objetos
        System.out.println(sum1.getNum1() + sum1.getNum2());
        System.out.println(sum2.getNum1() + sum2.getNum2());

    }
}