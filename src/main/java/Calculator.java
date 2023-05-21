public class Calculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }


        String delimiter = ",";
        String secondNumbers = numbers;

        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            secondNumbers = numbers.substring(delimiterIndex + 1);
        }
        String[] arr = secondNumbers.split("[,\n"+delimiter+"]");
        int sum = 0;
        for (String num : arr) {
            sum += Integer.parseInt(num);
        }
        return sum;

    }
}
