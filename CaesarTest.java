import static org.junit.Assert.*;
import org.junit.Test;

public class CaesarTest {
  private String encryptText(String text, int shift) {
    Caesar caesar = new Caesar(text, shift);
    return caesar.getCipher();
  }

  @Test
  public void TestEncryptTextOneCharactor(){
    assertEquals("B", encryptText("A", 1));
    assertEquals("C", encryptText("A", 2));
    assertEquals("D", encryptText("A", 3));
  }

  @Test
  public void TestEncryptTextMoreThanOneCharactor() {
    assertEquals("BB", encryptText("AA", 1));
    assertEquals("BBB", encryptText("AAA", 1));
    assertEquals("CCCC", encryptText("AAAA", 2));
    assertEquals("BCDEF", encryptText("ABCDE", 1));
  }

  @Test
  public void charZShift1ShoudlBeA() {
    assertEquals("A", encryptText("Z", 1));
  }

  @Test
  public void charZShift2ShoudlBeB() {
    assertEquals("B", encryptText("Z", 2));
  }
  
  @Test
  public void charZShift3ShoudlBeC() {
    assertEquals("C", encryptText("Z", 3));
  }
  
  @Test
  public void charZShift4ShoudlBeE() {
    assertEquals("D", encryptText("Z", 4));
  }
//  @Test
//  public void charYShift1ShoudlBeZ() {
//    assertEquals("Z", encryptText("Y", 1));
//  }
//
//  @Test
//  public void charYShift2ShoudlBeA() {
//    assertEquals("A", encryptText("Y", 2));
//  }
//  
//  @Test
//  public void charYShift3ShoudlBeB() {
//    assertEquals("B", encryptText("Y", 3));
//  }
}
