package <missing>;

public class GlobalMembers
{
	public static int mao(double[] a, int n)
	{
		double tmp = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 1;j < n;j++)
			{
				if (a[j] < a[j - 1])
				{
					tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
		return 0;
	}
	public static int mao1(double[] a, int n)
	{
		double tmp = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 1;j < n;j++)
			{
				if (a[j] > a[j - 1])
				{
					tmp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = tmp;
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		double[] m = new double[40];
		double[] f = new double[40];
		double r;
		int n;
		int i;
		int ml = 0;
		int fl = 0;
		String type = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				type = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r = Double.parseDouble(tempVar2);
			}
			if (type.charAt(0) == 'm')
			{
				m[ml++] = r;
			}
			else
			{
				f[fl++] = r;
			}
		}
		mao(m, ml);
		mao1(f, fl);
		for (i = 0;i < ml;i++)
		{
		System.out.printf("%.2lf ",m[i]);
		}
		System.out.printf("%.2lf",f[0]);
		for (i = 1;i < fl;i++)
		{
		System.out.printf(" %.2lf",f[i]);
		}
		System.out.print("\n");

		return 0;
	}


}

