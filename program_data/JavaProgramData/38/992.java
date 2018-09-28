package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int n;
		double h;
		double a;
		double H;
		double A;
		double N;
		double[] x = new double[100];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			h = 0;
			H = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				N = Double.parseDouble(tempVar2);
			}
			n = N;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				h = h + x[j];
			}
			a = h / N;
			for (j = 0;j < n;j++)
			{
				H = H + ((x[j] - a) * (x[j] - a));
			}
			A = H / N;
			s[i] = Math.sqrt(A);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",s[i]);
		}
		return 0;
	}
}

