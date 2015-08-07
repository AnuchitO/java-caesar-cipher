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
	   	if (this.shift == 1 ) {
		   return (byte)((65 + 0));
	         }

	   	if (this.shift == 2 ) {
		   return (byte)((65 + (90+2-65)%26));
	         }
		
	   	if (this.shift == 3 ) {
		   return (byte)((65 + (90+3-65)%26));
	         }
		
	   	if (this.shift == 4 ) {
		   return (byte)((65 + (90+4-65)%26));
	         }
	   }

     return new Integer(ascii+this.shift).byteValue();
   }
}
