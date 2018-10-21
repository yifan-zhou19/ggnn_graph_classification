package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] sz = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		int i;
		int j;
		int k;
		int n;
		double[] s = new double[100];
		double[] S = new double[100];
		double d;
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
				sz[i] = Double.parseDouble(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			S[i] = 0;
			if (sz[i] > 2)
			{

				for (j = 2;j < sz[i];j++)
				{
					a[0] = 1;
				a[1] = 2;
				a[j] = a[j - 1] + a[j - 2];
				b[0] = 2;
				b[1] = 3;
				b[j] = b[j - 1] + b[j - 2];
				s[j] = b[j] / a[j];
				S[i] = S[i] + s[j];


				}
			d = S[i] + 3.5;
			System.out.printf("%.3lf\n",d);
			}
			if (sz[i] == 2)
			{
				System.out.print("3.500\n");
			}
			if (sz[i] == 1)
			{
				System.out.print("2.000\n");
			}
		}
		return 0;

	}
}

