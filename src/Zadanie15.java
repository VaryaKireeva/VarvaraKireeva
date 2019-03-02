import java.util.Arrays;

public class Zadanie15 {
        public static void main(String[] args) {
            int [] massiv = {11, 3, 14, 16, 7, 8, 12, 19, 24};

            boolean isSorted = false;
            int a;
            while(!isSorted) {
                isSorted = true;
                for (int i = 0; i < massiv.length-1; i++) {
                    if(massiv[i] > massiv[i+1]){
                        isSorted = false;

                        a = massiv[i];
                        massiv[i] = massiv[i+1];
                        massiv[i+1] = a;
                    }
                }
            }
            System.out.println(Arrays.toString(massiv));
        }
    }

