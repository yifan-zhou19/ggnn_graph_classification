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
		double[] a = new double[100];
		double[] b = new double[100];
		double c;
		double s;
		String t = new String(new char[7]);
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
				t = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Double.parseDouble(tempVar3);
			}
			if (t.charAt(0) == 'm')
			{
				a[x] = c;
				x += 1;
			}
			if (t.charAt(0) == 'f')
			{
				b[y] = c;
				y += 1;
			}
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < x - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					s = a[j];
					a[j] = a[j + 1];
					a[j + 1] = s;
				}
			}
		}
		for (i = 0;i < y;i++)
		{
			for (j = 0;j < y - 1;j++)
			{
				if (b[j] < b[j + 1])
				{
					s = b[j];
					b[j] = b[j + 1];
					b[j + 1] = s;
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

