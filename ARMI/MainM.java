class MainM {
    public static void main(String[] args) {
        Modulo modulo = new Modulo();
        Modulo modulo2 = new Modulo();
        modulo.setNum1(10);
        modulo.setNum2(20);
        modulo2.setNum1(30);
        modulo2.setNum2(40);
        System.out.println(modulo.getNum1()%modulo.getNum2());
        System.out.println(modulo2.getNum1()%modulo2.getNum2());
    }
}   