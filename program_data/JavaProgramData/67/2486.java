package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		double[] l = new double[100];
		double a;
		double b;
		double t;
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
		l[0] = b / a;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b = Double.parseDouble(tempVar5);
			}
			l[i] = b / a;
			t = 100 * (l[i] - l[0]);
			if (t < -5)
			{
				System.out.print("worse\n");
			}
			else if (t <= 5)
			{
				System.out.print("same\n");
			}
			else if (t > 5)
			{
				System.out.print("better\n");
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			n = Integer.parseInt(tempVar6);
		}
	}
}

