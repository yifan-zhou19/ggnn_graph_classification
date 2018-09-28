package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int n;
			int j;
			int l;
			double[] x = new double[100];
			double a = 0.0;
			double b;
			double c;
			double d = 0.0;
			double e;
			double s;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				a = a + x[j];
			}
			b = a / n;
			for (l = 0;l < n;l++)
			{
				c = (x[l] - b) * (x[l] - b);
				d = d + c;
			}
			e = d / n;
			s = Math.sqrt(e);
			System.out.printf("%.5lf\n",s);
		}
	}


}

