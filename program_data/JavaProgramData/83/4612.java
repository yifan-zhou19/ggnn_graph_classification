package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[100];
		int[] y = new int[100];
		int i;
		int n;
		int a = 0;
		double g = 0;
		double G;
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
				(x[i]) = Integer.parseInt(tempVar2);
			}
			a += x[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(y[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (y[i] >= 90 && y[i] <= 100)
			{
				g += 4.0 * x[i];
			}
			else if (y[i] >= 85 && y[i] <= 89)
			{
				g += 3.7 * x[i];
			}
			else if (y[i] >= 82 && y[i] <= 84)
			{
				g += 3.3 * x[i];
			}
			else if (y[i] >= 78 && y[i] <= 81)
			{
				g += 3.0 * x[i];
			}
			else if (y[i] >= 75 && y[i] <= 77)
			{
				g += 2.7 * x[i];
			}
			else if (y[i] >= 72)
			{
				g += 2.3 * x[i];
			}
			else if (y[i] >= 68)
			{
				g += 2.0 * x[i];
			}
			else if (y[i] >= 64)
			{
				g += 1.5 * x[i];
			}
			else if (y[i] >= 60)
			{
				g += 1.0 * x[i];
			}
		}
		G = g / a;
		System.out.printf("%.2f",G);


		return 0;
	}
}

