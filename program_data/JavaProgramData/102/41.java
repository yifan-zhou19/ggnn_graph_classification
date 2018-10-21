package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int j;
		double h = 0;
		double m = 0;
		double[] a1 = new double[40];
		double[] b1 = new double[40];
		final String p = "male";
		final String q = "female";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String s = new String(new char[40]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (strcmp(s,p) == 0)
			{
				a1[a] = h;
				a++;

			}
			else if (strcmp(s,q) == 0)
			{
				b1[b] = h;
				b++;
			}
		}

		for (i = 1;i <= a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (a1[j] > a1[j + 1])
				{
					m = a1[j];
					a1[j] = a1[j + 1];
					a1[j + 1] = m;
				}
			}
		}
		for (i = 1;i <= b;i++)
		{
			for (j = 0;j < b - i;j++)
			{
				if (b1[j] > b1[j + 1])
				{
					m = b1[j];
					b1[j] = b1[j + 1];
					b1[j + 1] = m;
				}
			}
		}

		System.out.printf("%.2lf",a1[0]);
		for (i = 1;i < a;i++)
		{
			System.out.printf(" %.2lf",a1[i]);
		}

		for (i = b - 1;i >= 0;i--)
		{
			System.out.printf(" %.2lf",b1[i]);
		}

		return 0;
	}


}

