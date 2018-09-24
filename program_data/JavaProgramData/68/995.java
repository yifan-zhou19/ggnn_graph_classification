package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int n = 0;
		double y;
		y = Math.sqrt(x * 1.0);
		for (i = 1;i <= y;i++)
		{
			if (x % i == 0)
			{
				n++;
			}
		}
		if (n == 1)
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
		int n = 6;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (n < m + 1)
		{
			for (i = 3;;i++)
			{
				if (sushu(i) == 1 && sushu(n - i) == 1)
				{
						System.out.printf("%ld=%ld+%ld\n",n,i,n - i);
						break;
				}
			}
			n += 2;
		}
		return 0;
	}

}

