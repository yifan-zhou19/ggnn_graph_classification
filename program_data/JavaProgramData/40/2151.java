package <missing>;

public class GlobalMembers
{
	public static double[] a = new double[4];
	public static double S;
	public static double j;
	public static double k = 0;
	public static int i;
	public static final double Pi = 3.1415926;
	public static int Main()
	{
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
			k = k + a[i] / 2;
			System.out.print("\n");
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Double.parseDouble(tempVar2);
		}
		S = ((k - a[0]) * (k - a[1]) * (k - a[2]) * (k - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(j / 360 * Pi) * Math.cos(j / 360 * Pi));
		if (S >= 0)
		{
			System.out.printf("%.4f",Math.sqrt(S));
		}
		else
		{
			System.out.print("Invalid input");
		}
	return 0;
	}


}

