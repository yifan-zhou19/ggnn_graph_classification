package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x = 0;
		int y = 0;
		int z = 0;
		int p = 0;
		int a;
		double X;
		double Y;
		double Z;
		double P;
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
				a = Integer.parseInt(tempVar2);
			}

			if (a >= 1 && a <= 18)
			{
				x++;
			}
			if (a >= 19 && a <= 35)
			{
				y++;
			}
			if (a >= 36 && a <= 60)
			{
				z++;
			}
			if (a > 60)
			{
				p++;
			}

		}
		X = 1.0 * x / n * 100;
		Y = 1.0 * y / n * 100;
		Z = 1.0 * z / n * 100;
		P = 1.0 * p / n * 100;

		System.out.printf("1-18: %.2lf%%\n",X);
		System.out.printf("19-35: %.2lf%%\n",Y);
		System.out.printf("36-60: %.2lf%%\n",Z);
		System.out.printf("60??: %.2lf%%",P);

		return 0;




	}
}

