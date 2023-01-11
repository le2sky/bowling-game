import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class GameTest {

  private Game game;

  @Before
  public void setUp() throws Exception {
    game = new Game();
  }

  @Test
  public void canCreate() {
  }

  @Test
  public void canRoll() {
    game.roll(0);
  }

  private void rollMany(int pins, int frames) {
    for (int i = 0; i < frames; i++) {
      game.roll(pins);
    }
  }

  @Test
  public void gutterGame() {
    rollMany(0, 20);
    assertThat(game.getScore(), is(0));
  }

  @Test
  public void allOnes() {
    rollMany(1, 20);
    assertThat(game.getScore(), is(20));
  }

  @Ignore
  @Test
  public void oneSpare() {
    game.roll(5);
    game.roll(5); //spare
    game.roll(3);
    game.roll(0);
    rollMany(17, 0);
    assertThat(game.getScore(), is(16));
  }
}