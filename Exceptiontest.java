class Exceptiontest
{
        public static void main(String[] args)
        {
                int a =10, b =2, c =2;
                int result;
                try
                {
                        result =a /(b-c);
                }
                catch(ArithmeticException ae)
                {
                        System.out.println("It is arithmetic exception cannot be divided by zero."+ae);
                }
                finally
                {
                        System.out.println("Final block");
                }
                result=a/(b+c);
                System.out.println("Result: "+result);
        }
}