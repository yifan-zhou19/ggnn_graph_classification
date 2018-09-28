package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[][] a = new double[50][2];
		double b;
		double dis;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a[0][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < n;i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < i;j++)
			{
				b = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				if (b > dis)
				{
					dis = b;
				}

			}
		}
		System.out.printf("%.4f\n", dis);
			return 0;
	}


}

