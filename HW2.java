//import java.util.Arrays;
//
//public class HW2 {
//
////1. Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
//
//    public static void main(String[] args) {
//
//        String a = "мир";
//        String b = "Миaрf миaaрas миee3gр орпоб мсоилнышкор мasdasир !";
//
//        String min;
//        String max;
//
//        if (a.length() > b.length()){
//            min = b;
//            max = a;
//
//        }
//        else {
//            min = a;
//            max = b;
//        }
//
//        int[] ind = new int[max.length()];
//        int[] rightIndexes = new int[max.length()];
//        int theShortestLen = Short.MAX_VALUE;
//
//        window(min, max, ind);
//
//        int[] finalArrInd = winLength(ind, min, max, rightIndexes);
//        System.out.println(Arrays.toString(finalArrInd));
//
//        int finalLength = minLength(finalArrInd, theShortestLen);
//        System.out.println("Наименьшее вхождение: " + finalLength);
//    }
//
//    static int[] window(String min, String max, int[] ind){
//        int k = 0;
//
//        for (int i = 0; i < max.length(); i++) {
//            for (int j = 0; j < min.length(); j++) {
//                if (min.charAt(j) == max.charAt(i)) {
//                    ind[k] = i;
//                    k++;
//
//                }
//            }
//        }
//        return ind;
//    }
//
//    static int[] winLength(int[] ind, String min, String max, int[] rightInd) {
//
//        int charCount = 0;
//        int charA = 0;
//        int i = 0;
//        int len = min.length() - 1;
//
//
//        for (int j = 0; j < ind.length; j++) {
//            if (max.charAt(ind[j]) == min.charAt(i)) {
//                charCount++;
//                i++;
//                if (charCount == min.length()) {
//                    rightInd[charA] = ind[j - len];
//                    charA = charA + 1;
//                    rightInd[charA] = ind[j];
//                    charCount = 0;
//                    i = 0;
//                    charA++;
//                }
//            }
//            else {
//                charCount = 0;
//                i = 0;
//            }
//        }
////        Creating new array of indexes without 0
//
//        int arrLen = 0;
//
//        for (int k = rightInd.length - 1; k >=0; k--) {
//            if (rightInd[k] < 1) {
//                arrLen++;
//            }
//            else {
//                break;
//            }
//        }
//
//        int[] newArrIndexes = new int[rightInd.length - arrLen];
//        for (int a = 0; a < newArrIndexes.length; a++) {
//            newArrIndexes[a] = rightInd[a];
//        }
//        rightInd = newArrIndexes;
//
//        return rightInd;
//    }
//
//    static int minLength(int[] rightInd, int shortestLen) {
//        for (int i = 0; i < rightInd.length; i = i+2) {
//            if ((rightInd[i + 1] - rightInd[i]) < shortestLen) {
//                shortestLen = rightInd[i + 1] - rightInd[i];
//            }
//        }
//        return shortestLen;
//    }
//
//}


////    2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
//
//class HW2
//{
//
//    public static void main(String[] args)
//    {
//        String strFirst = "Hello, Worldie!";
//        String strSecond = "!eidlroW ,olleH";
//
//        strFirst = reverse(strFirst);
//
//        String theAnswer = isTheSame(strFirst, strSecond);
//        System.out.println(theAnswer);
//    }
//    static String reverse(String str) {
//        return new StringBuilder(str).reverse().toString();
//    }
//
//    static String isTheSame(String str, String str2 ) {
//        String answer;
//
//        if (str.length() != str2.length()) {
//            answer = "No!";
//            return answer;
//        } else {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) != str2.charAt(i)) {
//                    answer = "No!";
//                    return answer;
//                }
//                else {
//                    answer = "Yes!";
//                    return answer;
//                }
//            }
//        }
//        return "";
//    }
//}



////* 3. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//
//public class HW2 {
//    public static void main(String[] args) {
//        reverse("something2");
//    }
//
//    static String reverse(String s) {
//        if (s.length() == 1) {
//            System.out.print(s);
//            return s;
//        }
//        System.out.print(s.charAt(s.length()-1));
//        return reverse(s.substring(0, s.length()-1));
//    }
//}


////  4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
////  5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
////  6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//
//public class HW2 {
//    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("3 + 56 = ");
//        str.append(3 + 56);
//        System.out.println(str);
//
//        StringBuilder str2 = new StringBuilder("3 - 56 = ");
//        str2.append(3 - 56);
//        System.out.println(str2);
//
//        StringBuilder str3 = new StringBuilder("3 * 56 = ");
//        str3.append(3 * 56);
//        System.out.println(str3);
//
//        StringBuilder str1 = replace(String.valueOf(str));
//        System.out.println(str1);
//
//        int a = 0;
//        int ind = findIndex(str2, a);
//        str2.replace(ind, ind, "равно");
//        System.out.println(str2);
//
//    }
//
//
//    static StringBuilder replace(String str) {
//        String symbol = "=";
//        String symbol2 = "равно";
//        int a = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == symbol.charAt(0)) {
//                a = i;
//            }
//        }
//        StringBuilder str1 = new StringBuilder(str);
//        str1.deleteCharAt(a);
//        str1.insert(a, symbol2);
//
//        return str1;
//    }
//
//    static int findIndex(StringBuilder str, int a) {
//        String symbol = "=";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == symbol.charAt(0)) {
//                a = i;
//            }
//        }
//        return a;
//    }
//
//}