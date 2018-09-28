package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int prime = int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n - 2;i++)
		{
			if (prime(i) * prime(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				t = t + 1;
			}
		}
		if (t == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}

	public static int prime(int x)
	{
		int i;
		int y;
		if (x == 1)
		{
			return 0;
		}
		else
		{
			y = Math.sqrt((float)x);
			for (i = 2;i <= y;i++)
			{
				if (x % i == 0)
				{
					break;
				}
			}
			if (i > y)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	}
}

