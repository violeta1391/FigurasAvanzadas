package FigurasAvanzadas;

public class Circulo extends FiguraGeometrica {
    private static final Double pi = Math.PI;
    // La constante se usa para BASE y ALTURA
    private static final Integer MAX_RADIO = 500;
    // El numero de serie del primer objeto es 1
    // No se puede repetir el numero para dos triangulos
    private static Integer nroSerie = 0;
    private Integer radio;

    /**
     * Constructor que recibe los valores de la base
     * y de la altura.
     * Debe generar el ID con la forma
     *    "CirculoX"
     * siendo X el numero de serie correspondiente.
     * Configurarlo con setId() de la superclase.
     */
    public Circulo(Integer diametro) {
        this.radio = diametro;
    }

    public Circulo (int radio) {
        setRadio(radio);
        determinarColor();
    }

    // Determina el color del circulo segun el radio

    private void determinarColor() {
        if (getRadio() < 100) {
            setColor(Color.BLUE);
        } else if (getRadio() < 200) {
            setColor(Color.GREEN);
        } else if (getRadio() < 300) {
            setColor(Color.YELLOW);
        } else if (getRadio() < 400) {
            setColor(Color.ORANGE);
        } else if (getRadio() < 500) {
            setColor(Color.RED);
        } else {
            setColor(Color.MAGENTA);
        }
    }

    /**
     * Calcula el perimetro de la figura.
     * @return El perimetro.
     */
    public Double getPerimetro() {
        return pi * 2 * radio;
    }

    /**
     * Calcula la superficie de la figura.
     * @return La superficie.
     */
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
            determinarColor();
        }
    }

    /**
     * Compara el triangulo con cualquier otra figura geometrica
     * devolviendo -1, 0 o 1 segun sea menor, igual o mayor.
     * La comparacion se hace primero por superficie y luego por ID
     * de los objetos. En ambos casos en el orden natural.
     * @return El entero indicando la comparacion.
     */
    @Override
    public int compareTo(FiguraGeometrica f) {
        return 0;
    }

    /**
     * Genera un numero unico para cada objeto creado.
     * @return El numero de serie a usar.
     */
    private Integer getNroSerie() {
        return nroSerie;
    }

    /**
     * Devuelve lo reportado en el toString() de la superclase
     * y le agrega el radio el circulo con el formato
     *   " ++ Radio=x"
     * siendo x el valor del campo.
     * @return El texto asociado.
     */
    @Override
    public String toString() {
        return "Circulo\n ++ Radio=" + radio;
    }

}