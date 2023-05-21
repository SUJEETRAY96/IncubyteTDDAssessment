public class Calculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] arr = numbers.split(",");
        int sum = 0;
        for (String num : arr) {
            sum += Integer.parseInt(num);
        }
        return sum;

    }
}
