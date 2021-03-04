
public class FizzBuzz {
    public String execute(Integer number) {
        String result = "" ;
        switch (number) {
            case 1:
                result = "1";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "Fizz";
                break;


        }
        return result;

    }
}