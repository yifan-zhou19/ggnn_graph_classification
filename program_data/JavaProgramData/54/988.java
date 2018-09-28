package <missing>;

public class GlobalMembers
{
	public static int apple(double n,double k)
	{
		double m;
		int x = 1;
		int i;
		while (true)
		{
			m = x * n + k;
			for (i = 1;i < n;i++)
			{
				m = m * n / (n - 1) + k;
			}
			int e = (int)m;
			if (m - e == 0)
			{
				return e;
			}
			else
			{
				x++;
			}
		}
	}
	public static void Main(String[] args)
	{
		double n;
		double k;
		int num;
		int x = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Double.parseDouble(tempVar2);
		}
		num = apple(n, k);
		System.out.printf("%d",num);
	}

}

