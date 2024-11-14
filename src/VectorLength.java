public class VectorLength {
    // Длина вектора
    public static double getVectorLength(Vector vector) {
        return Math.sqrt(vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ());
    }

}
