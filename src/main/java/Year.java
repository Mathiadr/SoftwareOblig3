public class Year {
    /*
    A leap year MUST be dividable by 4,
    but cannot be dividable by 100
    UNLESS it is also dividable by 400
    */


    public static boolean isLeapYear(int year) {
        if(divisibleBy4(year) && notDivisibleBy100(year)){
            return true;
        }
        else if (divisibleBy400(year)){
            return true;
        }
        else{
            return false;
        }
    }

    private static boolean divisibleBy4(int year){
        return year % 4 == 0;
    }

    private static boolean notDivisibleBy100(int year) {
        return year % 100 != 0;
    }

    private static boolean divisibleBy400(int year) {
        return year % 400 == 0;
    }
}
