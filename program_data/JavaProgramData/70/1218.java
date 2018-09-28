package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float[] x = new float[1000];
		float[] y = new float[1000];
		float max;
		float b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		max = (x[0] - x[1]) * (x[0] - x[1]) + (y[0] - y[1]) * (y[0] - y[1]);
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				b = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				if (b > max)
				{
					max = b;
				}
			}
		}
		max = Math.sqrt(max);
		System.out.printf("%.4f\n", max);
		return 0;
	}
}

