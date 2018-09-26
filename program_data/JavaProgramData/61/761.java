package <missing>;

public class GlobalMembers
{
	public static int fib(int n)
	{
		if (n <= 1)
		{
		return n;
		}
		else
		{
		return fib(n - 2) + fib(n - 1);
		}
	}
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int a;
		  for (int i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",fib(a));
		  }
	}
}

