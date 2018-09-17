package <missing>;

public class GlobalMembers
{
	public static double[] male = new double[41];
	public static double[] female = new double[41];
	public static int cmp_male(Object a, Object b)
	{

		return *(double)a - (int)b;
	}
	public static int cmp_female(Object a, Object b)
	{
		return *(double)b - (double)a;
	}

	public static int Main()
	{
		int n;
		int i;
		int mi = 0;
		int fi = 0;
		double h;
		String tmp = new String(new char[10]);

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
				tmp = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (tmp.charAt(0) == 'm')
			{
				male[mi] = h;
				mi++;
			}
			else
			{
				female[fi] = h;
				fi++;
			}
		}
		sort(male,male + mi);
		sort(female,female + fi);
		for (i = 0;i < mi;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = fi - 1;i >= 0;i--)
		{
			if (i == 0)
			{
				System.out.printf("%.2lf",female[i]);
			}
			else
			{
				System.out.printf("%.2lf ",female[i]);
			}
		}

		System.out.print("\n");
		return 0;
	}
}

