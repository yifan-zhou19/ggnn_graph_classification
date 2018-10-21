package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		double[][] num = new double[100][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			num[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double max = 0;
		double dis = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				dis = Math.sqrt((num[i][0] - num[j][0]) * (num[i][0] - num[j][0]) + (num[i][1] - num[j][1]) * (num[i][1] - num[j][1]));
				if (dis > max)
				{
					max = dis;
				}
			}
		}
			System.out.print(max);
			System.out.print("\n");
			return 0;
	}

}

