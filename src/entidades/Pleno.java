package entidades;

public class Pleno {
    private int numeroApostado;
    private int pagoPorAcierto = 35;

    public Pleno(int numeroApostado) {
        if (numeroApostado < 0 || numeroApostado > 36) {
            throw new IllegalArgumentException("El número apostado debe estar entre 0 y 36.");
        }
        this.numeroApostado = numeroApostado;
    }

    public int getNumeroApostado() {
        return numeroApostado;
    }

    public boolean verificarApuesta(int numeroGanador) {
        return this.numeroApostado == numeroGanador;
    }

    public int calcularGanancia(int montoApostado) {
        return montoApostado * pagoPorAcierto;
    }
}
