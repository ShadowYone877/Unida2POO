


// Definimos la clase principal MainS
class MainSuma {
    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Se crean dos objetos de la clase Suma
        Suma sum = new Suma();
        Suma sum2 = new Suma();

        // Se asignan valores a las variables num y num2 del objeto sum
        sum.setNum(5);
        sum.setNum(8);

        // Se imprime el valor almacenado en num del objeto sum
        System.out.println(sum.getNum());

        // Se suman los valores de num de sum y sum2 y se guarda en z
        int z = sum.getNum() + sum.getNum2();
        System.out.println(z);

        // Se asignan valores a num y num2 del objeto sum2
        sum2.setNum(8);
        sum2.setNum2(10);

        // Se suman los valores de num y num2 de sum2 y se guarda en r
        int r = sum2.getNum() + sum2.getNum2();
        System.out.println(r);
    }
}

