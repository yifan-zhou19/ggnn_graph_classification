package <missing>;

public class GlobalMembers
{
	public static int fib(int n)
	{
	   int i;
	   int s;
	   if (n == 1 || n == 2)
	   {
		s = 1;
	   }
	   if (n > 2)
	   {
	   s = fib(n - 1) + fib(n - 2);
	   }
	  return s;
	}
	public static int Main()
	{
	   int n;
	   int[] a = new int[100000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (int i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   }
	  for (int i = 0;i < n;i++)
	  {
	  System.out.printf("%d\n",fib(a[i]));
	  }
	  System.in.read();
	  System.in.read();
	}


}

