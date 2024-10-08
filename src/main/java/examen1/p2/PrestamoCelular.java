package examen1.p2;

public class PrestamoCelular {
    private CelularService celularService;
    public PrestamoCelular() {
        celularService = new CelularService();
    }
    public String prestamoCelular(String modelo, String marca, String usuario){
        if (celularService.estaDisponible(modelo, marca)){
            if (celularService.registrarPrestamo(modelo, marca, usuario)){
                return "El celular " + modelo + " de " + marca + " ha sido prestado a " + usuario;
            } else {
                return "Hubo un error al realizar el prestamo del celular " + modelo + " de " + marca;
            }
        } else {
            return "El celular " + modelo + " de " + marca + " no esta disponible";
        }
    }

    public void setCelularService(CelularService celularService) {
        this.celularService = celularService;
    }

}
