class MainS {
    public static void main(String[] args) {
        Suma suma = new Suma();
        Suma suma2 = new Suma();
        suma.setNum1(10);
        suma.setNum2(20);
        suma2.setNum1(30);
        suma2.setNum2(40);
        System.out.println(suma.getNum1()+suma.getNum2());
        System.out.println(suma2.getNum1()+suma2.getNum2());
    }
}