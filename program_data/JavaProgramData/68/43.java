package <missing>;

public class GlobalMembers
{
	public static int k(int p)
	{
		int i;
		int h;
		int a = 1;
		if (p % 2 == 0)
		{
			if (p == 2)
			{
				return a;
			}
			a = 0;
			return a;
		}
		h = p / 2;
		for (i = 3;i <= h;i++)
		{
			if (p % i == 0)
			{
				a = 0;
				break;
			}
		}
		return a;
	}

	public static int Main()
	{
		int n;
		int i;
		int m;
		int k1;
		int k2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (m = 2;m <= i;m++)
			{
			   k1 = k(m);
			   k2 = k(i - m);
			   if (k1 == 1 && k2 == 1)
			   {
				   System.out.printf("%d=%d+%d\n",i,m,i - m);
				   break;
			   }
			}
		}
		return 0;
	}
}

