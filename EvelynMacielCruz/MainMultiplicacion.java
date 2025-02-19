// Definimos la clase principal MainMultiplicacion
class MainMultiplicacion {
    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Se crean dos objetos de la clase Multiplicacion
        Multiplicacion mul = new Multiplicacion();
        Multiplicacion mul2 = new Multiplicacion();

        // Se asignan valores a las variables num y num2 del objeto mul
        mul.setNum(3);
        mul.setNum2(4);

        // Se multiplican los valores y se almacenan en z
        int z = mul.getNum() * mul.getNum2();
        System.out.println(z);

        // Se asignan valores a las variables num y num2 del objeto mul2
        mul2.setNum(5);
        mul2.setNum2(6);

        // Se multiplican los valores y se almacenan en r
        int r = mul2.getNum() * mul2.getNum2();
        System.out.println(r);
    }
}