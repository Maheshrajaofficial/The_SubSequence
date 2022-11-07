import java.util.*;

public class SubSequence {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      String str = sc.next();
      int len = str.length();
      ArrayList<String> list = new ArrayList<>();
      String subString = "";
      for(int i = 0; i < 1<<len; i++){
        subString = "";
        for(int  j = 0; j  < len; j++){
          if((i &(1 << j)) != 0){
            subString +=str.charAt(j);
          }
        }
        if(subString.length() > 0) list.add(subString);
      }
      System.out.println(list.toString());
  }
}
