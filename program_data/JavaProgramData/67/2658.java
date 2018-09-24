package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double limit = 0.05;
	public static int n;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Double.parseDouble(tempVar3);
		}
		double t = b / a;
	//	int temp = t * 100;
		//printf("%d\n",temp);
		for (int i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d = Double.parseDouble(tempVar5);
			}
			double t1 = d / c;
		//	printf("%d\n",t1);
		//	printf("%d\n",abs(t1 - temp));
			if (t1 - t > limit)
			{
				System.out.print("better\n");
			}
			else if (t - t1 > limit)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

