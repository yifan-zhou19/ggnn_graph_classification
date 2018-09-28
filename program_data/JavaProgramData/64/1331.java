package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k = 0;
		int m;
		float p = 0F;
		float[] a = {0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		float[][] s =
		{
			{0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F}
		};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{ //????
			for (j = i + 1; j < n; j++)
			{
				a[k++] = s[i][j] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]);
			}
		}
		for (i = 0; i < k - 1; i++)
		{ //??
			for (j = 0; j < k - 1 - i; j++)
			{
				if (a[j] < a[j + 1])
				{
					p = a[j];
					a[j] = a[j + 1];
					a[j + 1] = p;
				}
			}
		}
		for (j = 0; j < n; j++)
		{
			for (i = 0; i < n; i++)
			{
				if (a[0] == s[i][j])
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", x[i], y[i], z[i], x[j], y[j], z[j], Math.sqrt(a[0]));
				}
			}
		}
		for (m = 1; m < k; m++)
		{
			for (j = 0; j < n; j++)
			{
				for (i = 0; i < n; i++)
				{
					if (a[m] == s[i][j] && a[m] != a[m - 1])
					{
						System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", x[i], y[i], z[i], x[j], y[j], z[j], Math.sqrt(a[m]));
					}
				}
			}
		}
		return 0;
	}
}

