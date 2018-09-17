package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[40];
		double[] b = new double[40];
		double m;
		int n;
		int p;
		int q;
		int i = 0;
		int j = 0;
		String c = new String(new char[8]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			c = c.substring(0, 4);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Double.parseDouble(tempVar3);
		}

			if (c.charAt(4) == 0)
			{
				a[i] = m;
				i++;
			}
			else
			{
				b[j] = m;
				j++;
			}
		}

		for (p = 0;p < i;p++)
		{
			for (q = 0;q < i - 1;q++)
			{
			if (a[q] > a[q + 1])
			{
				m = a[q];
				a[q] = a[q + 1];
				a[q + 1] = m;
			}
			}
		}

		for (p = 0;p < j;p++)
		{
			for (q = 0;q < j - 1;q++)
			{
			if (b[q] < b[q + 1])
			{
				m = b[q];
				b[q] = b[q + 1];
				b[q + 1] = m;
			}
			}
		}
		for (p = 0;p < i;p++)
		{
			System.out.printf("%.2lf ",a[p]);
		}
		for (p = 0;p < j;p++)
		{
			if (p != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%.2lf",b[p]);
		}
	}

}

