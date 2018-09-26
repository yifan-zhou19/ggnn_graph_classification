package <missing>;

public class GlobalMembers
{
	public static double F(int n)
	{
		int i;
		int[] a = new int[100];
		a[0] = 1;
		a[1] = 2;
		for (i = 2;i <= n - 1;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		return a[n - 1];
	}


	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		double s;
		double t;
		for (i = 1;i <= m;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				t = F(j + 1) / F(j);
				s = s + t;
			}
			System.out.printf("%.3lf\n", s);
		}
		return 0;
	}

}

