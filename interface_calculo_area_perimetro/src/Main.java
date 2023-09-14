import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma figura geométrica: ");
        System.out.println("1. Triângulo");
        System.out.println("2. Círculo");
        System.out.println("3. Retângulo");
        System.out.println("4. Quadrado");
        int choice = scanner.nextInt();

        double area = 0;
        double perimeter = 0;

        switch (choice) {
            case 1:
                System.out.println("Digite a altura do triângulo: ");
                double triangleHeight = scanner.nextDouble();
                System.out.println("Digite a base do triângulo: ");
                double triangleBase = scanner.nextDouble();
                Triangle triangle = new Triangle(triangleHeight, triangleBase);
                area = triangle.getArea();
                perimeter = triangle.getPerimeter();
                break;
            case 2:
                System.out.println("Digite o raio do círculo: ");
                double circleRadius = scanner.nextDouble();
                Circle circle = new Circle(circleRadius);
                area = circle.getArea();
                perimeter = circle.getPerimeter();
                break;
            case 3:
                System.out.println("Digite o comprimento do retângulo: ");
                double rectangleLength = scanner.nextDouble();
                System.out.println("Digite a largura do retângulo: ");
                double rectangleWidth = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
                area = rectangle.getArea();
                perimeter = rectangle.getPerimeter();
                break;
            case 4:
                System.out.println("Digite o lado do quadrado: ");
                double squareSide = scanner.nextDouble();
                Square square = new Square(squareSide);
                area = square.getArea();
                perimeter = square.getPerimeter();
                break;
            default:
                System.out.println("Escolha inválida.");
                scanner.close();
                return;
        }

        System.out.println("Escolha a operação:");
        System.out.println("1. Cálculo de Área");
        System.out.println("2. Cálculo de Perímetro");
        int operationChoice = scanner.nextInt();

        switch (operationChoice) {
            case 1:
                System.out.println("Área: " + area);
                break;
            case 2:
                System.out.println("Perímetro: " + perimeter);
                break;
            default:
                System.out.println("Escolha inválida.");
        }

        scanner.close();
    }
}