package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[][] s = new int[10000][2];
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i][k] = Integer.parseInt(tempVar2);
		}
			}
		}
		b = 1.0 * s[0][1] / s[0][0];
		for (i = 1;i < n;i++)
		{
			if (1.0 * s[i][1] / s[i][0] > b + 0.05)
			{
				System.out.print("better\n");
			}
			else if (1.0 * s[i][1] / s[i][0] < b - 0.05)
			{
				System.out.print("worse\n");
			}
			else if (1.0 * s[i][1] / s[i][0] >= b - 0.05 && 1.0 * s[i][1] / s[i][0] <= b + 0.05)
			{
				System.out.print("same\n");
			}
		}

			return 0;

	}

}

