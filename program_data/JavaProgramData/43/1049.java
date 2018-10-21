package <missing>;

public class GlobalMembers
{
	public static int SU(int n)
	{
		int i;
		int k = 0;
		for (i = 2;i <= n / 2;i++)
		{
			if (n % i == 0)
			{
				k++;
			}
		}
		if (k == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			j = n - i;
			if (SU(i) == 1)
			{
				if (SU(j) == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}
}

