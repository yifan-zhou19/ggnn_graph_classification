package <missing>;

public class GlobalMembers
{
	public static int su(int m)
	{
		int j;
		for (j = 2;j <= m - 1;j++)
		{
			if (m % j == 0)
			{
			   return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = 0;
		for (i = 3;i <= n - 2;i++)
		{
			if ((su(i) == 1) && (su(i + 2) == 1))
			{
			   p = 1;
			   System.out.printf("%d %d\n",i,i + 2);
			}
		}
	if (p == 0)
	{
		System.out.print("empty");
	}
	}


}

