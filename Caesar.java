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
          byteText[index] = shiftText(byteText[index]);        
     } 

     return new String(byteText);
   }

   private byte shiftText(byte ascii) {
	   if (ascii == 'Z') {
		return (byte)((65 + (90+this.shift-65)%26));
	   }

     return new Integer(ascii+this.shift).byteValue();
   }
}
