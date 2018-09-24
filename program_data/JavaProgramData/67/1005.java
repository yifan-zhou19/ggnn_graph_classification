package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		double[] z = new double[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			z[i] = (double)b / (double)a;
		}
		for (i = 1;i < n;i++)
		{
			if (z[i] - z[0] > 0.05)
			{
				System.out.print("better");
				if (i != n - 1)
				{
					System.out.print("\n");
				}
			}
			if (z[0] - z[i] > 0.05)
			{
				System.out.print("worse");
		if (i != n - 1)
		{
					System.out.print("\n");
		}
			}
			if (z[i] - z[0] < 0.05 && z[0] - z[i] < 0.05)
			{
				System.out.print("same");
		if (i != n - 1)
		{
					System.out.print("\n");
		}
			}
		}
		return 0;
	}
}

