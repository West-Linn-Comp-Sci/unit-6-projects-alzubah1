import java.util.Scanner;
public class FrequencyChart {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter integers from 1-100 (or anything else to cancel)");
        String input = "0";
        int[] frequency = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (true) {
            input = user.nextLine();
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException nfe) {
                break;
            }
            int num = Integer.parseInt(input);
            if (num > 0 && num <= 100) {
                frequency[(num - 1) / 10]++;
            } else break;
        }
        System.out.print(" ");
        for (int i = 0; i < 9; i++) {
            System.out.println((i * 10 + 1) + " - " + ((i + 1) * 10) + " | " + frequency[i]);
        }
        System.out.println("91 - 100| " + frequency[9]);
    }
    public String counter(int num) {
        String stars = "";
        for (int i = 0; i < num; i++) {
            stars += "*";
        }
        return stars;
    }
}