package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int k = 2;
		while (k <= a / 2)
		{
			if (a % k == 0)
			{
				return 0;
				break;
			}
			else
			{
				k++;
			}
		}
		if (k > a / 2)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			if (prime(i) == 1 && prime(n - i) == 1)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}

}

