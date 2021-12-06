package coordinate.domain.strategy;

import coordinate.domain.Point;

import java.util.List;

public class TriangleSizeStrategy implements CalculateStrategy{
    @Override
    public double calculate(List<Point> points) {
        //면적 = Math.sqrt(s(s-a)(s-b)(s-c))
        //s = (a+b+c)/2
        return 0;
    }
}
