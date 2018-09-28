package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][2];
		int n;
		int i;
		int j;
		double[] c = new double[100];
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
		for (i = 1;i < n;i++)
		{
			c[i] = 100 * ((1.0 * a[0][1] / a[0][0]) - (1.0 * a[i][1] / a[i][0]));
			if (c[i] > 5)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (c[i] < (-5))
			{
				System.out.print("better");
					System.out.print("\n");
			}
			else
			{
				System.out.print("same");
					System.out.print("\n");
			}
		}
		return 0;
	}

}

