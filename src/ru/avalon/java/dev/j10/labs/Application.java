package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.Ellipse;

public class Application {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        Shape shape = null;
        int z = 25;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(3);
            switch (randomNumber) {
                case 0:
                    shape = new Circle(random.nextInt(z));
                    break;
                case 1:
                    shape = new Rectangle(random.nextInt(z), random.nextInt(z));
                    break;
                case 2:
                    shape = new Triangle(random.nextInt(z), random.nextInt(z), random.nextInt(z));
                    break;
            }
            shapes[i] = shape;
            System.out.println(shape.toString() + "площадь = " + shape.getArea());//вывод массива в рандомном порядке

        }
        float maxArea = maxArea(shapes);
        System.out.println("-----------------------------------");
        System.out.println("Максимальная площадь = " + maxArea);//вывод максимальной площади

    }

    private static float maxArea(Shape[] shapes) {//поиск максимальной площади фигуры
        int maxIndex = 0;
        if (shapes.length == 0) {
            return 0;
        }
        float max = shapes[0].getArea();
        for (int i = 1; i < shapes.length; i++) {
            if (max < shapes[i].getArea()) {
                max = shapes[i].getArea();
                maxIndex = i;
            }
        }
        return max;

    }
    // Не реализовано:
    // проверка на получение нулевых показателей площади
    // длины окружности и пириметров n-угольников
    // вывод индекса максимального значения площади
    /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
     */
}
