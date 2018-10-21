package <missing>;

public class GlobalMembers
{
	public static int judge(int x,int y,int z)
	{
		int k;
		int take;
		int i;
		int n;
		int j;
		int re;
		double left;
		take = x;
		k = y;
		n = z;
		left = take * n * 1.0 + k;
		for (i = 0;i < n - 1;i++)
		{
			left = left * 1.0 * (n / (n - 1.0)) + k;
			j = left;
			if (left - j > 0)
			{
				re = 0;
				break;
			}
		re = left;

		}
		return re;
	}
	public static void monkey(int x,int y)
	{
		int n;
		int k;
		int i;
		int m;
		int a = 0;
		int j;
		double haha;
		n = x;
		k = y;
		for (i = k;;i++)
		{

			j = judge(i, k, n);
			if (j == 0)
			{

				j = j;
			}
			else
			{
				System.out.printf("%d",j);
			break;
			}
		}

	}

	public static int Main()
	{
	int n;
	int k;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}

	monkey(n, k);
	return 0;
	}

}

