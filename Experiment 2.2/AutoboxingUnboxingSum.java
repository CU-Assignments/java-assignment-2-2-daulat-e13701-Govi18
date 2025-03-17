import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxingSum {
    public static List<Integer> parseStringToIntegers(String[] numbers) {
        List<Integer> integerList = new ArrayList<>();
        for (String num : numbers) {
            try {
                integerList.add(Integer.parseInt(num)); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + num);
            }
        }
        return integerList;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "30", "40", "50"};

        List<Integer> numbers = parseStringToIntegers(numberStrings);
        int sum = calculateSum(numbers);
        System.out.println("The sum of the numbers is: " + sum);

        System.out.print("Completed By - \nName : Govindam Aggarwal.\nUid : 22BCS10673\nSection : Epam_801/A.");
    }
}
