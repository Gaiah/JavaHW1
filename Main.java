import java.util.Random;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
// 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i


        int i = new Random().nextInt(-1000, 1000);
        System.out.println("Random number: " + i);
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int absoluteI = Math.abs(i);
        String binaryNum;
        binaryNum = Integer.toBinaryString(absoluteI);
        System.out.println("The binary representation of the number " + absoluteI + " is: " + binaryNum);
        int n;
        n = binaryNum.length();
        System.out.println("n: " + n);

// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int m1ArrayLength = 0;
        int secondI = i;

        while (secondI < Short.MAX_VALUE) {
            if (secondI % n == 0) {
                m1ArrayLength++;
            }
            secondI++;
        }

        System.out.println("m1 Array Length: " + m1ArrayLength);

        int[] m1 = new int[m1ArrayLength];


        secondI = i;
        int m1Index = 0;

        while (secondI < Short.MAX_VALUE) {
            if (secondI % n == 0) {
                m1[m1Index] = secondI;
                m1Index++;
            }
            secondI++;

        }

//        String m1Array = Arrays.toString(m1);
//        System.out.println(m1Array);

//         4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int m2ArrayLength = 0;
        int shortMinVal = Short.MIN_VALUE;

        while (shortMinVal < i) {
            if (shortMinVal % n != 0) {
                m2ArrayLength++;
            }
            shortMinVal++;
        }

        System.out.println("m2 length: " + m2ArrayLength);

        int[] m2 = new int[m2ArrayLength];
        shortMinVal = Short.MIN_VALUE;
        int m2Index = 0;

        while (shortMinVal < i) {
            if (shortMinVal % n != 0) {
                m2[m2Index] = shortMinVal;
            }
            shortMinVal++;
        }

//        String m2Array = Arrays.toString(m1);
//        System.out.println(m2Array);
    }
}