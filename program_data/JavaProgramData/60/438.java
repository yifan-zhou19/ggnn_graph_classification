package <missing>;

public class GlobalMembers
{
	public static int check(int x)
	{
		int k;
		int n;
		n = (int)Math.sqrt(x);
		for (k = 2;k <= n;k++)
		{
			if (x % k == 0)
			{
				return (0);
			}
		}
		return (1);
	}

	public static void Main()
	{
		int n;
		int i;
		int r = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 2;i <= n - 2;i++)
		{
			if (check(i) != 0 && check(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
				r++;
			}
		}
		if (r == 0)
		{
			System.out.print("empty\n");
		}
	}
}

