package <missing>;

public class GlobalMembers
{
	public static int p(int n)
	{
	for (int i = 2;i * i <= n;i++)
	{
	   if (n % i == 0)
	   {
		   return 0;
	   }
	}
	   return 1;
	}
	public static int Main()
	{
		int a;
		int p = int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (int i = 3;2 * i <= a;i++)
		{
		 if (p(i) * p(a - i) != 0)
		 {
			 System.out.printf("%d %d\n",i,a - i);
		 }
		}
	}

}

