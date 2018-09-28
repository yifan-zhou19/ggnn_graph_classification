package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (n / 2);i = i + 2)
		{
			if (check(i) != 0 && check(n - i) != 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
		}
	}

	public static int check(int a)
	{
		int i;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
}

