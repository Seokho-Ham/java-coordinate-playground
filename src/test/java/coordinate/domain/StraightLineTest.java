package coordinate.domain;

import coordinate.domain.figures.StraightLine;
import coordinate.domain.strategy.CalculateLineLengthStrategy;
import coordinate.domain.strategy.CalculateStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class StraightLineTest {
    @Test
    @DisplayName("직선 객체를 올바르게 생성하는 테스트")
    void makeStraightLine() {
        StraightLine line = new StraightLine(new String[]{"(1,5)", "(3,5)"});

        line.getPoints().stream().forEach((s)->{
            assertThat(s).isInstanceOf(Point.class);
        });
    }

    @Test
    @DisplayName("직선의 길이를 받는 테스트")
    void name() {
        StraightLine line = new StraightLine(new String[]{"(10,10)", "(14,15)"});
        CalculateStrategy strategy = new CalculateLineLengthStrategy();
        assertThat(line.calculate(strategy)).isEqualTo(6.403124, offset(0.00099));
    }
}
