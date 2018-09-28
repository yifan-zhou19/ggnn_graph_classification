package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float x;
		float y;
		float[] a = new float[10000];
		float[] b = new float[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		x = b[1] / a[1];
		for (int j = 2;j <= n;j++)
		{
			y = b[j] / a[j];
			if ((x - y) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if ((y - x) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (Math.abs(y - x) <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

