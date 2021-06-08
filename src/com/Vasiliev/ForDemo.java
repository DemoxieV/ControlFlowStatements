package com.Vasiliev;

// Сумма квадратов натуральных чисел
public class ForDemo {
    public static void main(String[] args) {
        int s, n = 500;
            s=(n*(n+1)*(2*n+1))/6;

        //Альтернативный способ:
//        int s = 0, k, n = 500;
//        for (k = 1; k <= n; k++) {
//            s += k * k;
//        }
        // Вариации этого кода через цикл for:
/*    int s=0, n=10;
      for (int k=1; k<=n: k++) s+=k*k;

      int s,k,n=10;
      for(k=1, s=0; k<=n; s+=k*k, k++)

      int s=0,k=1,n=10;
      for(;k<=n;){
          s+=k*k;
          k++;
      }
*/
        //Этот же код через цикл while:
/*    int s=0,k=1,n=10;
      while(k<=n){
          s+=k*k;
          k++;
      }
*/
        //Почти также через do-while:
/*     int s=0,k=1,n=10;
       do{
            s+=k*k;
            k++;
       } while(k<=n);
*/
        //Бесконечный цикл for(;;)

        String txt = "Сумма квадратов чисел от 1 до " + n + ": " + s;
        System.out.println(txt);
    }
}
