public class VectorsRandom {
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
}
