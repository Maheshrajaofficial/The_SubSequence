import java.util.*;

public class ArraySubSequence {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int limit = sc.nextInt();
     int arr[] = new int[limit];
     for(int i = 0; i < arr.length; i++){
       arr[i] = sc.nextInt();
     }
     ArrayList<Integer> list = new ArrayList<>();
     function( 0 ,arr.length , arr , list );
  }
  static void function(int index ,int len , int arr[] ,  ArrayList<Integer> list){
    if(index >= len){
      System.out.println(list.toString());
      return;
    }
    list.add(arr[index]);
    function(index+1 , len , arr , list);
    list.remove(list.size()-1);
    function(index+1 , len , arr, list);
  } 
}
//*******I/P********
//5
//1
//2
//3
//4
//5
/* ***********O/P***********
[1, 2, 3, 4, 5]
[1, 2, 3, 4]
[1, 2, 3, 5]
[1, 2, 3]
[1, 2, 4, 5]
[1, 2, 4]
[1, 2, 5]
[1, 2]
[1, 3, 4, 5]
[1, 3, 4]
[1, 3, 5]
[1, 3]
[1, 4, 5]
[1, 4]
[1, 5]
[1]
[2, 3, 4, 5]
[2, 3, 4]
[2, 3, 5]
[2, 3]
[2, 4, 5]
[2, 4]
[2, 5]
[2]
[3, 4, 5]
[3, 4]
[3, 5]
[3]
[4, 5]
[4]
[5]
[]*/
