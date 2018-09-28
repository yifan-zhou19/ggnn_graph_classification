package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][2];
		double[] b = new double[100];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 2;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j][i] = Integer.parseInt(tempVar2);
				}
			}
		}
	b[0] = 100.0 * a[0][1] / a[0][0];
		for (j = 1;j < n;j++)
		{


				b[j] = 100.0 * a[j][1] / a[j][0];
				if (b[j] - b[0] > 5)
				{
					System.out.print("better\n");
				}
				else if (b[j] - b[0] < -5)
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

