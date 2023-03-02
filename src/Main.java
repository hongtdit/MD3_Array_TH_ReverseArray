import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhap vao so luong trong mang: ");
        size=scanner.nextInt();
        if(size>20){
            System.out.println("MAX IS 20");
        }
        else {
            array=new int[size];
            int i =0;
            while (i< array.length){
                System.out.println("nhap phan tu: "+(i+1)+":");
                array[i]= scanner.nextInt();
                i++;
            }
//            System.out.printf("%-20s%s", "Elements in array: ", "");
//            for (int j = 0; j < array.length; j++) {
//                System.out.print(array[j] + "\t");
//            }
            for (int j = 0; j < array.length / 2; j++) {
                int temp = array[j];
                array[j] = array[size - 1 - j];
                array[size - 1 - j] = temp;
            }
            System.out.printf("\n%-20s%s", "Reverse array: ", "");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }

        }

    }
}
