package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	int[][] a = new int[100][2];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j <= 2;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i][j] = Integer.parseInt(tempVar2);
		}
		}
	}
	double x = 1.0 * a[1][2] / a[1][1];
	for (i = 2;i <= n;i++)
	{
		double cz = 1.0 * a[i][2] / a[i][1] - x;
		 if (cz > 0.05)
		 {
			 System.out.print("better\n");
		 }
		 else if (cz < -0.05)
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

