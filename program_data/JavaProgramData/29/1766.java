package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 1;
		int n;
		int t;
		int x;
		double s;
		double j;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (i <= m)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1,r = 2,t = 1,s = 0;t <= n;t++)
			{
				s = s + r / j;
				x = j + r;
				j = r;
				r = x;
			}
			System.out.printf("%.3lf\n",s);
					  i = i + 1;
		}
			return 0;
	}



}

