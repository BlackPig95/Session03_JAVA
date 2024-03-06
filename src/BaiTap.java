import java.util.Scanner;

public class BaiTap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng");
        int c = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[r][c];
        while (true)
        {
            System.out.println("=========Menu============");
            System.out.println("1. Nhập giá trị cho tất cả các phần tử của mảng");
            System.out.println("2. In các phần tử của mảng dưới dạng ma trận");
            System.out.println("3. Tính tổng các phần tử của mảng");
            System.out.println("4. In ra đường chéo chính");
            System.out.println("5. In ra đường chéo phụ (ma trận vuông)");
            System.out.println("6. In ra đường viền");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    for (int i = 0; i < r; i++)
                    {
                        for (int j = 0; j < c; j++)
                        {
                            System.out.printf("Nhập giá trị cho phần tử arr[%d][%d] \t", i, j);
                            arr[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ma trận");
                    for (int i = 0; i < r; i++)
                    {
                        for (int j = 0; j < c; j++)
                        {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 0; i < r; i++)
                    {
                        for (int j = 0; j < c; j++)
                        {
                            sum += arr[i][j];
                        }
                    }
                    System.out.println("Tổng các phần tử là " + sum);
                    break;
                case 4:
                    System.out.println("Các phần tử trong đường chéo chính là: ");
                    for (int i = 0; i < r; i++)
                    {
                        for (int j = 0; j < c; j++)
                        {
                            if (i == j)
                            {
                                System.out.print(arr[i][j]);
                            } else
                            {
                                System.out.print(" ");//Có thể dùng printf + %-3s
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    if (r != c)
                    {
                        System.out.println("Đây không phải ma trận vuông");
                        break;
                    } else
                    {
                        System.out.println("Các phần tử trong đường chéo phụ là: ");
                        for (int i = 0; i < r; i++)
                        {
                            for (int j = c - 1; j >= 0; j--)
                            {
                                if (i + j == r - 1)
                                {
                                    System.out.print(arr[i][j] + "\t");
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Đường viền trên cùng");
                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(arr[0][j] + "\t");
                    }
                    System.out.println(); //Xuống dòng nhìn cho đẹp
                    System.out.println("Đường viền bên phải");
                    for (int i = 0; i < r; i++)
                    {
                        System.out.print(arr[i][0] + "\t");
                    }
                    System.out.println();
                    System.out.println("Đường viền dưới cùng");
                    for (int j = 0; j < c; j++)
                    {
                        System.out.print(arr[r - 1][j] + "\t");
                    }
                    System.out.println();
                    System.out.println("Đường viền bên trái");
                    for (int i = 0; i < r; i++)
                    {
                        System.out.print(arr[i][0] + "\t");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại lựa chọn");
                    break;
            }
        }
    }
}
