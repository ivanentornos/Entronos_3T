package figuras;

public class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado() {
		super();
		lado = 0;
	}
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado; 
	}
	
	public String toString() {
		return "Cuadrado " + super.toString() + " y lado " + lado + "\n" 
				+ "De área " + calcularArea() + " y de perímetro " + calcularPerimetro() + "\n"; 
	}

	@Override
	public double calcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return lado*4;
	}

}
