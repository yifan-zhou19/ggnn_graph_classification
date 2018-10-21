package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int k = 0;
		int m;
		double[] b = new double[40];
		double[] c = new double[40];
		double zh;
		double[] d = new double[40];
		char[][] a = new char[40][7];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			if (a[i][0] == 109)
			{
				c[j] = b[i];
				j++;
			}
			else
			{
				d[k] = b[i];
				k++;
			}
		}
		for (m = 1;m < j;m++)
		{
			for (i = 0;i < j - m;i++)
			{
			if (c[i] > c[i + 1])
			{
				zh = c[i];
				c[i] = c[i + 1];
				c[i + 1] = zh;
			}
			}
		}
		for (m = 1;m < k;m++)
		{
			for (i = 0;i < k - m;i++)
			{
			if (d[i] < d[i + 1])
			{
				zh = d[i];
				d[i] = d[i + 1];
				d[i + 1] = zh;
			}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i == 0)
			{
			System.out.printf("%.2lf",c[i]);
			}
			else
			{
				System.out.printf(" %.2lf",c[i]);
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2lf",d[i]);
		}
			return 0;
	}
}

