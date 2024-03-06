import java.util.Scanner;

public class BaiTrenLop
{
    public static void main(String[] args)
    {
        Find2ndBiggest();
    }

    // Bai 1 Delete element from array
    static void DeleteFromArray()
    {
        int[] arr = new int[]{1, 3, 5, 2, 7, 4, 8, 9, 6};
        for (int i : arr)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        boolean isExist = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn xóa");
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++)
        {
            if (i == arr.length - 1)
            {
                isExist = true;
                System.out.println("Phần tử này nằm ở vị trí: " + i);
                arr[arr.length - 1] = 0;
                break;
            }
            if (input == arr[i])
            {
                isExist = true;
                System.out.println("Phần tử này nằm ở vị trí: " + i);
                for (int j = i; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                break;
            }
        }
        if (!isExist)
        {
            System.out.println("Phần tử không tồn tại trong mảng");
        }
        System.out.println("Mảng mới: ");
        for (int i : arr)
        {
            System.out.print(i + "\t");
        }
    }

    //Bai 2 Thêm vào mảng
    static void AddElementToArray()
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 4; i++)//Giả định một số giá trị ban đầu
        {
            System.out.printf("Nhập giá trị của phần tử %d trong mảng \n", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i : arr)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
        int index = 0;
        while (true)
        {
            System.out.println("Nhập vị trí muốn chèn");
            index = Integer.parseInt(scanner.nextLine());
            if (index < 0 || index >= arr.length)
            {
                System.out.println("Index out of bounds");
            } else break;
        }
        System.out.println("Nhập giá trị muốn chèn");
        int value = Integer.parseInt(scanner.nextLine());
        for (int i = arr.length - 1; i > index; i--)//Loop from array end to shift elements to the right
        {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        for (int i : arr)
        {
            System.out.print(i + "\t");
        }
    }

    //Bai 3 Gộp mảng
    static void ConcatArray()
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[7];
        int[] arr2 = new int[5];
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.printf("Nhập giá trị của phần tử %d trong mảng 1 \n", i);
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.printf("Nhập giá trị của phần tử %d trong mảng 2 \n", i);
            arr2[i] = Integer.parseInt(scanner.nextLine());
        }

        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
        {
            arr3[i] = arr1[i];//arr3 đã được gán giá trị cho đến vị trí arr1.length-1
        }
        for (int i = 0; i < arr2.length; i++)
        {
            arr3[arr1.length + i] = arr2[i];//Tiếp tục gán từ vị trí arr1.length
        }
        for (int i : arr3)
        {
            System.out.print(i + "\t");
        }
    }

    //Bài 4 Tìm phần tử lớn nhất trong mảng 2 chiều
    static void Array2DMax()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của ma trận");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.println("Nhập các giá trị của hàng " + i);
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.printf("Nhập giá trị của phần tử thuộc cột %d hàng %d\t", j, i);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //In ra các phần tử ban đầu
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int indexRow = 0;
        int indexCol = 0;
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (max < matrix[i][j])
                {
                    max = matrix[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là " + max);
        System.out.printf("Vị trí của phần tử này là hàng %d, cột %d\n", indexRow, indexCol);
    }

    //Bài 5 Tìm giá trị nhỏ nhất trong mảng
    static void MinArray1D()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.printf("Nhập giá trị của phần tử %d của mảng\n", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int min = arr[0];
        for (int i = 0; i < n; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }

    //Bài 6 Tính tổng các số ở một cột xác định
    static void SumOfCol()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của ma trận");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của ma trận");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.println("Nhập các giá trị của hàng " + i);
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.printf("Nhập giá trị của phần tử thuộc cột %d hàng %d\t", j, i);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //In ra các phần tử ban đầu
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Nhập cột cần tính tổng (theo index - tính từ cột 0)");
        int selectedCol = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            sum += matrix[i][selectedCol];
        }
        System.out.println("Tổng giá trị cột này là " + sum);
    }

    //Bài 7 Tính tổng các số ở đường chéo chính ma trận vuông
    static void MainDiagonalSum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng và cột của ma trận");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[row][row];
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.println("Nhập các giá trị của hàng " + i);
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.printf("Nhập giá trị của phần tử thuộc cột %d hàng %d\t", j, i);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //In ra các phần tử ban đầu
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (i == j)
                    sum += matrix[i][j];
            }
        }
        System.out.println("Tổng giá trị đường chéo chính là " + sum);
    }

    //Bài 9 Tìm phần tử lớn thứ 2 trong mảng
    static void Find2ndBiggest()
    {
        int[] arr = {9, 2, 6, 54, 8, 4, 25, 5, 7, 1, 10, 12, 22, 18};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (max1 < arr[i])
            {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i] && arr[i] < max1)
            {
                max2 = arr[i];
            }
        }
        System.out.println("Số lớn nhất " + max1);
        System.out.println("Số lớn thứ hai " + max2);
    }
}
