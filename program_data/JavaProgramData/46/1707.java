package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] matrix = new int[100][100];

		/*????*/
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		/*?????*/
		int k;
		System.out.print(matrix[1][1]);
		for (k = 2;k <= col;k++)
		{
			System.out.print("\n");
			System.out.print(matrix[1][k]);
		}

		/*??????*/
		int xlength = col - 1;
		int ylength = row - 1;
		int t;
		char flag = 'd';
		i = 1;
		j = col;
		while (((flag == 'u' || flag == 'd') && (ylength != 0)) || ((flag == 'l' || flag == 'r') && (xlength != 0)))
		{

			switch (flag)
			{
			case 'd':
				for (t = 1;t <= ylength;t++)
				{
					i++;
					System.out.print("\n");
					System.out.print(matrix[i][j]);
				}
				flag = 'l';
				ylength--;
				break;
			case 'l':
				for (t = 1;t <= xlength;t++)
				{
					j--;
					System.out.print("\n");
					System.out.print(matrix[i][j]);
				}
				flag = 'u';
				xlength--;
				break;
			case 'u':
				for (t = 1;t <= ylength;t++)
				{
					i--;
					System.out.print("\n");
					System.out.print(matrix[i][j]);
				}
				flag = 'r';
				ylength--;
				break;
			case 'r':
				for (t = 1;t <= xlength;t++)
				{
					j++;
					System.out.print("\n");
					System.out.print(matrix[i][j]);
				}
				flag = 'd';
				xlength--;
				break;
			}
		}
		return 0;
	}
}

