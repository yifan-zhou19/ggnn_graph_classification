package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int d = 0;
		int n;
		int e;
		double b;
		double c;
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		s[0] = c / b;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				c = Double.parseDouble(tempVar5);
			}
			s[i] = c / b;
		}
		for (i = 1;i < n;i++)
		{
			if (s[i] - s[0] >= 0.05)
			{
				System.out.print("better\n");
			}
			if (s[i] - s[0] <= -0.05)
			{
				System.out.print("worse\n");
			}
			if (s[i] - s[0] < 0.05 && s[i] - s[0]>-0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

