
public class FizzBuzz {
    public String execute(Integer number) {
        String result = "";
        result = String.valueOf(number);
        int divisibleByThree = number % 3;
        int divisibleByFive = number % 5;
        if (divisibleByThree == 0) {
            result = "Fizz";
        }
        else if (divisibleByFive ==0){
            result = "Buzz";
        }


//        switch (number) {
//            case 1:
//                result = "1";
//                break;
//            case 2:
//                result = "2";
//                break;
//            case 3:
//                result = "Fizz";
//                break;
//            case :
//                result = "Fizz";


        return result;


    }
}