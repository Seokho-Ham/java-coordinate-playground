package coordinate.domain;

import coordinate.domain.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {
    @Test
    @DisplayName("포인트 객체를 올바르게 생성하는 테스트")
    void makePointInstance() {
        Point point1 = new Point(24,24);
        Point point2 = new Point(1,1);

        assertThat(point1.getX()).isEqualTo(24);
        assertThat(point1.getY()).isEqualTo(24);
        assertThat(point2.getX()).isEqualTo(1);
        assertThat(point2.getY()).isEqualTo(1);
    }

    @Test
    @DisplayName("포인트가 범위를 벗어날 경우 Exception을 발생시키는 테스트")
    void checkPointRange() {
        assertThatThrownBy(()->{
            Point point = new Point(24, -1);
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("포인트 값이 범위를 벗어납니다.");

        assertThatThrownBy(()->{
            Point point = new Point(-1, 25);
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("포인트 값이 범위를 벗어납니다.");

        assertThatThrownBy(()->{
            Point point = new Point(24, 25);
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("포인트 값이 범위를 벗어납니다.");

        assertThatThrownBy(()->{
            Point point = new Point(25, 22);
        }).isInstanceOf(IllegalArgumentException.class).hasMessage("포인트 값이 범위를 벗어납니다.");
    }
}
