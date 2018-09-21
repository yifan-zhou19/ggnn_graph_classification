package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[320];
		int i;
		int m;
		float[] b = new float[320];
		float k;
		float max;
		m = 1;
		k = 0F;
		max = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = (k * i + a[i]) / (i + 1);
		}
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - k);
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(b[i] - max) <= 1e-5)
			{
				if (m == 1)
				{
					System.out.print(a[i]);
					m = 0;
				}
				else
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}

		return 0;
	}
}

