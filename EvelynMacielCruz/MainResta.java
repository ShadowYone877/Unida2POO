// Definimos la clase principal MainR
class MainResta {
    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Se crean dos objetos de la clase Resta
        Resta res = new Resta();
        Resta res2 = new Resta();

        // Se asignan valores a las variables num y num2 del objeto res
        res.setNum(9);
        res.setNum2(20);

        // Se resta num - num2 y se almacena en z
        int z = res.getNum() - res.getNum2();
        System.out.println(z);

        // Se asignan valores a las variables num y num2 del objeto res2
        res2.setNum(1);
        res2.setNum2(4);

        // Se resta num - num2 de res2 y se almacena en r
        int r = res2.getNum() - res2.getNum2();
        System.out.println(r);
    }
}