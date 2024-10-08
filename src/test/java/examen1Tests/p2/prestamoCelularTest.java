package examen1Tests.p2;

import examen1.p2.CelularService;
import examen1.p2.PrestamoCelular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class prestamoCelularTest {
    CelularService celularService = Mockito.mock(CelularService.class);

    @Test
    public void checkBasicCases(){
        String modelo = "A10";
        String marca = "Samsung";
        String nombre = "Luis";
        Mockito.when(celularService.estaDisponible(modelo, marca)).thenReturn(true);
        Mockito.when(celularService.registrarPrestamo(modelo, marca, nombre)).thenReturn(true);

        PrestamoCelular prestamoCelular = new PrestamoCelular();
        prestamoCelular.setCelularService(celularService);
        String expectedMessage = "El celular A10 de Samsung ha sido prestado a Luis" ;
        String actualMessage = prestamoCelular.prestamoCelular(modelo, marca, nombre);

        Assertions.assertEquals(expectedMessage, actualMessage, "ERROR: Mensaje incorrecto cuando no existen suficientes celulares.");

        Mockito.verify(celularService).estaDisponible(modelo, marca);

    }
}
