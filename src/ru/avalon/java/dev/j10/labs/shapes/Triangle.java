package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая фигура,
 * образованная тремя отрезками, которые соединяют три точки, не лежащие на
 * одной прямой. Указанные три точки называются вершинами треугольника, а
 * отрезки — сторонами треугольника. Часть плоскости, ограниченная сторонами,
 * называется внутренностью треугольника: нередко треугольник рассматривается
 * вместе со своей внутренностью (например, для определения понятия площади).
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    private String Triangle;// название фигуры
    private float x;//основание
    private float h;//высота в треугольнике, длина отрезка перпендикулярного основанию
    private float g;//гипотенуза
    private float STriangle;//площадь треугольника
    private float PTriangle;//периметр треугольника

    public Triangle(float x, float h, float g) {
        this.x = x;
        this.h = h;
        this.g = g;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getG() {
        return g;
    }

    public void setG(float g) {
        this.g = g;
    }

    

    @Override
    public float getPerimeter() {
        return PTriangle = (float) (x + h + g);
    }

    @Override
    public float getArea() {
        return STriangle = (float) ((x * h) / 2);
    }
    @Override
    public String toString() {
        return "Треугольник ";
    }
    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
