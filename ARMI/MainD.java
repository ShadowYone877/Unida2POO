class MainD {
    public static void main(String[] args) {
        Divison division = new Divison();
        Divison division2 = new Divison();
        division.setNum1(10);
        division.setNum2(20);
        division2.setNum1(30);
        division2.setNum2(40);
        System.out.println(division.getNum1()/division.getNum2());
        System.out.println(division2.getNum1()/division2.getNum2());
    }
}   