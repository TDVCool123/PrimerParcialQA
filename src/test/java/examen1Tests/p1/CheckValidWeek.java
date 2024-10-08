package examen1Tests.p1;

import examen1.p1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CheckValidWeek {
    @ParameterizedTest
    @CsvSource({
            "2024-10-06, SUNDAY",
            "2024-10-07, MONDAY",
            "2024-10-08, TUESDAY",
            "2024-10-09, WEDNESDAY",
            "2024-10-10, THURSDAY",
            "2024-10-11, FRIDAY",
            "2024-10-12, SATURDAY",

    })
    public void getDayOfWeek(String date , String expectedResult){
        DateUtils dateUtils = new DateUtils();
        String actualResult = dateUtils.getDayOfWeek(date);
        Assertions.assertEquals(expectedResult, actualResult, "La fecha ingresada no es correcta");
    }
}
