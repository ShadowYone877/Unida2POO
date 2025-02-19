// Nombre de la clase
class Suma {

    // Atributos de la clase Division
    int num1, num2;

    // Constructor vacio de la clase
    Suma() {
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

    // Metodo toString
    @Override
    public String toString() {
        return "Suma [num1=" + num1 + ", num2=" + num2 + "]";

    }
}