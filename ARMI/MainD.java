class MainD { //Main
    public static void main(String[] args) { //main
        Divison division = new Divison(); //declara primer objeto
        Divison division2 = new Divison(); //declara segundo objeto
        division.setNum1(10); //asignar valor a la variable
        division.setNum2(20); //asignar valor a la variable
        division2.setNum1(30);//asignar valor a la variable
        division2.setNum2(40); //asignar valor a la variable
        System.out.println(division.getNum1()/division.getNum2());//imprime la operacion
        System.out.println(division2.getNum1()/division2.getNum2()); //imprime la operacion
    }
}   