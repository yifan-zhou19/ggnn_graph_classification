package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float m;
		float c;
		float d;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] h = new float[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		d = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			h[i] = b[i] / a[i];
		}
		m = d / c;
		for (i = 2;i <= n;i++)
		{
			if (h[i] - m > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (m - h[i] > 0.05F)
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

