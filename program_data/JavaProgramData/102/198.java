package <missing>;

public class GlobalMembers
{
	public static int sf(Object a, Object b)
	{
		if (((double)a) > ((double)b))
		{
			return 1;
		}
		if (((double)a) < ((double)b))
		{
			return -1;
		}
		return 0;
	}

	public static int Main()
	{
		int i;
		int n;
		double[] f = new double[40];
		double[] m = new double[40];
		int fn = 0;
		int mn = 0;
		String str = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			if (str.charAt(0) == 'f')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[fn++] = Double.parseDouble(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					m[mn++] = Double.parseDouble(tempVar4);
				}
			}
		}
		qsort(f, fn, (Double.SIZE / Byte.SIZE), sf);
		qsort(m, mn, (Double.SIZE / Byte.SIZE), sf);
		for (i = 0; i < mn; i++)
		{
			System.out.printf("%.2lf ", m[i]);
		}
		for (i = fn - 1; i > 0; i--)
		{
			System.out.printf("%.2lf ", f[i]);
		}
		if (fn > 0)
		{
			System.out.printf("%.2lf", f[0]);
		}
		return 0;
	}
}

