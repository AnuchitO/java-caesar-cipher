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
  public void charAAShift1ShouldBeBB() {
    Caesar caesar = new Caesar("AA", 1);
    assertEquals("BB", caesar.getCipher());
  }

  @Test
  public void charAAAShift1ShouldBeBBB() {
    Caesar caesar = new Caesar("AAA", 1);
    assertEquals("BBB", caesar.getCipher());
  }

  @Test
  public void charAAAAShift2ShouldBeCCCC() {
    Caesar caesar = new Caesar("AAAA", 2);
    assertEquals("CCCC", caesar.getCipher());
  }

  @Test
  public void charABCDEShift1ShouldBeBCDEF() {
    Caesar caesar = new Caesar("ABCDE", 1);
    assertEquals("BCDEF", caesar.getCipher());
  }
}
