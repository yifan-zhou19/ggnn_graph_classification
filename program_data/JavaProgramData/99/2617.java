package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int m;
		double x = 0;
		double y = 0;
		double z = 0;
		double w = 0;
		double p;
		double q;
		double r;
		double s;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				x++;
			}
			else if (a[i] > 18 && a[i] <= 35)
			{
				y++;
			}
			else if (a[i] > 35 && a[i] <= 60)
			{
				z++;
			}
			else if (a[i] > 60)
			{
				w++;
			}
		}
			p = 100 * x / n;
			q = 100 * y / n;
			r = 100 * z / n;
			s = 100 * w / n;
			System.out.printf("1-18: %.2lf",p);
			System.out.print("%\n");

	System.out.printf("19-35: %.2lf",q);
			System.out.print("%\n");
	System.out.printf("36-60: %.2lf",r);
		System.out.print("%\n");
	System.out.printf("60??: %.2lf",s);
			System.out.print("%\n");


		return 0;
	}
}

