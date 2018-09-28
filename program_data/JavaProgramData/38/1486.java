package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 0;i < m;i++)
		{
			int n;
			int j;
			double[] x = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
			double p;
			double S = 0;
			double a = 0;
			p = x[0];
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
					p + j = Double.parseDouble(tempVar3);
				}
			}

			for (j = 0;j < n;j++)
			{
				a += *(p + j);
			}

			a = a / n;

			for (j = 0;j < n;j++)
			{
				S += (*(p + j) - a) * (*(p + j) - a);
			}

			S = S / n;
			S = Math.pow(S,0.5);
			System.out.printf("%.5lf\n",S);
		}
		return 0;
	}

}

