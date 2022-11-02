import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//       N1
        int firstNumber = 0;
        for (int i = 0; i <= 20; i++) {
            int numbers = random.nextInt(1,99);
            if(i == 0){
                firstNumber = numbers;
                System.out.printf("First number = %d;",firstNumber);
            }
            if(numbers % firstNumber == 0 && numbers != firstNumber){
                System.out.printf(" %d-ое число =  %d; ",i,numbers);
            }
        }
    }

//    N30
//    public static boolean method(int[] massiv){
//        for (int i = 0; i < massiv.length; i++) {
//            if(i < massiv.length-2) {
//                if (massiv[i] == massiv[i + 1] && massiv[i + 1] == massiv[i + 2]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    N29
//    public static boolean method(int[] massiv){
//        for (int i = 0; i < massiv.length; i++) {
//            if(i <= 4) {
//                if (massiv[i] == 9) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//    N28
//    public static boolean method(int[] massiv){
//        for (int i = 0; i < massiv.length; i++) {
//                if (massiv[i] == 1 && i < massiv.length - 2) {
//                    if (massiv[i+1] == 2) {
//                        if(massiv[i+2] == 3){
//                            return true;
//                        }
//                    }
//                }
//        }
//        return false;
//    }

//    N27
//    public static String method(String word, int n){
//        String safe = "";
//        for (int i = 0; i < n; i++) {
//            safe += word;
//        }
//        return safe;
//    }

//    N26
//    public static boolean method(int[] massiv){
//        int counter = 0;
//        for (int check:massiv) {
//            if(check == 2){
//                counter++;
//            }
//        }
//        if(counter == 5){
//            return true;
//        }else {
//            return false;
//        }
//    }

//    N25
//    public static int[] method(int[] massiv, int n){
//        int[] index = new int[2];
//        for (int i = 0; i < massiv.length; i++) {
//            for (int j = 0; j < massiv.length; j++) {
//                if(massiv[i]+massiv[j] == n){
//                    index[0] = j;
//                    index[1] = i;
//                }
//            }
//        }
//        return index;
//    }

//    N24
//    public static boolean method(int[] massiv) {
//        int counter = 0;
//        for (int check : massiv) {
//            if (check >= 0) {
//                counter++;
//            }
//        }
//        if (counter == massiv.length) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    N23
//    public static int[] method(int n){
//        int[] array = new int[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(1,100);
//            if(i > 0 && array[i] < array[i-1]){
//                array[i] = random.nextInt(array[i-1],100);
//            }
//        }
//        return array;
//    }

//    N22
//    public static boolean method(String[] massiv, String name){
//        int index = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            if (massiv[i].equals(name)){
//                index = i;
//            }
//        }
//        if(index % 2 == 0){
//            return true;
//        }else {
//            return false;
//        }
//    }

//    N21
//    public static char[] method(int n, boolean b){
//        char[] upper = new char[n];
//        char[] lower = new char[n];
//        if(b) {
//            for (int i = 0; i < upper.length; i++) {
//                upper[i] = (char) random.nextInt(64,91);
//            }
//            return upper;
//        }else {
//            for (int i = 0; i < upper.length; i++) {
//                lower[i] = (char) random.nextInt(96,123);
//            }
//            return lower;
//        }
//    }

//    N20
//    public static void method(int[] massiv){
//        int safe = 0;
//        for (int i = 0; i < massiv.length; i++) {
//            safe = random.nextInt(10,99);
//            if (safe % 2 == 0){
//                massiv[i] = safe;
//                System.out.printf("%d ",safe);
//            }else {
//                i--;
//            }
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(massiv));
//    }

//    N19
//        public static String method(int getNumber){
//        String weeks;
//        switch (getNumber){
//            case 1 -> weeks = "Понедельник";
//            case 2 -> weeks = "Вторник";
//            case 3 -> weeks = "Среда";
//            case 4 -> weeks = "Четверг";
//            case 5 -> weeks = "Пятница";
//            case 6 -> weeks = "Суббота";
//            case 7 -> weeks = "Воскресенье";
//            default -> weeks = "Такого дня недели, не существует!";
//        }
//        return weeks;
//    }

//    N18
//        public static int[] method(int[] massiv){
//        int counter = 0;
//        int[] newArray = new int[counter];
//            for (int j : massiv) {
//                if (j % 2 == 0) {
//                    ++counter;
//                }
//            }
//            newArray = new int[counter];
//            int index = 0;
//            for (int i = 0; i < massiv.length; i++) {
//                if (massiv[i] % 2 == 0) {
//                    newArray[index] = massiv[i];
//                    index++;
//                }
//            }
//        return newArray;
//    }

//    N17
//    public static void method(int[] massiv,int K){
//        int sum = 0;
//        ++K;
//        for (int i = 0; i < massiv.length; i++) {
//            if(K == i){
//                break;
//            }else {
//                sum += massiv[i];
//            }
//        }
//        System.out.println(sum);
//    }

//    N16
//    public static int method(int getNumber){
//        int sum = 0;
//        for (int i = 0; i < getNumber; i++) {
//            sum += i;
//        }
//        return sum;
//    }

//    N15
//        public static void method(int[] massiv,int getNumber){
//        int counter = 0;
//        for (int num:massiv){
//            if(num == getNumber){
//                counter++;
//            }
//        }
//            System.out.println(counter);
//    }

//    N14
//    public static void method(int[] massiv,int getNumber){
//        for (int num:massiv){
//            if(num > getNumber){
//                System.out.printf("%d ",num);
//            }
//        }
//    }

//    N13
//    public static int method(boolean[] massiv){
//        int trueCounter = 0;
//        for (boolean b : massiv) {
//            if (b) {
//                trueCounter++;
//            }
//        }
//        return trueCounter;
//    }

//    N12
//    public static void method(int[] massiv, int number){
//        boolean isCheck = false;
//        for (int i = 0; i < massiv.length; i++) {
//            if(massiv[i] >= number){
//                isCheck = true;
//                break;
//            }else {
//                isCheck = false;
//            }
//        }
//        System.out.println(isCheck);
//    }

//    N11
//int[] array = new int[input.nextInt()];
//    int jup = 0;
//    int tak = 0;
//        System.out.print("Even: ");
//        for (int i = 0; i < array.length; i++) {
//        array[i] = random.nextInt(10, 99);
//        if (array[i] % 2 == 0) {
//            jup = array[i];
//            System.out.printf("%d ", jup);
//        }
//    }
//        System.out.printf("\nOdd: ");
//        for (int i = 0; i < array.length; i++) {
//        if (array[i] % 2 == 1){
//            tak = array[i];
//            System.out.printf("%d ", tak);
//        }
//    }
//        System.out.println();
//        System.out.println(Arrays.toString(array));

//    N10
//    int[] array = new int[input.nextInt()];
//    int jup = 0;
//    int tak = 0;
//    int size = 0;
//        System.out.print("First half: ");
//        for (int i = 0; i < array.length; i++) {
//        array[i] = random.nextInt(10, 99);
//        size = array.length / 2;
//        if (i < size) {
//            System.out.printf("%d ", array[i]);
//        }
//    }
//        System.out.printf("\nSecond half: ");
//        for (int i = 0; i < array.length; i++) {
//        if (i >= size){
//            System.out.printf("%d ", array[i]);
//        }
//    }
//        System.out.println();
//        System.out.println(Arrays.toString(array));

//    N9
//    public static void main(String[] args) {
//        int[] array = new int[input.nextInt()];
//        int[] massiv = new int[array.length];
//        int index = array.length;
//        for (int i = 0; i< array.length; i++) {
//            array[i] = random.nextInt(1,50);
//            index--;
//            massiv[index] = array[i];
//
//        }
//        System.out.println(Arrays.toString(massiv));
//        System.out.println(Arrays.toString(array));
//    }

    //        N8
//        System.out.print("Введите количество билетов: ");
//        int ticket = input.nextInt();
//        int failure = 0, bought = 0;
//        while(ticket > 0) {
//            System.out.print("Введите сколько вы хотите приобрести билетов: ");
//            int customer = input.nextInt();
//            if (ticket >= customer) {
//                ticket -= customer;
//                System.out.println("Осталось билетов: "+ticket);
//                bought++;
//            }else{
//                System.out.println("Извините, но у нас не осталось такого количества билетов!");
//                failure++;
//            }
//        }
//        System.out.println(bought+" покупателей приобрели билет!");
//        System.out.println(failure+" покупателям было отказано!");

//    N7
//        int number = 123456789;
//        int last, n2 = 0;
//        while (number > 0){
//            last = number % 10;
//            number = number / 10;
//            n2 = n2 * 10;
//            n2 = n2 + last;
//        }
//        System.out.printf("%d ",n2);

//        N6
//        String text = input.next();
//        for (int i = 0; i < text.length(); i++) {
//            int separate = (Integer.parseInt(Integer.toString(text.charAt(i))));
//            if(i == 0) {
//                System.out.println(separate);
//                break;
//            }
//        }

//    N5
//        String text = input.next();
//        String  even = "",odd = "";
//        for (int i = 0; i < text.length(); i++) {
//            int separate = (Integer.parseInt(Integer.toString(text.charAt(i))));
//            if(separate % 2 == 0) {
//                even += " " + text.charAt(i);
//            }else {
//                odd += " " + text.charAt(i);
//            }
//        }
//        System.out.println("Evan:"+even);
//        System.out.println("Odd:"+odd);

//    N4
//        int sum1 = 0,sum2 = 0;
//        while (true){
//            int firstNumber = input.nextInt();
//            int secondNumber = input.nextInt();
//            if (firstNumber != secondNumber){
//                sum1+=firstNumber;
//                sum2+=secondNumber;
//            } else {
//                System.out.printf("Сумма первых чисел: %d\n",sum1);
//                System.out.printf("Сумма вторых чисел: %d",sum2);
//                break;
//            }
//        }

//    N3
//        int x = input.nextInt();
//        while (true){
//            if(x != 0){
//                int number = input.nextInt();
//                System.out.printf("%d - %d = ",x,number);
//                x = x - number;
//                System.out.printf("%d\n",x);
//            } else {
//                break;
//            }
//        }

//    N2
//    int max = 0, min = 0, numbers;
//        for (int i = 0; i <= 20; i++) {
//        numbers = random.nextInt(-50, 50);
//        if(max < numbers){
//            max = numbers;
//        } else if (min > numbers) {
//            min = numbers;
//        }
//        System.out.printf("%d ",numbers);
//    }
//        System.out.println("\nMax = "+max);
//        System.out.printf("Min = %d",min);

//    N1
//        int firstNumber = 0;
//        for (int i = 0; i <= 20; i++) {
//            int numbers = random.nextInt(1,99);
//            if(i == 0){
//                firstNumber = numbers;
//                System.out.printf("First number = %d;",firstNumber);
//            }
//            if(numbers % firstNumber == 0 && numbers != firstNumber){
//                System.out.printf(" %d-ое число =  %d; ",i,numbers);
//            }
//        }
}