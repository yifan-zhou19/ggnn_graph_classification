package <missing>;

public class GlobalMembers
{
	public static double F(int r)
	{
		int j;
		double fz;
		double fm;
		double n1 = 1.0;
		double n2 = 2.0;
		double n3 = 3.0;
		double h = 3.500;
		if (r == 1)
		{
			return 2.000;
		}
		if (r == 2)
		{
			return 3.500;
		}
		for (j = 1;j < r - 1;j++)
		{
			fz = n2 + n3;
			fm = n1 + n2;
			h = h + fz / fm;
			n1 = n2;
			n2 = n3;
			n3 = fz;
		}
		return h;
	}
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int r;
		double result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			r = n[i];
			result = F(r);
			System.out.printf("%.3lf\n",result);
		}
		return 0;
	}

}

