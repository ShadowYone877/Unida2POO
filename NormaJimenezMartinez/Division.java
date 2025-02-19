// Nombre de la clase
class Division {

    // Atributos de la clase
    double num1, num2;

    // Constructor vacío de la clase
    Division() {
    }

    // Generar getters y setters de los atributos
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Division [num1=" + num1 + ", num2=" + num2 + "]";

    }
}