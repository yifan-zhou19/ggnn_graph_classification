package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		double[] z = new double[100];
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (x = 0;x < n;x++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[x] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[x] = Double.parseDouble(tempVar3);
			}
		}
		for (x = 1;x < n;x++)
		{
			if (y[x] / z[x] > (y[0] / z[0] + 0.05))
			{
				System.out.print("better");
			}
			else if (y[x] / z[x] < (y[0] / z[0] - 0.05))
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
			System.out.print("\n");
		}

		return 0;
	}
}

