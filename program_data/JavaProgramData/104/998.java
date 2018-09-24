package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;x[i] != 1;i++)
		{
			if (x[i] % 2 == 1)
			{
				x[i + 1] = (x[i] - 1) / 2;
			}
			else
			{
				x[i + 1] = x[i] / 2;
			}
		}
		for (int i = 0;y[i] != 1;i++)
		{
			if (y[i] % 2 == 1)
			{
				y[i + 1] = (y[i] - 1) / 2;
			}
			else
			{
				y[i + 1] = y[i] / 2;
			}
		}
		for (int i = 0;i < 1000;i++)
		{
			for (int j = 0;j < 1000;j++)
			{
				if (x[i] == y[j])
				{
					System.out.print(x[i]);
					System.out.print("\n");
					j = 1000;
					i = 1000;
				}
			}
		}
		return 0;
	}
}

