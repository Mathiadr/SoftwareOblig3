import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {


    @ParameterizedTest
    @ValueSource(ints = {2020, 80, 60})
    public void years_divisible_by_4_but_not_100_are_leap_years(int year){
        assertTrue(Year.isLeapYear(year), "Function returned leap year " + year + " as NOT a leap year");
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 800, 1600})
    public void years_divisible_by_400_are_leap_years(int year){
        assertTrue(Year.isLeapYear(year), "Function returned leap year " + year + " as NOT a leap year");
    }

    @ParameterizedTest
    @ValueSource(ints = {907, 2021, 865})
    public void years_NOT_divisible_by_4_are_NOT_leap_years(int year){
        assertFalse(Year.isLeapYear(year), "Function returned non-leap year " + year + " as a leap year");
    }

    @ParameterizedTest
    @ValueSource(ints = {200, 1300, 2500})
    public void years_divisible_by_100_but_not_400_are_NOT_leap_years(int year){
        assertFalse(Year.isLeapYear(year), "Function returned non-leap year " + year + " as a leap year");
    }

}
