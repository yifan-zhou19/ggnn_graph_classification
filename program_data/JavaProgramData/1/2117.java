package <missing>;

public class GlobalMembers
{
	public static int wtf(int p, int a)
	{
		int i;
		int ways = 0;
		int j = 0;
		int m = (int)Math.sqrt(a);
		for (;p <= m;p++)
		{
				if (a % p == 0 && a >= p * p)
				{
					ways = ways + wtf(p, a / p);
					j++;
				}
		}
		if (j == 0)
		{
		return 1;
		}
		else
		{
		return ways + 1;
		}
	}
	public static int Main()
	{
	int n;
	int i;
	int a;
	int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  System.out.printf("%d\n",wtf(2, a));
	}
	return 0;
	}

}

