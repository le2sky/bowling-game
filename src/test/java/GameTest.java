import org.junit.Before;
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
    Game game = new Game();
    game.roll(0);
  }
}