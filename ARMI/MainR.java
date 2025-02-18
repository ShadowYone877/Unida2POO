class MainR {
    public static void main(String[] args) {
        Resta resta = new Resta();
        Resta resta2 = new Resta();
        resta.setNum1(10);
        resta.setNum2(20);
        resta2.setNum1(30);
        resta2.setNum2(40);
        System.out.println(resta.getNum1()-resta.getNum2());
        System.out.println(resta2.getNum1()-resta2.getNum2());
    }
}