package recursion;

public class Recursion {

    public static void main(String[] args) {

        Recursion recursion = new Recursion();

        int res = recursion.recur(1000);
        System.out.println(res);

        System.out.println("---------------------------------");
        int res2= recursion.tailRecursion(100,0);
        System.out.println(res2);

        int res3 = recursion.Fib(10);

        System.out.println("---------------------------------");
        System.out.println(res3);


    }


    /**
     * 普通递归
     * @param n
     * @return
     */
    public int recur(int n){

        //终止条件  归
        if(n ==1 ){
            return 1;
        }
        //递
        int res = recur(n-1);
        return n+res;
    }


    /**
     * 尾递归
     * @param n
     * @param res
     * @return
     */
    public int tailRecursion(int n,int res){

        //终止条件
        if (n == 0){
            return res;
        }

        return tailRecursion(n-1,res+n);
    }


    /**
     * 斐波那契数列
     */
    public int Fib(int n){

        if(n==1 || n==2){
            return n-1;
        }

        int res =Fib(n-1) +Fib(n-2);
        return res;
    }




}
