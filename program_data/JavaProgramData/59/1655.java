package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] room1 = new char[100][100];
		char[][] room2 = new char[100][100];

		for (int i = 1;i <= n;i++)
		{
				for (int j = 1;j <= n;j++)
				{
					room1[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
					room2[i][j] = room1[i][j];
				}
		}
		int m = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


	 for (int k = 1;k < m;k++)
	 {
			for (int i = 1;i <= n;i++)
			{
			  for (int j = 1;j <= n;j++)
			  {
				if (room1[i][j] == '@')
				{
					if (room1[i - 1][j] == '.')
					{
						room2[i - 1][j] = '@';
					}
					if (room1[i + 1][j] == '.')
					{
						room2[i + 1][j] = '@';
					}
					if (room1[i][j - 1] == '.')
					{
						room2[i][j - 1] = '@';
					}
					if (room1[i][j + 1] == '.')
					{
						room2[i][j + 1] = '@';
					}
				}
			  }
			}


			  for (int a = 1;a <= n;a++)
			  {
				 for (int b = 1;b <= n;b++)
				 {
					 room1[a][b] = room2[a][b];
				 }
			  }

	 }

			 int number = 0;
			 for (int a = 1;a <= n;a++)
			 {
				 for (int b = 1;b <= n;b++)
				 {
					 if (room1[a][b] == '@')
					 {
						 number++;
					 }
				 }
			 }

			 System.out.print(number);
			 System.out.print("\n");

			 return 0;



	}

}

