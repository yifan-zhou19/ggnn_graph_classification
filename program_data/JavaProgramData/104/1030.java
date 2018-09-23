package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[11];
		int[] y = new int[11];
		int[] xi = new int[11];
		int[] yi = new int[11];
		int i;
		int j;
		int k;
		for (i = 0;i <= 11;i++)
		{
			x[0] = a;
			if (x[i] == 1)
			{
				break;
			}
			else
			{
				x[i + 1] = x[i] / 2;
			}
		}
		for (j = 0;j <= i;j++)
		{
			xi[j] = x[i - j];
		}
		for (i = 0;i <= 11;i++)
		{
			y[0] = b;
			if (y[i] == 1)
			{
				break;
			}
			else
			{
				y[i + 1] = y[i] / 2;
			}
		}
		for (j = 0;j <= i;j++)
		{
			yi[j] = y[i - j];
		}
		for (k = 0;k <= i;k++)
		{
			if (xi[k] - yi[k] != 0)
			{
				break;
			}
		}
		System.out.print(xi[k - 1]);
		return 0;
	}

}

