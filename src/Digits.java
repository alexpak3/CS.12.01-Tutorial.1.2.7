import java.util.ArrayList;

public class Digits {
    public ArrayList<Integer> digitList= new ArrayList<Integer>();
    public Digits(int input) {
        String str = String.valueOf(input);
        if (str.charAt(0) == '-') {throw new IllegalArgumentException("The number passed to the constructor (-1984) cannot be negative!");}
        for (int i = 0; i<str.length(); i++) {
            digitList.add(i, (int) Character.getNumericValue(str.charAt(i)));
        }

    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public boolean isStrictlyIncreasing() {
        int var = 0;
        for (int i = 0; i < digitList.size(); i++) {
            int num = digitList.get(i);
            if (var >= num) {
                return false;
            }
            var = num;
        }
        return true;
    }
}