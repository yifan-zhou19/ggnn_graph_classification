package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k = 0;
		int l = 0;
		char[][] c = new char[40][10];
		double[] a = new double[40];
		double[] ag = new double[40];
		double[] ab = new double[40];
		double x;
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
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(c[i],"female") == 0)
			{
				ag[k] = a[i];
				k++;
			}
			if (strcmp(c[i],"male") == 0)
			{
				ab[l] = a[i];
				l++;
			}
		}
		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (ag[j] > ag[j + 1])
				{
					x = ag[j + 1];
					ag[j + 1] = ag[j];
					ag[j] = x;
				}
			}
		}
		for (i = 1;i <= l;i++)
		{
			for (j = 0;j < l - i;j++)
			{
				if (ab[j] > ab[j + 1])
				{
					x = ab[j + 1];
					ab[j + 1] = ab[j];
					ab[j] = x;
				}
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%.2lf ",ab[i]);
		}
		for (i = k - 1;i > 0;i--)
		{
			System.out.printf("%.2lf ",ag[i]);
		}
		System.out.printf("%.2lf",ag[0]);
		return 0;
	}
}

