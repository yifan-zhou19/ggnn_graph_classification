package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		double[][] a = new double[100][2];
		double max = 0.0;
		double dis;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //????
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1])); //????
				if (dis > max)
				{
					max = dis;
				}
			}
		}
		System.out.printf("%.4f", max);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

