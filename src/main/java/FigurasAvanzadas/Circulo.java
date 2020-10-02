package FigurasAvanzadas;

public class Circulo extends FiguraGeometrica {
    private static final Double pi = Math.PI;
    private static final Integer MAX_RADIO = 500;
    private static Integer nroSerie = 0;
    private Integer radio;

    public Circulo(Integer diametro) {
        setRadio(diametro);
        setId("Circulo" + getNroSerie());
    }

    public Circulo (int radio) {
        setRadio(radio);
        setId("Circulo" + getNroSerie());
    }
    public Double getPerimetro() {
        return pi * 2 * radio;
    }

    public Double getSuperficie() {
        return pi * radio * radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public Integer getDiametro() {
        return radio * 2;
    }

    public void setRadio(Integer radio) {
        if ((0 < radio) && (radio < MAX_RADIO)) {
            this.radio = radio;
        }
    }

    @Override
    public int compareTo(FiguraGeometrica f) {
        int c = getSuperficie().compareTo(f.getSuperficie());
        if (c == 0) {
            c = (int)Math.signum(getId().compareTo(f.getId()));
        }
        return c;
    }

    private Integer getNroSerie() {
        nroSerie += 1;
        return nroSerie;
    }

    @Override
    public String toString() {
        return "Circulo\n ++ Radio=" + radio;
    }

}