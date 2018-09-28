package <missing>;

public class GlobalMembers
{
	public static int check(int a)
	{
		int i;
		double k;
		k = Math.sqrt(a);
		for (i = 2; i <= k; i++)
		{
			if (a % i == 0)
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
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
		}
		for (i = 3; i + 2 <= n; i = i + 2)
		{
			if (check(i) == 1 && check(i + 2) == 1)
			{
				System.out.printf("%d %d\n", i, i + 2);
			}
		}
		return 0;
	}
}

