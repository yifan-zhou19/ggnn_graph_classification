package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 50;
	public static int n;
	public static double[] a = new double[MAXN];
	public static double[] b = new double[MAXN];
	public static int nummale;
	public static int numfemale;
	public static int Main()
	{
		nummale = 0;
		numfemale = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String sex = new String(new char[10]);
		double h;
		for (int i = 0; i < n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex, "male") == 0)
			{
							a[nummale++] = h;
			}
			else
			{
				   b[numfemale++] = h;
			}
		}
			sort(a, a + nummale);
			sort(b, b + numfemale);
			for (int i = 0; i < nummale; ++i)
			{
				System.out.printf("%.2lf ", a[i]);
			}
			for (int i = numfemale - 1; i > 0; --i)
			{
				System.out.printf("%.2lf ", b[i]);
			}
			if (numfemale > 0)
			{
			   System.out.printf("%.2lf\n", b[0]);
			}

		return 0;
	}

}

