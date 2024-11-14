// 2 вариант

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

    // Длина вектора
    public double getVectorLength() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    // Скалярное произведение с другим вектором
    public double getScalarProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // Векторное произведение с другим вектором
    // так как результат зависит от порядка, то
    // a.getCrossProduct(b) = [a x b]
    public Vector getCrossProduct(Vector other) {
        double rx = this.y * other.z - this.z * other.y;
        double ry = this.z * other.x - this.x * other.z;
        double rz = this.x * other.y - this.y * other.x;
        return new Vector(rx, ry, rz);
    }

    // Косинус угла между векторами
    // Оба вектора должны быть ненулевые
    public double getCosAngle(Vector other) {
        if (this.getVectorLength() != 0 && other.getVectorLength() != 0) {
            return this.getScalarProduct(other) / (this.getVectorLength() * other.getVectorLength());
        } else {
            return Double.NaN;
        }
    }

    // Сумма с другим вектором
    public Vector plusVector(Vector other) {
        double rx = this.x + other.x;
        double ry = this.y + other.y;
        double rz = this.z + other.z;
        return new Vector(rx, ry, rz);
    }

    // Разность с другим вектором
    // a.minusVector(b) = a - b
    public Vector minusVector(Vector other) {
        double rx = this.x - other.x;
        double ry = this.y - other.y;
        double rz = this.z - other.z;
        return new Vector(rx, ry, rz);
    }

    // Массив случайных векторов
    // Чтобы задать всевозможные направления, достаточно задать вектора к точкам на
    // единичной сфере
    public static Vector[] makeRandomVectors(int N) {
        if (N <= 0) {
            System.out.println("Должен быть хотя бы 1 вектор");
            System.exit(1);
        }
        Vector[] arrVectors = new Vector[N];
        double phi, theta;
        double vx, vy, vz;
        for (int i = 0; i < N; i++) {
            phi = 2 * Math.PI * Math.random();
            theta = Math.PI * Math.random();
            vx = Math.sin(theta) * Math.sin(phi);
            vy = Math.sin(theta) * Math.cos(phi);
            vz = Math.cos(theta);
            arrVectors[i] = new Vector(vx, vy, vz);
        }
        return arrVectors;
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