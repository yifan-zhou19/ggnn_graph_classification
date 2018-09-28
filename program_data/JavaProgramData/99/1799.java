package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[100];
		int i;
		double n;
		double x = 0;
		double y = 0;
		double z = 0;
		double m = 0;
		double j;
		double k;
		double l;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
			else if (a[i] <= 35)
			{
				y++;
			}
			else if (a[i] <= 60)
			{
				z++;
			}
			else if (a[i] > 60)
			{
				m++;
			}
		}
		j = (x / n) * 100;
		k = (y / n) * 100;
		l = (z / n) * 100;
		f = (m / n) * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2lf",j);
		System.out.print("%%\n");
		System.out.print("19-35: ");
		System.out.printf("%.2lf",k);
		System.out.print("%%\n");
		System.out.print("36-60: ");
		System.out.printf("%.2lf",l);
		System.out.print("%%\n");
		System.out.print("60??: ");
		System.out.printf("%.2lf",f);
		System.out.print("%%");
	}

}

