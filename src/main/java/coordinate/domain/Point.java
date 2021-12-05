package coordinate.domain;

import java.util.HashMap;
import java.util.Map;

public class Point {
    private static final String HORIZONTAL_POINT = "X";
    private static final String VERTICAL_POINT = "Y";
    private static final double MAX_RANGE = 24;
    private static final double MIN_RANGE = 1;
    private final double x;
    private final double y;

    public Point(double x, double y) throws IllegalArgumentException {
        validatePoint(x, y);
        this.x = x;
        this.y = y;
    }

    private void validatePoint(double x, double y) throws IllegalArgumentException {
        if (!isWithinRange(x) || !isWithinRange(y)) {
            throw new IllegalArgumentException("포인트 값이 범위를 벗어납니다.");
        }
    }

    private boolean isWithinRange(double num) {
        if (num < MIN_RANGE || num > MAX_RANGE) {
            return false;
        }
        return true;
    }

    public Map<String, Double> getPoints() {
        Map<String, Double> points = new HashMap<>();
        points.put(HORIZONTAL_POINT, x);
        points.put(VERTICAL_POINT, y);

        return points;
    }


}
