import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1");
        System.out.println();
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println();
        double[] first = {1.57, 7.654, 9.986};
        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
        System.out.println();
        int[] array = {12, 13, 11, 99};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println();

        System.out.println("\nЗадача 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] + ", ");
        }
        for (double i = 0; i < first.length; i++) {
            System.out.print(first[(int) i] + ", "); //Почему здесь джава предложила привести выражение к типу инт? Изначально я так : System.out.print(first[i] + ", "); но тогда выдаёт ошибку.
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("\nЗадача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i] + ", ");
        }
        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i] + ", ");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        } // Я не знаю как выводить с новой строки и не знаю как, не ставить запятую в конце строки. Буду рад подсказке.
        System.out.println();
        System.out.println("\nЗадача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = i + 1;{
                    System.out.println(i);// Не понимаю как это решить?
                }
            }
        }
    }
}