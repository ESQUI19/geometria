/**
 * Clase para construir rectángulos
 * @author Victoria de las Nieves Ramirez Garcia
 *@version Versión 1.2
 */
public class Rectangulo_VNRG extends FiguraGeometrica_VNRG {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de objetos rectángulo
	 * @param tipoFigura Llamada al constructor de FiguraGeometrica
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_VNRG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	/** Calcula el área del rectángulo
	 * @return Devuelve el área del rectángulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/** Calcula el perímetro del rectángulo
	 * @return Devuelve el perímetro del rectángulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
