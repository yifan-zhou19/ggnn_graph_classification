package <missing>;

public class GlobalMembers
{
	public static int su(int i)
	{
		int d = 2;
		while (i % d != 0)
		{
			  d = d + 1;
		}
		if (d >= i)
		{
		   return (1);
		}
		else
		{
		   return (0);
		}
	}
	public static int Main()
	{
		int su = int i;
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n >= 5)
		{
		   for (a = 3;a <= n - 2;a += 2)
		   {
			  b = a + 2;
			  if (su(a) != 0 && su(b) != 0)
			  {
				 System.out.printf("%d %d\n",a,b);
			  }
		   }
		}
		else
		{
		 System.out.print("empty");
		}
	}

}

