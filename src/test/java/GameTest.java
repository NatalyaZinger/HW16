import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    public void TestWhenFirstPlayerIsMoreStrengther() {
        Game game = new Game();
        Player player1 = new Player(1, "Alex", 30);
        Player player2 = new Player(2, "Jane", 20);
        game.register(player1);
        game.register(player2);

        int expected = 1;
        int actual = game.round("Alex", "Jane");

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ExceptionWithNotRegisteredPlayer() {

        Game game = new Game();
        Player player1 = new Player(1, "Alex", 30);
        Player player2 = new Player(2, "Jane", 20);
        game.register(player1);
        game.register(player2);

        int expected = -1;
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("Ivan", "Sasha");
        });


    }
}
