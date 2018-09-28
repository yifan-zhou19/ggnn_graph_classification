package <missing>;

public class GlobalMembers
{
	public static int fei(int n)
	{
		int f;
		int i;
		int p1 = 1;
		int p2 = 2;
		if (n == 1)
		{
			return p1;
		}
		else if (n == 2)
		{
			return p1 + p1;
		}
		else
		{
			for (i = 0;i < n - 2;i++)
			{
				 f = p2 + p1;
				p1 = p2;
				p2 = f;
			}
			return p2;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			double s = 0;
			for (j = 1;j <= a;j++)
			{
				s += (double)(1.0 * fei(j + 1) / fei(j));
			}
			System.out.printf("%0.3lf\n",s);
		}
		return 0;
	}

}

