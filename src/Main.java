public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int number[] = new int[]
                {23, 65, 73, 65, 44, 15, 100, 99, 69, 5, 15};


        int min = number[0];
        for (int i = 0; i < number.length; i++) { // nếu giá trị nhỏ nhất MIN thì gán MIN bằng số đó;
            if (number[i] < min) {
                min = number[i];
            }
//            System.out.println("Minnnnnn " + min);
        }


        int max = number[0];
        for (int i = 0; i < number.length; i++) { // nếu giá trị lớn nhất MAX thì gán MAX bằng số đó;
            if (number[i] > max) {
                max = number[i];
            }
//            System.out.println("Maxxxxxx" + max);
        }
        System.out.println("Gia tri Min: " + min);
        System.out.println("Gia tri Max: " + max);
    }
}