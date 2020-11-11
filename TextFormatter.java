import java.util.StringTokenizer;
import java.util.ArrayList;

class TextFormatter {

  private static StringBuilder builder;
  private int maxLineLength;
  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  public static void main(String[] args) {
    TextFormatter tf = new TextFormatter(30);
    ArrayList<String> lines=tf.getLines();
     tf.printLeft(lines);
     System.out.println();
     tf.printRight(lines);
  }
  public TextFormatter(int maxLineLength){
    this.maxLineLength = maxLineLength;
  }
  private void printLeft(ArrayList<String> lines){
    for(String l:lines){
      System.out.println(l);
    }
  }
  private void printRight(ArrayList<String> lines){
    for(String l:lines){
      while(l.length()< maxLineLength){
        l=" "+l;
      }
      System.out.println(l);
    }
  }
  private ArrayList<String> getLines() {
    ArrayList<String> lines=new ArrayList<String>();
    StringTokenizer st = new StringTokenizer(text, " ");

    String currentLine= "";
    while ( st.hasMoreTokens() ) {
      String s1 = st.nextToken();
      if (currentLine.length()+s1.length() > maxLineLength){
        lines.add(currentLine);
        currentLine = "";
      }
      currentLine += s1+" ";
  
    }
    lines.add(currentLine);
    return(lines);
  }

}