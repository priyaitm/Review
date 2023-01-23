package Review;

public class Array_rotate {
    public static void main(String[] args){int i, j, temp;
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matrix: \n");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

            for (i = 0; i < arr.length; i++) {
                temp = arr[i][i];
                arr[i][i] = arr[i][arr.length - i - 1];
                arr[i][arr.length - i - 1] = temp;
            }


        }
    }






