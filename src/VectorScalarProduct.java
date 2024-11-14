public class VectorScalarProduct {
    // Скалярное произведение с другим вектором
    public static double getScalarProduct(Vector that, Vector other) {
        return that.getX() * other.getX() + that.getY() * other.getY() + that.getZ() * other.getZ();
    }

}
