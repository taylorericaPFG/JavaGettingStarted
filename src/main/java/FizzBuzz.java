
public class FizzBuzz {
    public String execute(Integer number) {
        String result = "";
        result = String.valueOf(number);
        int divisibleByThree = number % 3;
        int divisibleByFive = number % 5;
        if (divisibleByThree == 0 && divisibleByFive == 0){
            result = "FizzBuzz";
        }
        else if (divisibleByThree == 0) {
            result = "Fizz";
        }
        else if (divisibleByFive == 0){
            result = "Buzz";
        }

        return result;


    }
}