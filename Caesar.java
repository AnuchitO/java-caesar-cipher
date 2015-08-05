public class Caesar {
   private String text;
   private int shift;

   public Caesar(String text, int shift) {
      this.text = text;
      this.shift = shift;
   }


   public String getCipher() {
     byte[] byteText = this.text.getBytes();
      
     byteText[0] = (byte)(byteText[0]+this.shift);        

     if(byteText.length == 2) {
        byteText[1] = (byte)(byteText[1]+this.shift);        
     }

     if(byteText.length == 3) {
        byteText[1] = (byte)(byteText[1]+this.shift);        
        byteText[2] = (byte)(byteText[2]+this.shift);        
     }

     if(byteText.length == 4) {
        byteText[1] = (byte)(byteText[1]+this.shift);        
        byteText[2] = (byte)(byteText[2]+this.shift);        
        byteText[3] = (byte)(byteText[3]+this.shift);        
     }

     return new String(byteText);

   }
}
