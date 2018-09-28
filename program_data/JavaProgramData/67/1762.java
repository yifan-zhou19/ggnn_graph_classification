package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][2];
		int i;
		int j;
		double[] y = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (i = 0;i < n;i++)
		{


					y[i] = 1.0 * a[i][1] / a[i][0];


		}
		for (i = 1;i < n;i++)
		{

				if (y[i] - y[0] > 0.05)
				{
					System.out.print("better\n");
				}
				else if (y[0] - y[i] > 0.05)
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

