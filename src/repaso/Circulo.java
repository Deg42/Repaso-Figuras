package repaso;

public class Circulo extends FiguraGeometrica{
	public Circulo(double radio) {
		super(0, radio);
	}
	
	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*this.getLongitudLadosORadio();
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(super.getLongitudLadosORadio(), 2);
	}

	@Override
	public String getNombre() {
		return "Circulo";
	}
	

}
