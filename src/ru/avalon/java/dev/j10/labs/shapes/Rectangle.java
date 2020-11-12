package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы прямые (равны 90
 * градусам).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private String Rectangle;// название фигуры
    private float a;// длина 1-ой стороны
    private float b;// длина 2-ой стороны
    private float SRectangle;// площадь четырехугольника
    private float PRectangle;// периметр четырехугольника

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    @Override
    public float getPerimeter() {
        return PRectangle = (float) (2 * a + 2 * b);
    }

    @Override
    public float getArea() {
        return SRectangle = (float) (a * b);
    }

    @Override
    public String toString() {
        return "Четырехугольник ";
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
