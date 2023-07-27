package ej2;

public class Operaciones {
	
	private Integer valorA,valorB;
	private String operacion;
	
	
	public Operaciones(Integer theValorA, Integer theValorB, String theOperacion) {
		valorA = theValorA;
		valorB = theValorB;
		operacion = theOperacion;
		validacion(operacion,valorA,valorB);
	}
	
	
	public static void validacion(String op,int a,int b) {
		op = op.toUpperCase();
		System.out.println(op);
		switch(op) {
			case "SUM":
				suma(a,b);
				break;
			case "RES":
				resta(a,b);
				break;
			case "MUL":
				multiplicacion(a,b);
				break;
			case "DIV":
				division(a,b);
				break;
			default:
				System.out.println("Opcion no valida, vuelve a intentar \n recuerda que las opciones son SUM,RES,MUL O DIV");
			
		}
	};
	
	public static void suma(int a, int b) {
		int resultado = a + b;
		System.out.println("El resultado de la suma es:" + resultado);
	};
	public static void resta(int a, int b) {
		int resultado = a - b;
		System.out.println("El resultado de la resta es:" + resultado);
	};
	public static void multiplicacion(int a, int b) {
		int resultado = a * b;
		System.out.println("El resultado de la multiplicacion es:" + resultado);
	};
	public static void division(int a, int b) {
		int resultado = a / b;
		System.out.println("El resultado de la division es:" + resultado);
	};
	

}
