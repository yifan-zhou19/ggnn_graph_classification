package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		float[] x = new float[100];
		double a;
		double s;
		double y;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Float.parseFloat(tempVar3);
				}
			}
			a = 0;
			y = 0;
			for (j = 1;j <= n;j++)
			{
				a = a + x[j];
			}
			a = a / n;
			for (j = 1;j <= n;j++)
			{
				y = y + (x[j] - a) * (x[j] - a);
			}
			s = Math.sqrt(y / n);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}


}

