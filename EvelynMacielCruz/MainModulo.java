// Definimos la clase principal MainModulo
class MainModulo {
    // Método principal donde inicia la ejecución del programa
    public static void main(String[] args) {
        // Se crean dos objetos de la clase Modulo
        Modulo mod = new Modulo();
        Modulo mod2 = new Modulo();

        // Se asignan valores a las variables num y num2 del objeto mod
        mod.setNum(10);  // Primer número
        mod.setNum2(3);   // Segundo número (divisor)

        // Se calcula el módulo (residuo) de la división num % num2 y se almacena en z
        int z = mod.getNum() % mod.getNum2();
        System.out.println("El residuo de 10 % 3 es: " + z);

        // Se asignan valores a las variables num y num2 del objeto mod2
        mod2.setNum(20);  // Primer número
        mod2.setNum2(4);   // Segundo número (divisor)

        // Se calcula el módulo (residuo) de la división num % num2 y se almacena en r
        int r = mod2.getNum() % mod2.getNum2();
        System.out.println("El residuo de 20 % 4 es: " + r);
    }
}