public class VectorPlusVector {
    // Сумма с другим вектором
    public static Vector plus(Vector that, Vector other) {
        double rx = that.getX() + other.getX();
        double ry = that.getY() + other.getY();
        double rz = that.getZ() + other.getZ();
        return new Vector(rx, ry, rz);
    }
}
