
public class Circulo_VNRG extends FiguraGeometrica_VNRG {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_VNRG(double r, String tipoFigura) {
		super(tipoFigura);
		radio = r;
		
		if(radio < 0) {
			radio = radio *(-1);
		}
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
