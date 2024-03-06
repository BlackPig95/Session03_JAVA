import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float sum = 0f;
        float[] marks = new float[3];
        for(int i=0; i < marks.length; i++)
        {
            System.out.println("Nhập điểm môn học");
            marks[i] = Float.parseFloat(scanner.nextLine());
        }
        for(float mark : marks)
        {
            sum+= mark;
        }
        System.out.println("Điểm trung bình: " + sum/marks.length);
    }
}
