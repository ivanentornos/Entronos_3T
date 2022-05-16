package figuras;

public class Principal {

	public static void main(String[] args) {
		
		Figura cuadrado = new Cuadrado("verde", 2);
		Figura rectangulo1 = new Rectangulo("naranja", 8, 2);
		Figura triangulo1 = new Triangulo("blanco", 5, 5); 

		Rectangulo rectangulo = new Rectangulo("rojo", 2, 4); 
		Triangulo triangulo = new Triangulo("azul", 2, 4);
		Circulo circulo = new Circulo("amarillo", 2); 
		
		System.out.println(cuadrado.toString());
		System.out.println(rectangulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(circulo.toString());
		System.out.println(rectangulo1.toString());
		System.out.println(triangulo1.toString());
		
		System.out.println();
		System.out.println("Área cuadrado: " + cuadrado.calcularArea());
		System.out.println("Área rectángulo: " + rectangulo.calcularArea());
		System.out.println("Área triángulo: " + triangulo.calcularArea());
		System.out.println("Área círculo: " + circulo.calcularArea());
		System.out.println("Área rectángulo: " + rectangulo1.calcularArea());
		System.out.println("Área triángulo: " + triángulo1.calcularArea());

	}

}
