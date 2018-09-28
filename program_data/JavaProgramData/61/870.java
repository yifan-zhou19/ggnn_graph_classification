package <missing>;

public class GlobalMembers
{
	public static int fun(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
		   int sum = 0;
		   sum = fun(n - 1) + fun(n - 2);
		   return sum;
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
	   int num;
	   for (int i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  num = Integer.parseInt(tempVar2);
		  }
		  System.out.printf("%d\n",fun(num));
	   }
	   System.in.read();
	   System.in.read();
	}

}

