// Nombre de la clase
class MainD {

    // Método principal
    public static void main(String[] args) {

        // Creacion del primer objeto
        Division div1 = new Division();
        // Asignacion de valores a los atributos del primer objeto
        div1.setNum1(2);
        div1.setNum2(11);

        // Creacion del segundo objeto
        Division div2 = new Division();
        // Asignacion de valores a los atributos del segundo objeto
        div2.setNum1(23);
        div2.setNum2(80);

        // Impresión del resultado de la división de ambos objetos
        System.out.println(div1.getNum1() / div1.getNum2());
        System.out.println(div2.getNum1() / div2.getNum2());

    }
}