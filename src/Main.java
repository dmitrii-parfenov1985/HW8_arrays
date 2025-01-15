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
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nЗадача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.println("\nЗадача 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] += 1;
            }
        }
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.println(weight[i]);
                break;
            }
            System.out.println(weight[i] + ", ");
        }
    }
}