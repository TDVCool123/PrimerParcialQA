package examen1Tests.p1;

import examen1.p1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckValidDay {

    @Test
    public void getDayOfWeek(){
        DateUtils dateUtils = new DateUtils();
        String expectedResult = "MONDAY";
        String actualResult = dateUtils.getDayOfWeek("2024-10-07");
        Assertions.assertEquals(expectedResult, actualResult, "La fecha ingresada no es correcta");
    }
}
