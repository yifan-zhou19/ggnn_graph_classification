package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int num = 0;
		int i;
		double G = 0;
		double[] c = new double[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			if (b[i] >= 90 && b[i] <= 100)
			{
				c[i] = 4.0;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3.0;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2.0;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1.0;
			}
			else
			{
				c[i] = 0;
			}
			num += a[i];
			G += a[i] * c[i];
		}
		G = G / num;
		System.out.printf("%.2f", G);
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

