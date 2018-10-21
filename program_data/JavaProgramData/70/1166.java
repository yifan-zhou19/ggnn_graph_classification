package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[][] point = new double[3000][2];
		double ans = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			point[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			point[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (i == j)
				{
					continue;
				}
				double f;
				f = Math.hypot(point[i][0] - point[j][0],point[i][1] - point[j][1]);
				ans = Math.max(ans,f);
			}
		}
		System.out.printf("%.4f", ans);
		return 0;
	}

}

