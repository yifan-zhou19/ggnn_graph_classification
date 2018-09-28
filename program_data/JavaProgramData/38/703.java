package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double b;
		double a;
		double B;
		double A;
		int[] sz = new int[200];
		double[] x = new double[200];
		double[] s = new double[200];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			A = 0;
			for (j = 0;j < (sz[i]);j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(x[j]) = Double.parseDouble(tempVar3);
				}
				A += x[j];

			}
			a = A / sz[i]; //printf("%lf",a);
			B = 0;
			for (j = 0;j < sz[i];j++)
			{

				B += (x[j] - a) * (x[j] - a); //printf("%lf",B);

			}
			b = B / sz[i]; //printf("%lf",b);
			s[i] = Math.sqrt(b);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.5lf\n",s[i]);
		}
	return 0;
	}

}

