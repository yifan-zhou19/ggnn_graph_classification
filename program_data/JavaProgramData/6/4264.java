package <missing>;

public class GlobalMembers
{
	public static int[][] imat = new int[100][100];

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		for (int i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0; j < a; j++)
			{
				for (int k = 0; k < b; k++)
				{
					imat[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			int[] p = &(imat[0]);

			int counter = 0;

			for (int i = 0; i < a; i++)
			{
				for (int j = 0; j < b; j++)
				{
					if (j % b == 0 || j % b == (b - 1) || i == 0 || i == (a - 1))
					{
						counter = counter + *(p[i] + j);
					}
				}
			}
			//counter = counter - *(*(p)) - *(*(p+a-1)) - *(*(p+a-1)+b-1) - *(*(p)+b-1);
			System.out.print(counter);
			System.out.print("\n");
		}
		return 0;
	}

}

