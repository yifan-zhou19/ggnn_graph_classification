package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] num = new double[100][2];
		for (i = 1;i <= n;i++)
		{
			num[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			num[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double Mdis = 0.0;
		double dis;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				dis = Math.sqrt(Math.pow(num[i][0] - num[j][0],2) + Math.pow(num[i][1] - num[j][1],2));
				if (Mdis < dis)
				{
					Mdis = dis;
				}
				else
				{
					continue;
				}
			}
		}
		System.out.print(Mdis);
		System.out.print("\n");
		return 0;
	}
}

