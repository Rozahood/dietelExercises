//import ChapterSix.TossedCoinGame;
//import chapterOne.TossedCoinGame;
//import org.junit.jupiter.api.BeforeEach;
//import org.testng.annotations.Test;
//
//import static org.testng.AssertJUnit.assertNotNull;
//
//public class TossedCoinGameTest {
//
//    private TossedCoinGame tossedCoinGame; //WE CREATE THIS INSTANCE VARIABLE `COS WE WOULD BE USING METHOD. TO CREAT AN OBJECT OVER AGAIN.....
//
//    @BeforeEach //WE USE @BEFORE EACH  BECAUSE WE WANT JVM TO RUN this
//    public void setup() {
//        tossedCoinGame = new TossedCoinGame();
//    }
//
//    @Test
//    public void testThatGameExists(){
//        TossedCoinGame tossedCoinGame = new TossedCoinGame();
//        assertNotNull(tossedCoinGame);
//    }
//
//    @Test
//    public void testMenuOption() {
//        String menu = tossedCoinGame.getGameMenue();
//        asserTrue(menu.equals("""
//                1. Tossed coin
//                2. Exit
//                """))
//    }
//
//    private void TossedCoinGame() {
//
//    }
//
//    }
//}
