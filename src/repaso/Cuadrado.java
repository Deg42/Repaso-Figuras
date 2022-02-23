package repaso;

public class Cuadrado extends Rectangulo {
	public Cuadrado(double longitudLado) {
		super(longitudLado, longitudLado);
	}
	
	@Override
	public String getNombre() {
		return "Cuadrado";
	}
}
