package coordinate.domain.figures;

import coordinate.domain.Point;
import coordinate.domain.strategy.CalculateStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Figures {
    private final String SPECIAL_CHARACTERS_REGEXP = "[^\\uAC00-\\uD7A30-9a-zA-Z]";
    List<Point> points;

    public Figures() {
        this.points = new ArrayList<>();
    }

    public List<Point> getPoints() {
        return points;
    }

    public Point convertToPoint(String rawPoint) {
        String[] point = rawPoint.replaceAll(SPECIAL_CHARACTERS_REGEXP, " ").trim().split(" ");
        double x = Double.parseDouble(point[0]);
        double y = Double.parseDouble(point[1]);
        return new Point(x, y);
    }

    abstract double calculate(CalculateStrategy strategy);


}
