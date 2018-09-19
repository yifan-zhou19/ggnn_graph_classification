package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		float s;
		float[] b = new float[350];
		float p;
		float[] a = new float[350];
		float[] c = new float[350];
		s = 0F;
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			s = s + a[i];
		}
		s = s / n;
		for (i = 0;i < n;i++)
		{
			b[i] = a[i] - s;
			b[i] = Math.abs(b[i]);
		}
		p = b[0];
		for (i = 0;i < n;i++)
		{
			if (p < b[i])
			{
				p = b[i];
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (p == b[i])
			{
				c[j] = a[i];
				j = j + 1;

			}
		}
		for (i = 0;i < j;i++)
		{
			for (m = 0;m < j - i - 1;m++)
			{
				if (c[m] > c[m + 1])
				{
					p = c[m];
					c[m] = c[m + 1];
					c[m + 1] = p;
				}
			}
		}
		System.out.print(c[0]);
		for (i = 1;i < j;i++)
		{
			System.out.print(",");
			System.out.print(c[i]);
		}
		return 0;
	}
}

