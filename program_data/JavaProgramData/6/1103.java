package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[] result = new int[100];

		for (int i = 0;i < n;i++)
		{

			int x = 0;
			int y = 0;

			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			int[][] r = new int[100][100];

			for (int j = 0;j < x;j++)
			{
				for (int k = 0;k < y;k++)
				{
					r[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			result[i] = 0;

			for (int j = 0;j < x;j++)
			{
				if (j == 0 || j == x - 1)
				{

					for (int k = 0;k < y;k++)
					{
						result[i] += r[j][k];
					}

				}
				else
				{
				result[i] += r[j][0];
				result[i] += r[j][y - 1];
				}
			}

		}

		for (int i = 0;i < n;i++)
		{
			System.out.print(result[i]);
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}

		return 0;



	}
}

