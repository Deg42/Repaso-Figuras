package repaso;

public class FiguraGeometrica implements InterfaceFiguraGeometrica {
	private int numeroLados;
	private double longitudLadosORadio;
	
	public FiguraGeometrica() {
		super();
	}

	public FiguraGeometrica(int numeroLados, double longitudLadosORadio) {
		super();
		
		this.numeroLados=numeroLados;
		this.longitudLadosORadio=longitudLadosORadio;
	}
	
	@Override
	public double calcularPerimetro() {
		return this.numeroLados*this.longitudLadosORadio;
	}
	
	@Override
	public String toString() {
		return "Figura: "+this.getNombre()+", Número de lados: "+numeroLados+", Longitud lados o radio: "
				+this.longitudLadosORadio+ ", Area: "+this.calcularArea()
				+", Perímetro: "+this.calcularPerimetro();
	}
	
	
	public int getNumeroLados() {
		return this.numeroLados;
	}
	
	public double getLongitudLadosORadio() {
		return this.longitudLadosORadio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
}
