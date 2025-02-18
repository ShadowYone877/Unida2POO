class MainR { //Main
    public static void main(String[] args) { //main
        Resta resta = new Resta(); //declara primer objeto
        Resta resta2 = new Resta();     //declara segundo objeto
        resta.setNum1(10); //asignar valor a la variable
        resta.setNum2(20); //asignar valor a la variable
        resta2.setNum1(30); //asignar valor a la variable
        resta2.setNum2(40);    //asignar valor a la variable
        System.out.println(resta.getNum1()-resta.getNum2()); //imprime la operacion
        System.out.println(resta2.getNum1()-resta2.getNum2()); //imprime la operacion
    }
}