package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float sum1 = 0F;
		float[] c = new float[11];
		int[] a = new int[11];
		int[] b = new int[11];
		int n;
		int sum2 = 0;
		int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	sum2 = sum2 + a[i];

		}
	for (i = 1;i <= n;i++)
	{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (b[i] >= 90)
	{
	  c[i] = 4.0F;
	}
	else
	{
	if (b[i] >= 85)
	{
	  c[i] = 3.7F;
	}
	else
	{
	if (b[i] >= 82)
	{
	  c[i] = 3.3F;
	}
	else
	{
	if (b[i] >= 78)
	{
	  c[i] = 3.0F;
	}
	else
	{
	if (b[i] >= 75)
	{
	  c[i] = 2.7F;
	}
	else
	{
	if (b[i] >= 72)
	{
	  c[i] = 2.3F;
	}
	else
	{
	if (b[i] >= 68)
	{
	  c[i] = 2.0F;
	}
	else
	{
	if (b[i] >= 64)
	{
	  c[i] = 1.5F;
	}
	else
	{
	if (b[i] >= 60)
	{
	  c[i] = 1.0F;
	}
	else
	{
	c[i] = 0F;
	}
	}
	}
	}
	}
	}
	}
	}
	}
	sum1 = sum1 + c[i] * a[i];

	}
		System.out.printf("%.2f", sum1 / sum2);
		System.out.printf("%.2f", "\n");

		return 0;
	}

}

