package repaso;

public class Pentagono extends FiguraGeometrica {
	public Pentagono(double longitudLado) {
		super(5, longitudLado);
	}

	@Override
	public double calcularArea() {
		return (this.calcularPerimetro()*this.calcularApotema())/2;
	}
	
	private double calcularApotema() {
		return getLongitudLadosORadio()/1.45;
	}

	@Override
	public String getNombre() {
		return "Pentagono";
	}
}
