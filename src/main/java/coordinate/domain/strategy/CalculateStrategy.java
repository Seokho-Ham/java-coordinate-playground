package coordinate.domain.strategy;

import coordinate.domain.Point;

import java.util.List;

public interface CalculateStrategy {
    double calculate(List<Point> points);
}
