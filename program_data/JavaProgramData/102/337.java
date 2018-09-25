package <missing>;

public class GlobalMembers
{
	public static int cmpf(void a, void b)
	{
		double m;
		m = (double)b - (double)a;
		if (m > 0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static int cmpm(void a, void b)
	{
		double m;
		m = (double)a - (double)b;
		if (m > 0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		double[] f = new double[40];
		double[] m = new double[40];
		int fp = 0;
		int mp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String s = new String(new char[7]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (s.charAt(0) == 'f')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[fp++] = Double.parseDouble(tempVar3);
				}
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					m[mp++] = Double.parseDouble(tempVar4);
				}
			}
		}
		qsort(f,fp,(Double.SIZE / Byte.SIZE),cmpf);
		qsort(m,mp,(Double.SIZE / Byte.SIZE),cmpm);

		for (i = 0;i < mp;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}

		for (i = 0;i < fp;i++)
		{
			System.out.printf("%.2lf",f[i]);
			if (i != fp - 1)
			{
				System.out.print(" ");
			}
		}
	}

}

