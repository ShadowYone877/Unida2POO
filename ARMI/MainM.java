class MainM { // nombre de la clase
    public static void main(String[] args) { // nombre de la funcion
        Modulo modulo = new Modulo(); // declara primer objeto
        Modulo modulo2 = new Modulo();// declara segundo objeto
        modulo.setNum1(10);// asignar valor a la variable
        modulo.setNum2(20); // asignar valor a la variable
        modulo2.setNum1(30); // asignar valor a la variable
        modulo2.setNum2(40); // asignar valor a la variable
        System.out.println(modulo.getNum1()%modulo.getNum2());// imprime la operacion
        System.out.println(modulo2.getNum1()%modulo2.getNum2());// imprime la operacion
    }
}   