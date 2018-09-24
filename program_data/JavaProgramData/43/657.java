package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int sig = 0;
		int sigg = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= m / 2;a++)
		{
			for (j = 2;j <= a - 1;j++)
			{
				if (a % j == 0)
				{
				 sigg = 1;
			 break;
				}
			}
		if (sigg == 0)
		{
			  b = m - a;
		for (i = 2;i <= b - 1;i++)
		{
				if (b % i == 0)
				{
				 sig = 1;
			 break;
				}
		}
		if (sig == 0)
		{
		System.out.printf("%d %d\n",a,b);
		}
		sig = 0;
		}
		 sigg = 0;
		}
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
		return 0;
	}
}

