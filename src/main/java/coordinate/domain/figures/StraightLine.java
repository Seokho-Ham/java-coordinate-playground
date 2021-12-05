package coordinate.domain.figures;

import coordinate.domain.strategy.CalculateStrategy;

public class StraightLine extends Figures {
    public StraightLine(String[] rawPoints) throws IllegalArgumentException {
        super();
        for (String p : rawPoints) {
            this.points.add(convertToPoint(p));
        }
    }

    public double calculate(CalculateStrategy strategy) {
        return strategy.calculate(this.points);
    }
}
