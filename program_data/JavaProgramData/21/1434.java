package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		int[] x = new int[300];
		int[] s = new int[300];
		int k = 0;
		double a;
		double[] y = new double[300];
		double sum = 0;
		double b = 0;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			sum += x[i];
		}
		a = sum / n;
		for (i = 0;i < n;i++)
		{
			if (x[i] > a)
			{
				y[i] = x[i] - a;
			}
			if (x[i] < a)
			{
				y[i] = a - x[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] > b)
			{
				b = y[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] == b)
			{
				s[k] = x[i];
				k = k + 1;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--)
			{
				if (s[j] < s[j - 1])
				{
					t = s[j];
					s[j] = s[j - 1];
					s[j - 1] = t;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",s[i]);
		}
		System.out.printf("%d",s[k - 1]);


		return 0;
	}


}

