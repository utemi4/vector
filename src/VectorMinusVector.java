public class VectorMinusVector {
    // Разность с другим вектором
    // a.minusVector(b) = a - b
    public static Vector minus(Vector that, Vector other) {
        double rx = that.getX() - other.getX();
        double ry = that.getY() - other.getY();
        double rz = that.getZ() - other.getZ();
        return new Vector(rx, ry, rz);
    }
}
