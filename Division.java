class Division{
 static int count;
 public static void main(String args[]){
 div(49,7);
 div(81,9);
 div(144,12);
 div(100,10);
 div(64,8);
 div(24,6);
 div(36,4);
 div(246,2);
 div(369,3);
 div(105,5);
 System.out.println(count);
 }
  public static void div(int a,int b){
  System.out.println(a/b);
  count++;
  }
 }