// Definimos la clase principal MainDivision
class MainDivision {
    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Se crean dos objetos de la clase Division
        Division div = new Division();
        Division div2 = new Division();

        // Se asignan valores a las variables num y num2 del objeto div
        div.setNum(10);
        div.setNum2(2);

        // Se dividen los valores y se almacenan en z
        int z = div.getNum() / div.getNum2();
        System.out.println(z);

        // Se asignan valores a las variables num y num2 del objeto div2
        div2.setNum(20);
        div2.setNum2(4);

        // Se dividen los valores y se almacenan en r
        int r = div2.getNum() / div2.getNum2();
        System.out.println(r);
    }
}

