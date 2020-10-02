package FigurasAvanzadas;

public class Posicion implements Comparable<Posicion> {
    private Integer x;
    private Integer y;
    

    /**
     * Calcula la distancia entre la posicion y el origen (0,0).
     * @return La distancia al origen.
     */
    public Double distanciaAlOrigen () {
        // TODO - Implementar el metodo
        return -1.0;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Devuelve la posicion como un par ordenado, sin espacios en blanco.
     * @return El par ordenado.
     */
    public String toString() {
        return super.toString() + " posicion en x: " + x + ", posicion en y: " + y;
    }

    /**
     * Compara la posicion con cualquier otra posicion
     * devolviendo -1, 0 o 1 segun sea menor, igual o mayor la distancia al origen.0
     * @return El entero indicando la comparacion.
     */
    @Override
    public int compareTo(Posicion otro) {
        int P = getX().compareTo(otro.getX());
        if (P == 0) {
            P = (int)Math.signum(getX().compareTo(otro.getX()));
        }
        return P;
    }
}
