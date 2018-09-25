package <missing>;

public class GlobalMembers
{
	public static String sex = new String(new char[10]);
	public static double[] f = new double[40];
	public static double[] m = new double[40];
	public static int fsize;
	public static int msize;
	public static int desend(Object a, Object b)
	{
		if ((double)a > (double)b)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	public static int asend(Object a, Object b)
	{
		if ((double)a > (double)b)
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
		int p;
		int i;
		int j;
		int k;
		double h;
		while (scanf("%d", p) != EOF)
		{
			fsize = msize = 0;
			for (i = 0;i < p;i++)
			{
				sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
				h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				if (strcmp(sex,"male") == 0)
				{
					m[msize] = h;
					msize++;
				}
				else
				{
					f[fsize] = h;
					fsize++;
				}
			}
			qsort(f,fsize,(Double.SIZE / Byte.SIZE),desend);
			qsort(m,msize,(Double.SIZE / Byte.SIZE),asend);
			for (i = 0;i < msize;i++)
			{
				System.out.printf("%.2lf ",m[i]);
			}
			for (i = 0;i < fsize-1;i++)
			{
				System.out.printf("%.2lf ",f[i]);
			}
			System.out.printf("%.2lf\n",f[fsize-1]);
		}
		return 0;
	}
}

