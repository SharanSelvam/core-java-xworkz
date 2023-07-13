class Multiplication{
 static int count;
 public static void main(String args[]){
 mul(5,5);
 mul(2,5);
 mul(8,9);
 mul(6,7);
 mul(9,9);
 mul(12,12);
 mul(15,12);
 mul(851,45);
 mul(2,10);
 mul(10,100);
 System.out.println(count);
}

 public static void mul(int a,int b){
 System.out.println(a*b);
 count++;
 }
}