package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int i;
		int e;
		int p = 0;
		int o = 0;
		double w;
		double r;
		double[] M = new double[100];
		double[] F = new double[100];
		char[][] D = new char[50][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		for (i = 0;i < q;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				D[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w = Double.parseDouble(tempVar3);
			}
			if (D[i][0] == 'm')
			{
				M[p] = w;
							p++;

			}
			else if (D[i][0] == 'f')
			{
				F[o] = w;
				o++;
			}
		}
		for (i = 0;i < o;i++)
		{
			for (e = o - 1;e > 0;e--)
			{
				if (F[e] > F[e-1])
				{
					r = F[e];
					F[e] = F[e-1];
					F[e-1] = r;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			for (e = p - 1;e > 0;e--)
			{
			if (M[e] < M[e-1])
			{
				r = M[e];
				M[e] = M[e-1];
				M[e-1] = r;
			}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%0.2lf ",M[i]);
		}
		for (i = 0;i < o;i++)
		{
			if (i < o - 1)
			{
				System.out.printf("%0.2lf ",F[i]);
			}
			else if (i == o - 1)
			{
				System.out.printf("%0.2lf",F[i]);
			}
		}
		return 0;
	}

}

