package geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCirculo {

	@Test
	public double area() {
		double radio = 7;
		return radio*radio*Math.PI;
		
	
	}
	@Test
	public double perimetro() {
		double radio = 7;
		return radio *Math.PI*2;
	}

}
