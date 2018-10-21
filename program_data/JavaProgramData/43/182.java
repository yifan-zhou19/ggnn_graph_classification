package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int k;
		k = Math.sqrt(x);
		for (i = 2;i <= k;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i > k)
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
		int m;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i < (m + 2) / 4;i++)
		{
			a = 2 * i + 1;
			b = m - a;
			if (sushu(a) == 1)
			{
				if (sushu(b) == 1)
				{
					System.out.printf("%d %d\n",a,b);
				}
			}
		}
		return 0;
	}

}

