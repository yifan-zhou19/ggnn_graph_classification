package <missing>;

public class GlobalMembers
{
	public static int count(int m,int n,int max)
	{
		int tp = 0;
		int st = 0;
		int i;
		if (n * max < m)
		{
			return 0;
		}
		if (m <= 1)
		{
			return 1;
		}
		else if (n == 1)
		{
			return 1;
		}
		else
		{
			if (fmod(m,n) == 0)
			{
				st = m / n;
			}
			else
			{
				st = m / n + 1;
			}
		 if (max >= m)
		 {
			 max = m;
		 }
		for (i = max;i >= st;i--)
		{
			tp = tp + count(m - i, n - 1, i);
		}
		 return tp;
		}
	}
	public static int Main()
	{
		int i;
		int total;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			total = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= total;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",count(m, n, m));
		}
		return 7;
	}

}

