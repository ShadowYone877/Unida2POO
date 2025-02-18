class MainMul { //Main
    public static void main(String[] args) { //main
        Multiplicacion multiplicacion = new Multiplicacion(); //declara primer objeto
        Multiplicacion multiplicacion2 = new Multiplicacion(); //declara segundo objeto
        multiplicacion.setNum1(10); //asignar valor a la variable
        multiplicacion.setNum2(20); //asignar valor a la variable
        multiplicacion2.setNum1(30); //asignar valor a la variable
        multiplicacion2.setNum2(40); //asignar valor a la variable
        System.out.println(multiplicacion.getNum1()*multiplicacion.getNum2()); //imprime la operacion
        System.out.println(multiplicacion2.getNum1()*multiplicacion2.getNum2()); //imprime la operacion
    }
}   