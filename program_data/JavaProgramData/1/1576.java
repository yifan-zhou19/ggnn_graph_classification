package <missing>;

public class GlobalMembers
{
	public static int col(int a, int b)
	{
		int i;
		int t;
		int tt = 0;
		int sig = 0;
	for (i = b;(i < a / 2) && ((a / i) >= i);i++)
	{
		if (a % i == 0)
		{
			t = a / i;
		 tt = tt + 1 + col(t, i);
		 sig = 1;
		}
	}
	if (sig == 0)
	{
	  tt = 0;
	}
	 return (tt);
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
	   l = col(m, 2) + 1;
	   System.out.printf("%d\n",l);
	}
	   return 0;
	}
}

