package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x = 0;
		int y = 0;
		double h;
		double[] a = new double[100];
		double[] b = new double[100];
		String c = new String(new char[100]);
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
				c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (c.charAt(0) == 'm')
			{
				a[x] = h;
				x++;
			}
			else if (c.charAt(0) == 'f')
			{
				b[y] = h;
				y++;
			}

		}
		double e;
		for (i = 1;i <= x;i++)
		{
			for (j = 0;j < x - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					e = a[j];
					a[j] = a[j + 1];
					a[j + 1] = e;
				}
			}
		}
		double f;
		for (i = 1;i <= y;i++)
		{
			for (j = 0;j < y - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					f = b[j];
					b[j] = b[j + 1];
					b[j + 1] = f;
				}
			}
		}
		System.out.printf("%.2lf",a[0]);
		for (i = 1;i < x;i++)
		{
		System.out.printf(" %.2lf",a[i]);
		}
		for (i = 0;i < y;i++)
		{
		System.out.printf(" %.2lf",b[i]);
		}
		return 0;
	}
}

