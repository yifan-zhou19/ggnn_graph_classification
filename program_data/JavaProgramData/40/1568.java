package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double pi = 3.1415926;
		double f;
		double s = 0;
		double[] a = new double[4];
		double sum;
		int i;
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f = Double.parseDouble(tempVar2);
		}
		f = pi / 360 * f;
		for (i = 0;i < 4;i++)
		{
			s = s + (a[i]) / 2;
		}
		sum = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(f) * Math.cos(f);
		if (sum < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			sum = Math.sqrt(sum);
			System.out.printf("%.4f",sum);
		}
	}
}

