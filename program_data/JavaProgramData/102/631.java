package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int q = -1;
		int p = -1;
		double[] sh = new double[100];
		double[] fe = new double[120];
		double[] me = new double[120];
		double t;
		double min1;
		double min2;
		char[][] a = new char[100][10];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sh[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(a[i],"male") == 0)
			{
				p++;
				me[p] = sh[i];

			}
			else if (strcmp(a[i],"female") == 0)
			{
				q++;
				fe[q] = sh[i];
			}
		}
		for (i = 0;i <= p;i++)
		{
			for (j = i + 1;j <= p;j++)
			{
				if (me[i] > me[j])
				{
					t = me[i];
					me[i] = me[j];
					me[j] = t;
				}
			}
		}
		for (i = 0;i <= q;i++)
		{
			for (j = i + 1;j <= q;j++)
			{
				if (fe[i] < fe[j])
				{
					t = fe[i];
					fe[i] = fe[j];
					fe[j] = t;
				}
			}
		}
		System.out.printf("%.2lf",me[0]);
		for (i = 1;i <= p;i++)
		{
			System.out.printf(" %.2lf",me[i]);
		}
		for (i = 0;i <= q;i++)
		{
			System.out.printf(" %.2lf",fe[i]);
		}
		return 0;

	}
}

