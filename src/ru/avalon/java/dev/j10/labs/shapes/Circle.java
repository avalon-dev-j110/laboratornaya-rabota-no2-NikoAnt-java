package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из всех точек на
 * плоскости, равноудалённых от заданной точки.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float R;// радиус окружности
    private float SCircle;// площадь окружности
    private float LCircle;// длина окружности

    public Circle(float R) {
        this.R = R;
    }

    public float getR() {
        return R;
    }

    public void setR(float R) {
        this.R = R;
    }

    @Override
    public float getLength() {
        return LCircle = (float) (2 * Math.PI * R);
    }

    @Override
    public float getArea() {
        return SCircle = (float) (Math.PI * Math.pow(R, 2));
    }

    @Override
    public String toString() {
        return "Окружность ";
//        final String Circle = "Окружность: площадь = ";
//        return Circle;
    }
}
