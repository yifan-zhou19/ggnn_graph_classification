package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] s = new int[1000][2];
		double[] y = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
			y[i] = s[i][1] * 1.0 / s[i][0];

		}
		for (int j = 1;j < n;j++)
		{
			if ((y[j] - y[0]) > 0.05)
			{
				System.out.print("better");
			}
			else if ((y[0] - y[j]) > 0.05)
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

