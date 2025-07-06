import java.util.Scanner;

public class Break {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value to count by: ");
    int mul = input.nextInt();
    int num = mul;
    int loopCount = 1;
    System.out.print("Enter the total value to count to: ");
    int total = input.nextInt();

    while (num <= total) {

      if (loopCount % 10 == 0) {
        System.out.println(num);
        num = num + mul;
      } else {
        System.out.print(num + " ");
        num = num + mul;
      }

      loopCount = loopCount + 1;
    }

  }
}
