package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int j;
		int w;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int judge = int a;
		for (j = 2;j <= m / 2;j++)
		{
			w = judge(j);
			e = judge(m - j);
			if (w == 1 && e == 1)
			{
				System.out.printf("%d %d\n",j,m - j);
			}
		}

		return 0;
	}
	public static int judge(int a)
	{
		int i;
		int flag = 1;
		for (i = 2;i * i <= a;i++)
		{
			if (a % i == 0)
			{
					flag = 0;
			break;
			}
		}
		return flag;
	}
}

