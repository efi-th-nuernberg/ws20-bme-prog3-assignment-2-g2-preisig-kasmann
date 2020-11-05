class TextFormatter {

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  public static void main(String[] args) {
    System.out.println(formatterPrint(text, 30));
  }
  
  public static String formatterPrint(String aText, int maxLineLength) {
    int length = aText.length();
    String format ="";

    for(int i = 0; i<length; i = i + maxLineLength){
      if(i + maxLineLength >= length){
        maxLineLength = maxLineLength - (i + maxLineLength - length);
      }
      format = format + aText.substring(i, i + maxLineLength) + "\n";
    }
    return format;
  }
}