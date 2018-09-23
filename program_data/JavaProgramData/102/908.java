package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int p = 0;
		double e;
		double[] a = new double[40];
		double[] b = new double[40];
		double[] h = new double[41];
		String sex = new String(new char[7]);
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
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex,"male") == 0)
			{
				a[k] = h[i];
				k++;
			}
			else
			{
				b[p] = h[i];
				p++;
			}
		}

		for (i = 1;i <= k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					e = a[j];
					a[j] = a[j + 1];
					a[j + 1] = e;
				}
			}
		}
		for (i = 1;i <= p;i++)
		{
			for (j = 0;j < p - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					e = b[j];
					b[j] = b[j + 1];
					b[j + 1] = e;
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2lf ",a[i]);
		}
		for (i = 0;i < p;i++)
		{
			if (i == p - 1)
			{
				System.out.printf("%.2lf",b[i]);
			}
			else
			{
				System.out.printf("%.2lf ",b[i]);
			}
		}
		return 0;
	}

}

