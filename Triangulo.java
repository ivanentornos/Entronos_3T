package figuras;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo() {
		super();
		base = 0.0;
		altura = 0.0;
	}

	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String toString() {
		return "Triángulo " + super.toString() + ", de base " + base + " y de altura " + altura + "\n" 
				+ "De área " + calcularArea() + " y de perímetro " + calcularPerimetro() + "\n";
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return -1.0;
	}

}
