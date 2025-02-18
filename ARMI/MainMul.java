class MainMul {
    public static void main(String[] args) {
        Multiplicacion multiplicacion = new Multiplicacion();
        Multiplicacion multiplicacion2 = new Multiplicacion();
        multiplicacion.setNum1(10);
        multiplicacion.setNum2(20);
        multiplicacion2.setNum1(30);
        multiplicacion2.setNum2(40);
        System.out.println(multiplicacion.getNum1()*multiplicacion.getNum2());
        System.out.println(multiplicacion2.getNum1()*multiplicacion2.getNum2());
    }
}   