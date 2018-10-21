package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int judge = int x;
			int n;
			int i;
			int j;
			int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			d = 0;
			if (judge(i) == 1)
			{
				d = d + 1;
			}
			j = n - i;
			if (judge(j) == 1)
			{
				d = d + 1;
			}
			if (d == 2)
			{
				System.out.printf("%d %d\n",i,j);
			}

		}

		return 0;
	}
	public static int judge(int x)
	{
		int i;
		for (i = 2;i <= x / 2;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i > x / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

