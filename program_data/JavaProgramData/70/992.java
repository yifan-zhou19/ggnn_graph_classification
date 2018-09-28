package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float[][] num = new float[100][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		num[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		num[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		double max = 0.0;
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				double l = 0.0;
				l += Math.pow((num[i][0] - num[j][0]),2);
				l += Math.pow((num[i][1] - num[j][1]),2);
				l = Math.sqrt(l);
				if (l > max)
				{
					max = l;
				}
			}
		}
		System.out.printf("%.4f", max);
		return 0;
	}
}

