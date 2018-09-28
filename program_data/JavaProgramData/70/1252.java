package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] f = new double[100][2];
		double m = 0;
		for (int i = 1;i <= N;i++)
		{
			f[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			f[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			for (int j = 1;j < i;j++)
			{
				m = Math.max(m,Math.sqrt((f[j][0] - f[i][0]) * (f[j][0] - f[i][0]) + (f[j][1] - f[i][1]) * (f[j][1] - f[i][1])));
			}
		}
		System.out.printf("%.4f", m);
		System.out.printf("%.4f", "\n");
		return 0;
	}
}

