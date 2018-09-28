package <missing>;

public class GlobalMembers
{
	public static int test(int p)
	{
		int i;
		int m = (int)Math.sqrt(p) + 1;
		for (i = 2; i <= m; i++)
		{
			if (p % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		int n;
		int i;
		int flag;

		flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2; i + 2 <= n; i++)
		{
			if (test(i) != 0 && test(i + 2) != 0)
			{
				flag = 1;
				System.out.printf("%d %d\n", i, i + 2);
			}
		}
		if (flag == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

