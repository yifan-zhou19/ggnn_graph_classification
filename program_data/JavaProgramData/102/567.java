package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j = 0;
		int l = 0;
		int n;
		double k;
		double[] b = new double[100];
		double[] c = new double[100];
		double t;
		String a = new String(new char[7]);
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k = Double.parseDouble(tempVar3);
			}
			if (a.charAt(0) == 'm')
			{
				b[j] = k;
				j++;
			}
			if (a.charAt(0) == 'f')
			{
				c[l] = k;
				l++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (m = 0;m < j - 1;m++)
			{
				if (b[m] > b[m + 1])
				{
					t = b[m];
					b[m] = b[m + 1];
					b[m + 1] = t;
				}
			}
		}
	for (i = 0;i < l;i++)
	{
			for (m = 0;m < l - 1;m++)
			{
				if (c[m] < c[m + 1])
				{
					t = c[m];
					c[m] = c[m + 1];
					c[m + 1] = t;
				}
			}
	}
	System.out.printf("%.2lf",b[0]);
	for (i = 1;i < j;i++)
	{
			System.out.printf(" %.2lf",b[i]);
	}
	for (i = 0;i < l;i++)
	{
			System.out.printf(" %.2lf",c[i]);
	}
	}


}

