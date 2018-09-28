package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][3];
		int i;
		int j;
		float b;
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
		b = 100.0 * (float)a[0][1] / (float)a[0][0];
		for (i = 1;i < n;i++)
		{
		if ((100.0 * (float)a[i][1] / (float)a[i][0] - b) > 5)
		{
		System.out.print("better\n");
		}
		if ((100.0 * (float)a[i][1] / (float)a[i][0] - b) <= 5 && (b - 100.0 * (float)a[i][1] / (float)a[i][0]) <= 5)
		{
		System.out.print("same\n");
		}
		if ((100.0 * (float)a[i][1] / (float)a[i][0] - b) < -5)
		{
		System.out.print("worse\n");
		}
		}
		return 0;
	}




}

