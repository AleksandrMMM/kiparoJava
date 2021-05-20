public class Task2 {
    public static void main(String[] args) {
        float[] floats = {2.00f, 3.00f, 5.00f, 7.00f, 6.00f, 5.00f, 7.00f, 3.00f, 7.00f, 20.00f};
        povtor(floats);
    }

    public static void povtor(float[] floats) {
        float count = 0;
        int cont = 0;

        for (int i = 0; i < floats.length; i++) {
            for (int j = 0; j < floats.length; j++) {
                if (floats[j] == floats[i]) {
                    count = floats[i];
                    cont++;
                }

            }

        }
        System.out.printf("%f - повторений %d", count, cont);
    }
}
