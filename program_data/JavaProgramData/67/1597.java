package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][2];
		int i;
		int j;
		  double x;
		  double y;
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
		x = 1.0 * a[0][1] / a[0][0];
		for (i = 1;i < n;i++)
		{
				y = 1.0 * a[i][1] / a[i][0];
				 if (y - x > 0.05)
				 {
					 System.out.print("better\n");
				 }
				else if (x - y > 0.05)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
				y = 0;
		}
		return 0;
	}

}

