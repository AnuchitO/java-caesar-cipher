public class Caesar {
   private String text;
   private int shift;

   public Caesar(String text, int shift) {
      this.text = text;
      this.shift = shift;
   }


   public String getCipher() {
     byte[] byteText = this.text.getBytes();
     
     for (int index = 0;index < byteText.length; index++){
          byteText[index] = getByte(byteText[index]+this.shift);        
     } 

     return new String(byteText);
   }

   private byte getByte(int ascii) {
     return (byte)(ascii);
   }
}
