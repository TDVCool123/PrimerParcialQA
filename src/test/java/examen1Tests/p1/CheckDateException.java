package examen1Tests.p1;

import examen1.p1.DateUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckDateException {
    @Test
    public void getDayOfWeek(){
        DateUtils dateUtils = new DateUtils();
        Assertions.assertThrows(Exception.class, () -> dateUtils.getDayOfWeek("2024/10/07"));
    }
}
