package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		double u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18)
			{
				a++;
			}
			else if (sz[i] >= 19 && sz[i] <= 35)
			{
				b++;
			}
			else if (sz[i] >= 36 && sz[i] <= 60)
			{
				c++;
			}
			else if (sz[i] >= 61)
			{
				d++;
			}
		}
		x = (double)(a / n * 100);
		y = (double)(b / n * 100);
		z = (double)(c / n * 100);
		u = (double)(d / n * 100);
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%\n",x,y,z,u);
	}
}

