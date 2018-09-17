package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i;
		int j;
		int k;
		int p;
		int m;
		x[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 2;
		j = 2;
		while (x[i - 1] != 1)
		{
			x[i] = x[i - 1] / 2;
			i++;
		}
		while (y[j - 1] != 1)
		{
			y[j] = y[j - 1] / 2;
			j++;
		}
		m = 0;
		for (k = 1;k <= i - 1;k++)
		{
			if (m == 0)
			{
			for (p = 1;p <= j - 1;p++)
			{
				if (y[p] == x[k])
				{
					System.out.print(x[k]);
					m = 1;
					break;
				}
			}
			}
			else
			{
				break;
			}
		}
		return 0;
	}


}

