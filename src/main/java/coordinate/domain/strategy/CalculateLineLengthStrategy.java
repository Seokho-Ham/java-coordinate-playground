package coordinate.domain.strategy;

import coordinate.domain.Point;

import java.util.List;

public class CalculateLineLengthStrategy implements CalculateStrategy {

    @Override
    public double calculate(List<Point> points) {
        Point firstPoint = points.get(0);
        Point secondPoint = points.get(1);
        return Math.sqrt(Math.pow((firstPoint.getX() - secondPoint.getX()), 2) + Math.pow((firstPoint.getY() - secondPoint.getY()), 2));
    }
}
