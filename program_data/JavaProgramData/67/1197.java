package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] a = new float[n];
		float[] b = new float[n];
		float[] x = new float[n];
		float s;
		a[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		x[0] = b[0] / a[0];
		for (int i = 1;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			x[i] = b[i] / a[i];
			s = x[i] - x[0];
			if (s > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (s < -0.05F)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

