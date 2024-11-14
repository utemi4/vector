public class VectorCrossProduct {
    // Векторное произведение с другим вектором
    // так как результат зависит от порядка, то
    // getCrossProduct(a, b) = [a x b]
    public static Vector getCrossProduct(Vector that, Vector other) {
        double rx = that.getY() * other.getZ() - that.getZ() * other.getY();
        double ry = that.getZ() * other.getX() - that.getX() * other.getZ();
        double rz = that.getX() * other.getY() - that.getY() * other.getX();
        return new Vector(rx, ry, rz);
    }

}
