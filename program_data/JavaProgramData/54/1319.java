package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 2,j = 2,m = n + k;i <= n;i++)
		{
			if (m % (n - 1) == 0)
			{
				m = m / (n - 1) * n + k;
			}
			else
			{
				m = n * (j++) + k;
				i = 1;
			}
		}
		System.out.printf("%ld",m);
	}
}

