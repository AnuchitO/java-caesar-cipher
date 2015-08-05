import static org.junit.Assert.*;
import org.junit.Test;

public class CaesarTest {
  @Test
  public void charAShift1ShoudleBeB(){
    Caesar caesar = new Caesar("A", 1);
    assertEquals("B", caesar.getCipher());
  }


  @Test
  public void charAShift2ShouldBeC() {
    Caesar caesar = new Caesar("A", 2);
    assertEquals("C", caesar.getCipher());
  }

  @Test
  public void charAShift2ShouldBeD() {
    Caesar caesar = new Caesar("A", 3);
    assertEquals("D", caesar.getCipher());
  }

  @Test
  public void chatAAShift2ShouldBeBB() {
    Caesar caesar = new Caesar("AA", 1);
    assertEquals("BB", caesar.getCipher());
  }
}
