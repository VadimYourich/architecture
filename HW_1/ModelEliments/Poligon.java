package HW_1.ModelEliments;

import HW_1.Stuff.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Poligon {
    public List<Point3D> points = new ArrayList<Point3D>();
    /**
     * конструктор
     *
     * @param point
     */
    public Poligon(Point3D point) {
        points.add(point);
    }
}