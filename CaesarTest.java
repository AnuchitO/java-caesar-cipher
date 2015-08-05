import static org.junit.Assert.*;
import org.junit.Test;

public class CaesarTest {
  private String encryptText(String text, int shift) {
    Caesar caesar = new Caesar(text, shift);
    return caesar.getCipher();
  }

  @Test
  public void TestShiftTextOneCharactor(){
    assertEquals("B", encryptText("A", 1));
    assertEquals("C", encryptText("A", 2));
    assertEquals("D", encryptText("A", 3));
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
