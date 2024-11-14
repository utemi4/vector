// Класс для хранения векторов
public class Vector {

    private double x;
    private double y;
    private double z;

    // Конструктор
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public void setX(double num) {
        this.x = num;
    }

    public void setY(double num) {
        this.y = num;
    }

    public void setZ(double num) {
        this.z = num;
    }

    @Override
    public String toString() {
        String mes = "( " + this.x + " ; " + this.y + " ; " + this.z + " )";
        return mes;
    }

}
