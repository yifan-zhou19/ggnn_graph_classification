package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;
		int[][] str1 = new int[100][100];
		int[][] str2 = new int[100][100];
		int[][] str3 = new int[100][100];

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				str1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				str2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		str3[0][0] = 0;
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				for (k = 0; k < y1; k++)
				{
				 str3[i][j] = str1[i][k] * str2[k][j] + str3[i][j];
				}
			}
		}
		i = 0;
		j = 0;
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				if (j == y2 - 1)
				{
					System.out.print(str3[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(str3[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}




}

