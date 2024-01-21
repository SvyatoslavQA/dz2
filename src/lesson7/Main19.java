
//написать иерархию классов ФИГУРЫ
//фигура - треугольник - прямоугольник - квадрат - круг
//реализовать функцию подсчета площади и периметра для каждого типа фигуры
//создать массив из 5 фигур
//вывести на экран сумму периметров всех фигур в массиве
//не забыть ФОРМАТИРОВАНИЕ

package lesson7;

abstract class Figure {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Triangle extends Figure {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        return side1 * side2 / 2; //треугольник взял прямоугольный для простоты
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Rectangle extends Figure {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
}

class Circle extends Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class Main19 {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(11, 22, 33);
        figures[1] = new Rectangle(11, 22);
        figures[2] = new Square(11);
        figures[3] = new Circle(11);
        figures[4] = new Triangle(11, 22, 33);

        // Выводим на экран сумму периметров всех фигур в массиве
        double totalPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            totalPerimeter += figures[i].calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}