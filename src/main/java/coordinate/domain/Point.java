package coordinate.domain;

public class Point {

    private static final double MAX_RANGE = 24;
    private static final double MIN_RANGE = 1;
    private final double x;
    private final double y;

    public Point(double x, double y) throws IllegalArgumentException {
        validatePoint(x, y);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return y;
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


}
