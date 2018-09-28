package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] s = new double[n];
		double[] z = new double[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				z[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			a = z[0] * 1000 / s[0];
			b = z[i] * 1000 / s[i];
			if (b - a > 50)
			{
					System.out.print("better\n");
			}
			else if (a - b > 50)
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

