package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int r1;
		int e;
		int r2;
		int p1;
		int f;
		int p2;
		double s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			r1 = 2;
			r2 = 3;
			p1 = 1;
			p2 = 2;
	if (n == 1)
	{
	s = 2.000;
	}
	else if (n == 2)
	{
	s = 2.000 + 1.500;
	}
	else
	{
			s = (double)r1 / p1 + (double)r2 / p2;
			for (j = 2;j < n;j++)
			{
				e = r2;
				r2 = r1 + r2;
				r1 = e;
				f = p2;
				p2 = p1 + p2;
				p1 = f;
				s = s + (double)(r2) / (p2);
			}



	}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}

}

