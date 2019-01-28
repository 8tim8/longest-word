public class LongestWord {
public static String getLongest(String[] array){
      int maxLength=0;//if shortest, change maxLength=100;
      String longest="";
      for (String s:array) {//if shortest, change > to <;
          if (s.length()>maxLength) {
              maxLength =s.length();//will get longest length
              longest = s;
          }//no need “current” counter
      }
      return longest;
  }
public static int findIndex(String [] array) {
   int maxLength =0;//for index of shortest word,
   int index =0;//change maxLength from 0 to 100
   int count=0;//reverse > to <
   for(String s:array){ //not normal for loop,need “count”
         if(s.length()>maxLength){//replace “i”
         maxLength=s.length();//“maxLength” is length
         index=count; //assign “current” to “longest”
      }// “longest” is longest’index,instead of null string
      count++;// “current” is counter,
   }return index;//return after For loop
}
 public static void main(String[] args) {
      String[] food = {"sushi", "dumpling", "burger"};
     
System.out.println("Longest word is: "+getLongest(food));
System.out.println("Index of longest word: "+findIndex(food));
  }}
/* output
Longest word is: dumpling
Index of longest word: 1
*/