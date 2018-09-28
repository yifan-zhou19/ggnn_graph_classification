package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] x = new float[n];
		float[] y = new float[n];
		float dis = 0F;
		for (int i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				float b = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
				float a = Math.sqrt(1.0 * b);
				 if (a >= dis)
				 {
					 dis = a;
				 }
			}
		}
		System.out.print(dis);
		System.out.print("\n");
		return 0;
	}
}

