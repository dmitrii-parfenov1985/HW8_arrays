public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println();
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;
        System.out.println(weight [0]);
        System.out.println(weight [1]);
        System.out.println(weight [2]);
        System.out.println();
        double [] first = {1.57, 7.654, 9.986};
        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
        System.out.println();
        int [] array = {12, 13, 11, 99};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println();

        System.out.println("Задача 2");
        System.out.println();
        System.out.print(weight [0] + ", ");
        System.out.print(weight [1] + ", ");
        System.out.print(weight [2]);

        System.out.println();
        System.out.print(first[0] + ", ");
        System.out.print(first[1] + ", ");
        System.out.print(first[2]);

        System.out.println();
        System.out.print(array[0] + ", ");
        System.out.print(array[1] + ", ");
        System.out.print(array[2] + ", ");
        System.out.print(array[3]);
        System.out.println();

        System.out.println("Задача 3");
        System.out.print(weight [2] + ", ");
        System.out.print(weight [1] + ", ");
        System.out.print(weight [0]);
        System.out.println();
        System.out.print(first[2] + ", ");
        System.out.print(first[1] + ", ");
        System.out.print(first[0]);
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);
        }
    }
}