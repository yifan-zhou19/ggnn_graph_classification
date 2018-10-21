package <missing>;

public class GlobalMembers
{
	public static int[][] shan = new int[max][max];
	public static int Main()
	{
		int h;
		int l;
		h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= h;i++)
		{
			for (int j = 1;j <= l;j++)
			{
				shan[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1;i <= h;i++)
		{
			for (int j = 1;j <= l;j++)
			{
				if (shan[i][j] >= shan[i - 1][j] != 0 && shan[i][j] >= shan[i + 1][j] != 0 && shan[i][j] >= shan[i][j - 1] != 0 && shan[i][j] >= shan[i][j + 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}



	}
}

