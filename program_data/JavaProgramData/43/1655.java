package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int k;
		k = Math.sqrt(n);
		for (i = 3;i <= k;i = i + 2)
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
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i = i + 2)
		{
			if (sushu(i) != 0 && sushu(m - i) != 0)
			{
			System.out.printf("%d %d\n",i,m - i);
			}
		}
		return 0;
	}
}

