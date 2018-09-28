package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float x;
		float y;
		float z;
		float[] a = new float[n - 1];
		float[] b = new float[n - 1];
		float[] c = new float[n - 1];
		x = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		y = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		z = y / x;
		for (int i = 1;i <= n - 1;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c[i] = b[i] / a[i];
			if (c[i] > (z + 0.05))
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (c[i] < (z - 0.05))
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

