package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float r;
		float m;
		float[] a = new float[100];
		float[] b = new float[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
		a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		r = b[0] / a[0];
		for (i = 1;i <= n - 1;i++)
		{
			m = b[i] / a[i];
			if (m - r > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (m - r < -0.05F)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if ((m - r <= 0.05F) && (m - r >= -0.05F))
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
	return 0;
	}

}

