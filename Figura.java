package figuras;

public abstract class Figura {
	
	private String color;

	public Figura() {
		color = "blanco";
	}

	public Figura(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "de color " + color;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro(); 
	
}
