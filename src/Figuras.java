// ejercicio 4 sumativa 2 .cpp : Programa que calcula el area y el perimetro de las figuras circulo, cuadrado, rectangulo y triangulo y muestra el tipo de triangulo.
// Por: Josmar Osorio. Para: Programación II-UBA.

public class Figuras { //Creamos una clase principal llamada figuras.
    static class Circulo { //Creamos una clase llamada ciruclo que contendrá todos los metodos de esta figura.
        private final double radio;

        public Circulo(double radio) {
            this.radio = radio;//Creamos el elemento radio que es el dato que usaremos para calcular el area y el perimetro.
        }

        public double AreaCirculo() {//Creamos un metodo para calcular el area del circulo.
            return Math.PI * radio * radio;//Implementamos la formula para calcular el area de un circulo la cual es pi por su radio al cuadrado.
        }

        public double PerimetroCirculo() {//Creamos un metodo para calcular el perimetro del circulo.
            return 2 * Math.PI * radio;//Implentamos la formula para calcular el peirmetro de un circulo la cual es 2 por pi por el radio.
        }
        void imprimirCirculo(){ //Creamos un metodo para imprimir el area y el perimetro del circulo.
            System.out.println("El area del circulo es: "+ AreaCirculo());
            System.out.println("El Perimetro del circulo es: "+ PerimetroCirculo());
        }
    }

    static class Cuadrado { //Creamos una clase llamada cuadrado que contendrá todos los metodos de esta figura.
        private final double lado;

        public Cuadrado(double lado) {
            this.lado = lado;//Creamos el elemento lado que es el dato que usaremos para calcular el area y el perimetro.
        }

        public double AreaCuadrado() {//Creamos un metodo para calcular el area del cuadrado.
            return lado * lado;//Implementamos la formula para calcular el area de un cuadrado la cual es lado por lado.
        }

        public double PerimetroCuadrado() {//Creamos un metodo para calcular el perimetro del cuadrado.
            return 4 * lado;//Implentamos la formula para calcular el peirmetro de un cuadrado la cual es multiplicar los 4 lados del cuadrado.
        }
        void imprimirCuadrado(){ //Creamos un metodo para imprimir el area y el perimetro del cuadrado.
            System.out.println("El area del cuadrado es: "+ AreaCuadrado());
            System.out.println("El Perimetro del cuadrado es: "+ PerimetroCuadrado());
        }
    }

    static class Rectangulo { //Creamos una clase llamada Rectangulo que contendrá todos los metodos de esta figura.
        private final double base;
        private final double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;//Creamos el elemento base.
            this.altura = altura; //Creamos el elemento altura.
        }

        public double AreaRectangulo() { //Creamos un metodo para calcular el area del Rectangulo.
            return base * altura; //Implementamos la formula para calcular el area de un rectangulo la cual es multiplicar base por altura.
        }

        public double PerimetroRectangulo() { //Creamos un metodo para calcular el perimetro del Rectangulo.
            return 2 * base + 2 * altura; //Implementamos la ofrmula para calcular el perimetro de un rectangulo la cual es multiplicar por 2 base y altuta y luego sumarlos.
        }
        void imprimirRectangulo(){ //Creamos un metodo para imprimir el area y el perimetro del rectangulo.
            System.out.println("El area del rectangulo es: "+ AreaRectangulo());
            System.out.println("El Perimetro del rectangulo es: "+ PerimetroRectangulo());
        }
    }

    static class Triangulo { //Creamos una clase llamada Triangulo que contendrá todos los metodos de esta figura.
        private final double base;
        private final double altura;
        private final double lado1;
        private final double lado2;
        private final double lado3;

        public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
            this.base = base; //Creamos el elemento base.
            this.altura = altura; //Creamos el elemento altura.
            this.lado1 = lado1; //Creamos el elemento lado1.
            this.lado2 = lado2; //Creamos el elemento lado2.
            this.lado3 = lado3; //Creamos el elemento lado3.
        }

        public double AreaTriangulo() { //Creamos un metodo para calcular el area del triangulo.
            return (base * altura) / 2; //Implementamos la formula para calcular el area de un triangulo la cual es multiplicar base por altura y dividirlo entre 2.
        }

        public double PerimetroTriangulo() { //Creamos un metodo para calcular el perimetro del triangulo.
            return lado1 + lado2 + lado3; //Implementamos la formula para calcular el area de un triangulo la cual es sumar sus 3 lados.
        }

        public String TipodeTriangulo() { //Creamos un metodo para determinar el tipo de triangulo.
            if (lado1 == lado2 && lado1 == lado3) { //Creamos un condicional if que evalue las picibilidades.
                return "Equilátero"; //Si sus 3 lados son iguales mostrará que es equilatero.
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Isósceles"; //Si solo 2 de sus lados son iguales mostrará que es iséceles.
            } else {
                return "Escaleno";//Si ninguno de sus aldos son iguales mostrará que es escaleno.
            }
        }
        void imprimirTriangulo(){ //Creamos un metodo para imprimir el area, el perimetro y el tipo de triangulo.
            System.out.println("El area del triangulo es: "+ AreaTriangulo());
            System.out.println("El Perimetro del triangulo es: "+ PerimetroTriangulo());
            System.out.println("El tipo de triangulo es: "+ TipodeTriangulo());
        }
    }

    public static void main (String[] arg){

        System.out.println();

        Circulo circulo1 = new Circulo ( 10);//Creamos un objeto circulo1 y le asignamos valores a sus caracteristicas.
        circulo1.imprimirCirculo();//Llamamos al metodo impirmir circulo para que muestre el area y el perimetro de la figura.

        System.out.println();

        Cuadrado cuadrado1 = new Cuadrado(12);//Creamos un objeto cuadrado1 y le asignamos valores a sus caracteristicas.
        cuadrado1.imprimirCuadrado();//Llamamos al metodo impirmir cuadrado para que muestre el area y el perimetro de la figura.

        System.out.println();

        Rectangulo rectangulo1 = new Rectangulo(15,10);//Creamos un objeto rectangulo1 y le asignamos valores a sus caracteristicas.
        rectangulo1.imprimirRectangulo();//Llamamos al metodo impirmir rectangulo para que muestre el area y el perimetro de la figura.

        System.out.println();

        Triangulo triangulo1 = new Triangulo(6,8,10,8,8);//Creamos un objeto triangulo1 y le asignamos valores a sus caracteristicas.
        triangulo1.imprimirTriangulo();//Llamamos al metodo impirmir triangulo para que muestre el area, el perimetro y el tipo del triangulo.
    }
}