public class VectorCosAngle {
    // Косинус угла между векторами
    // Оба вектора должны быть ненулевые
    public static double getCosAngle(Vector that, Vector other) {
        if (VectorLength.getVectorLength(that) == 0 && VectorLength.getVectorLength(that) == 0) {
            return Double.NaN;
        }
        return VectorScalarProduct.getScalarProduct(that, other)
                / (VectorLength.getVectorLength(that) * VectorLength.getVectorLength(that));
    }

}