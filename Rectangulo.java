package figuras;

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	
	public Rectangulo() {
		super();
		base = 0;
		altura = 0;
	}
	
	public Rectangulo(String color, double base, double altura) {
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
		return "Rectángulo " + super.toString() + ", de base " + base + " y de altura " + altura + "\n" 
				+ "De área " + calcularArea() + " y de perímetro " + calcularPerimetro() + "\n";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base*altura; 
	}

	@Override
	public double calcularPerimetro() {
		return (base*2)+(altura*2);
	}

}
