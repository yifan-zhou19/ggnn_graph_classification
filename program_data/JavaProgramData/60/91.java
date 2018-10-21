package <missing>;

public class GlobalMembers
{
	public static int prime(int m)
	{
		int i;
		for (i = 2;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				return 0;
				break;
			}
		}
		if (i > Math.sqrt(m))
		{
			return 1;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 2;i < n;i++)
			{
			j = i + 2;
			if (prime(i) != 0 && prime(j) != 0 && j <= n)
			{
				System.out.printf("%d %d\n",i,j);
			}
			}
		}

	}
}

