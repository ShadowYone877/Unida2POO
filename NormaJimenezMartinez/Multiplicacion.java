// Nombre de la clase
class Multiplicacion {

    // Atributos de la clase Division
    int num1, num2;

    // Constructor vacio de la clase
    Multiplicacion() {
    }

    // Generar getters y setters de los atributos
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // etodo toString
    @Override
    public String toString() {
        return "Multiplicacion [num1=" + num1 + ", num2=" + num2 + "]";

    }
}