package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] y = new char[2][1000];
		int[][] x = new int[2][1000];
		int i;
		int j;
		int k;
		int[] count = new int[1000];
		int max = 0;

		for (k = 0; k < 2; k++)
		{
			i = 0;
			x[k][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while ((y[k][i] = System.in.read()) == ',')
			{
				i++;
				x[k][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (k = 0; k < 1000; k++)
		{
			for (j = 0; j < i + 1; j++)
			{
				if (k >= x[0][j] != 0 && k < x[1][j])
				{
					count[k]++;
				}
			}

			if (count[k] > max)
			{
				max = count[k];
			}
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}
}

