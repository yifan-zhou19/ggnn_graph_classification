package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		int i;
		int j = 1;
		for (i = 2;i * i <= x;i++)
		{
		if (x % i == 0)
		{
			j = 0;
			break;
		}
		}
		return j;
	}
	public static void Main()
	{
		int m;
		int i;
		int j;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i < m;i++)
		{
		if (judge(i) != 0)
		{
			p = i;
			for (j = i;j < m;j++)
			{
			if (judge(j) != 0)
			{
				q = j;
				if (p + q == m)
				{
					System.out.printf("%d %d\n",p,q);
					break;
				}
			}
			}
		}
		}
	}
}

