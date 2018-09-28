package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		float c;
		c = 0F;
		int[] sz = new int[100];
		double[] s = new double[100];
		double[] z = new double[100];
		double[] rt = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 0;a < m;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[a] = Integer.parseInt(tempVar2);
			}
		}

		a = 0;
		while (a < m)
		{
			for (b = 0;b < sz[a];b++)
			{
				if (b == 0)
				{
					s[b] = 1;
					z[b] = 2;
					rt[b] = z[b] / s[b];
				}
				else if (b == 1)
				{
					s[b] = 2;
					z[b] = 3;
					rt[b] = z[b] / s[b];
				}

				else
				{
					z[b] = z[b - 1] + z[b - 2];
					s[b] = s[b - 1] + s[b - 2];
					rt[b] = z[b] / s[b];

				}

				c += rt[b];

			}
			System.out.printf("%.3f\n",c);
			c = 0F;
			a++;

		}
		return 0;
	}

}

