import java.util.Scanner;

public class Day13 {
        public static void matrixOneZero(int n) {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                    if (i + j == n - 1) {
                        matrix[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();

            }
        }

        public static void matrix2(int n) {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                    if (i + j == n - 1) {
                        matrix[i][j] = 1;
                    }
                    if (i + j > n - 1) {
                        matrix[i][j] = 2;
                    }
                    if (i + j < n - 1) {
                        matrix[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void matrixTAsk3(int n) {
            int[][] array = new int[n][n];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = i + j;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    if (array[i][j - 1] == array[i - 1][j]) {
                        System.out.print("yes");

                    }
                    if (array[i][j - 1] != array[i - 1][j]) {
                        System.out.print("no");

                    }
                }
            }
        }

        public static void matrixtask4(int n, int m) {
            int[][] array = new int[n][m];
            int sum[] = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = i + j;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum[i] += array[i][j];
                }

            }
            int maxsum = sum[0];
            int maxindex = 0;
            for (int i = 0; i < array.length; i++) {
                if (sum[i] > maxsum) {
                    maxsum = sum[i];
                    maxindex = i;
                }
            }
            System.out.println(maxsum + " " + maxindex);


        }

        public static void matrixTask5(int n, int m) {
            int[][] array = new int[n][m];
            int max = 0;
            int index = 0;
            int index1 = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = i + j;
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                        index = i;
                        index1 = j;
                    }
                }
            }
            System.out.println(max + " " + index + " " + index1);
        }

        public static void sumofMatrix() {
            int n = 3, m = 3;
            int[][] array1 = new int[n][m];
            int[][] array2 = new int[n][m];
            int[][] sumarray = new int[n][m];
            System.out.println("Enter array1 element");
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    // array1[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter array2 element");
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    // array2[i][j]=sc.nextInt();
                }
            }
            for (int i = 0; i < sumarray.length; i++) {
                for (int j = 0; j < sumarray.length; j++) {
                    sumarray[i][j] = array1[i][j] + array2[i][j];
                }
            }
            for (int i = 0; i < sumarray.length; i++) {
                for (int j = 0; j < sumarray.length; j++) {
                    System.out.print(sumarray[i][j] + " ");
                }
                System.out.println();
            }
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            matrixOneZero(n);
            matrix2(n);
            matrixTAsk3(n);
            int m = sc.nextInt();
            matrixtask4(n, m);
            matrixTask5(n, m);
            sumofMatrix();

        }
    }


