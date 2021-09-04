package fernando.example.ejercicioadapters_listview.modelo;

public class Alarma {

    private String alarma;
    private boolean activo;

    public Alarma(String alarma, boolean activo) {
        this.alarma = alarma;
        this.activo = activo;
    }

    public String getAlarma() {
        return alarma;
    }

    public void setAlarma(String alarma) {
        this.alarma = alarma;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
