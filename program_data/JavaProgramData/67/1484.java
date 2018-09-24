package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		float[] a = new float[n];
		float[] b = new float[n];
		float q;
		float p;
		for (i = 0;i <= N - 1;i = i + 1)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		q = (b[0] / a[0]);
		for (i = 1;i <= N - 1;i = i + 1)
		{
			p = (b[i] / a[i]);
			if (p - q > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (q - p > 0.05F)
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

