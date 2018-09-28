package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] s = new int[500];
		int[] a = new int[100];
		int j;
		i = 0,j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s[0] = 1,s[1] = 2;
		for (i = 2;i < 500;i++)
		{
			s[i] = s[i - 1] + s[i - 2];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		double[] z = new double[499];
		double b;
		b = 0;
		for (i = 0;i < 499;i++)
		{
			z[i] = 1.0 * s[i + 1] / s[i];
		}
		for (i = 0;i < n;i++)
		{
			b = 0;
			for (j = 0;j < a[i];j++)
			{
				b += z[j];
			}
			System.out.printf("%.3lf\n",b);
		}
	  return 0;
	}

}

