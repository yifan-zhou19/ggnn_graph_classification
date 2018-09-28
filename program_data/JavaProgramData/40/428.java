package <missing>;

public class GlobalMembers
{
	public static double space(double l1,double l2,double l3,double l4,double a)
	{
		double l0;
		double pi = 3.1415926;
		l0 = (l1 + l2 + l3 + l4) / 2;
		return (Math.sqrt((l0 - l1) * (l0 - l2) * (l0 - l3) * (l0 - l4) - l1 * l2 * l3 * l4 * Math.cos(a * pi / 360) * Math.cos(a * pi / 360)));
	}

	public static int Main()
	{
		double l1;
		double l2;
		double l3;
		double l4;
		double a;
		double l0;
		double pi = 3.1415926;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			l2 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			l3 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			l4 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead("\n");
		if (tempVar5 != null)
		{
			a = Double.parseDouble(tempVar5);
		}
		l0 = (l1 + l2 + l3 + l4) / 2;
		if ((l0 - l1) * (l0 - l2) * (l0 - l3) * (l0 - l4) - l1 * l2 * l3 * l4 * Math.cos(a * pi / 360) * Math.cos(a * pi / 360) > 0.getValue() != 0)
		{
			System.out.printf("%.4lf\n",space(l1, l2, l3, l4, a));
		}
		else
		{
			System.out.print("Invalid input\n");
		}
		return 0;
	}
}

