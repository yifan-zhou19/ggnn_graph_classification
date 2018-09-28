package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
			int n;
			int i;
			double res = 0;
			double temp1 = 1.0;
			double temp2 = 2.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0; i < n; ++i)
			{
				res = res + temp2 / temp1;
				temp2 += temp1;
				temp1 = temp2 - temp1;
			}
			System.out.printf("%.3lf\n", res);
		}
	}
}

