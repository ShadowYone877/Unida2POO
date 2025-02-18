class MainS { //Main
    public static void main(String[] args) { //main
        Suma suma = new Suma(); //declara primer objeto
        Suma suma2 = new Suma(); //declara segundo objeto
        suma.setNum1(10); //asignar valor a la variable
        suma.setNum2(20); //asignar valor a la variable
        suma2.setNum1(30);    //asignar valor a la variable
        suma2.setNum2(40); //asignar valor a la variable
        System.out.println(suma.getNum1()+suma.getNum2()); //imprime la operacion
        System.out.println(suma2.getNum1()+suma2.getNum2()); //imprime la operacion
    } 
} 