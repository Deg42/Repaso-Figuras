package repaso;

public class MainFiguraGeometrica {

	public static void main(String[] args) {
		for(double i=1;i<=10;i++) {
			FiguraGeometrica rectangulo=new Rectangulo(i, i+1);
			FiguraGeometrica cuadrado=new Cuadrado(i);
			FiguraGeometrica pentagono=new Pentagono(i);
			FiguraGeometrica circuloAbstracta=new Circulo(i);
			
			System.out.println(rectangulo.toString());
			System.out.println(cuadrado.toString());
			System.out.println(pentagono.toString());
			System.out.println(circuloAbstracta.toString());
		}
	}

}
