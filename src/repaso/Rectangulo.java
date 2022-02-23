package repaso;

public class Rectangulo extends FiguraGeometrica {
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super(4, base);
		
		this.altura=altura;
	}
	
	public double calcularArea() {
		return this.getLongitudLadosORadio() * this.altura;
	}
	
	@Override
	public double calcularPerimetro() {
		return (2*this.getBase())+(2*this.altura);
	}
	
	private double getBase() {
		return super.getLongitudLadosORadio();
	}

	@Override
	public String getNombre() {
		return "Rectangulo";
	}
}
