package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int i;
		int j;
		int k = Math.sqrt(x);
		if (x == 2 || x == 3)
		{
			return 1;
		}
		else
		{
			for (i = 2,j = 2;i <= k;i++)
			{
				if (x % i == 0)
				{
					return 0;
				}
				else
				{
					j++;
				}
			}
			if (j >= k)
			{
				return 1;
			}
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
		if (n < 5)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 3;i <= n - 2;i += 2)
			{
				if (prime(i) == 1 && prime(i + 2) == 1)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		return 0;
	}
}

