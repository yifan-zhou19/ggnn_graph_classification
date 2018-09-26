package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] == 1 || a[i] > 1) && (a[i] == 18 || a[i] < 18))
			{
				b++;
			}
			if ((a[i] == 19 || a[i] > 19) && (a[i] == 35 || a[i] < 35))
			{
				c++;
			}
			if ((a[i] == 36 || a[i] > 36) && (a[i] == 60 || a[i] < 60))
			{
				d++;
			}
			if (a[i] == 61 || a[i] > 61)
			{
				e++;
			}
		}
		double m = b / n * 100;
		double u = c / n * 100;
		double o = d / n * 100;
		double p = e / n * 100;
		System.out.print("1-18: ");
		System.out.printf("%.2lf",m);
		System.out.print("%\n");
		System.out.print("19-35: ");
		System.out.printf("%.2lf",u);
		System.out.print("%\n");
		System.out.print("36-60: ");
		System.out.printf("%.2lf",o);
		System.out.print("%\n");
		System.out.print("60??: ");
		System.out.printf("%.2lf",p);
		System.out.print("%\n");
	}
}

