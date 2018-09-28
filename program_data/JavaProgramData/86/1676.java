package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int s;
		int m;
		int n;
		int[] a = new int[100];
		int[][] b = new int[100][100];
		int c;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			s = 0;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			else
			{
			for (j = 0;j < a[i];j++)
			{
			  b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (b[i][a[i] - 1] + 3 * (a[i]) >= 63)
			{
					for (j = a[i] - 2;j > 0;j--)
					{
							 if (b[i][j] + (j + 1) * 3 <= 60)
							 {
								  c = 60 - (j + 1) * 3;
									break;
							 }
							 if (b[i][j] + j * 3 <= 60)
							 {
								c = b[i][j];
								break;
							 }
					} //???????60?????????????
			}
			else
			{
				if (b[i][a[i] - 1] + 3 * (a[i]) >= 60)
				{
				c = b[i][a[i] - 1];
				}
				else
				{
					c = 60 - 3 * a[i]; //??????????
				}
			}

			System.out.print(c);
			System.out.print("\n");
			}

		}
		return 0;

	}

}

