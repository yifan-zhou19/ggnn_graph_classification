package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int j;
		int i;
		double[] x = new double[100];
		double t;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			t = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				t += x[j];
			}
			t /= n;
			s = 0;
			for (j = 0;j < n;j++)
			{
				s += (x[j] - t) * (x[j] - t);
			}
			s /= n;
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}

}

