package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int i;
		int j;
		int k;
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;;++i)
		{
			x[i] = x[i - 1] / 2;
			if (x[i] == 1)
			{
				break;
			}
		}
		for (j = 1;;++j)
		{
			y[j] = y[j - 1] / 2;
			if (y[j] == 1)
			{
				break;
			}
		}
		for (k = 0;;++k)
		{
			if (x[i - k] != y[j - k])
			{
				break;
			}
		}
		System.out.print(x[i - k + 1]);
		return 0;
	}
}

