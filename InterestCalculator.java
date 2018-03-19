import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;

        Scanner input = new Scanner(System.in);

        System.out.println("Nhập số tiền:");
        money = input.nextDouble();

        System.out.println("Nhập tháng:");
        month = input.nextInt();

        System.out.println("Nhập tỉ lệ lãi suất:");
        interset_rate = input.nextDouble();

        double interset = money * (interset_rate/100)/12;

        for (int i = 1; i < month; i++){
            interset = interset + money * (interset_rate/100)/12;
        }
        System.out.println(interset + "tiền lãi");
    }
}
