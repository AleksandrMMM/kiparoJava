public class Tsk1 {
    public static void main(String[] args) {
        int[] floats = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        zero99(floats);
        minMax(floats);


    }

    public static void zero99(int[] floats) {

        float min = floats[0];
        for (int i = 0; i < floats.length; i++) {

            if (min > floats[i]) {
                min = floats[i];
            }

        }
        System.out.println(min);

        float max = floats[0];

        for (int i = 0; i < floats.length; i++) {
            if (max < floats[i]) {
                max = floats[i];
            }


        }
        System.out.println(max);
    }

    public static void minMax(int[] floats) {
        int min = floats[0];
        int count = 0;
        for (int i = 0; i < floats.length; i++) {
            if (min > floats[i]) {
                min = floats[i];
                count = i;

            }

        }
        floats[count] = 0;
        for (int f: floats) {
            System.out.println(f);
        }

        float max = floats[0];
        int count1 = 0;

        for (int i = 0; i < floats.length; i++) {
            if (max < floats[i]) {
                max = floats[i];
                count1 = i;
            }

            }
        floats[count1] = 99;
        for (float f: floats) {
            System.out.println(f);


        }

    }
}

