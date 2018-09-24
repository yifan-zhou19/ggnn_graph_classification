package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int hang;
		int lie;
		hang = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lie = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int t;
		for (t = 0;t <= hang + lie-2;t++)
		{
			for (i = 0;i < hang;i++)
			{
				for (j = 0;j < lie;j++)
				{
					if (i + j == t)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

