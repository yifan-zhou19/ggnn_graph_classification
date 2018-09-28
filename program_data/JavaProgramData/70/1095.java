package <missing>;

public class GlobalMembers
{
	public static double[][] k = new double[1000][2];
	public static double work(int i,int j)
	{
		double result;
		result = Math.sqrt(Math.pow(k[i][0] - k[j][0],2) + Math.pow(k[i][1] - k[j][1],2));
		return result;
	}
	public static int Main()
	{
		double max = 0;
		int m;
		int i = 0;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double s;
		for (i = 0;i < m;i++)
		{
			k[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			k[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				s = work(i, j);
				if (s > max)
				{
					max = s;
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

