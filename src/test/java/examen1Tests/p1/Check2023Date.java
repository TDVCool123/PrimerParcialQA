package examen1Tests.p1;

import examen1.p1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Check2023Date {
    @Test
    public void getDayOfWeek(){
        DateUtils dateUtils = new DateUtils();
        String expectedResult = "INVALID";
        String actualResult = dateUtils.getDayOfWeek("2023-08-29");
        Assertions.assertEquals(expectedResult, actualResult, "Only 2024 year is permited");
    }
}
