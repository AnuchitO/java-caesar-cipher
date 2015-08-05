public class Caesar {
   private String text;
   private int shift;

   public Caesar(String text, int shift) {
      this.text = text;
      this.shift = shift;
   }


   public String getCipher() {
     byte[] byteText = this.text.getBytes();
      
     if (this.shift == 2) {
       byteText[0] = (byte)(byteText[0]+2);        
       return new String(byteText);
     }

     if (this.shift == 3) {
       byteText[0] = (byte)(byteText[0]+3);        
       return new String(byteText);
     }
     
     byteText[0] = (byte)(byteText[0]+1);        
     return new String(byteText);

   }
}
