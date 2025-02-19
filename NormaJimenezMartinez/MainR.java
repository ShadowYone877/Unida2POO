// Nombre de la clase
class MainR {

    // Método principal
    public static void main(String[] args) {

        // Creacion del primer objeto
        Resta res1 = new Resta();
        // Asignacion de valores a los atributos del primer objeto
        res1.setNum1(-2);
        res1.setNum2(19);

        // Creacion del segundo objeto
        Resta res2 = new Resta();
        // Asignacion de valores a los atributos del segundo objeto
        res2.setNum1(10);
        res2.setNum2(-47);

        // Impresion del resultado de la resta de ambos objetos
        System.out.println(res1.getNum1() - res1.getNum2());
        System.out.println(res2.getNum1() - res2.getNum2());

    }
}