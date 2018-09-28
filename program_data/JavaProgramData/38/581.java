package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int p = 0;p < n;p++)
		{
			int b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			double[] x = new double[100];
			double he = 0;
			double a;
			for (int i = 0;i < b;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				he += x[i];
			}
			a = he / b;
			double pfh = 0;
			for (int i = 0;i < b;i++)
			{
				pfh += (x[i] - a) * (x[i] - a);
			}
			double s;
			s = Math.pow(pfh / b,0.5);
			System.out.printf("%.5lf\n",s);
		}
		return 0;
	}





}

