package figuras;

public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo() {
		super();
		radio = 0.0; 
	}
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public String toString() {
		return "Círculo " + super.toString() + " y de radio " + radio + "\n" 
				+ "De área " + calcularArea() + " y de perímetro " + calcularPerimetro() + "\n";
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}

}