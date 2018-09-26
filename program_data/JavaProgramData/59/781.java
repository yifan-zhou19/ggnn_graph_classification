package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : Test1.cpp
	// Author      : ???? 
	// Version     :
	// Copyright   : Copyright Aircy
	// Description : Tomorrow never knows? 
	//============================================================================

	///#include <iomanip>


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
			//????????
		char[][] room = new char[n + 2][n + 2];
		char[][] roomOld = new char[n + 2][n + 2];
		int i;
		int j;
		for (i = 1; i <= n;i++)
		{
			for (j = 1; j <= n + 1; j++)
			{
				   char c;
				   c = System.in.read();
				   if (c != '\n')
				   {
						   room[i][j] = c;

				   }

			}
			 System.out.print("\n");
		}
		//roomold?????? 
			for (i = 1;i <= n; i++)
			{
			   for (j = 1; j <= n; j++)
			   {
					 roomOld[i][j] = room[i][j];
			   }
			}
		int days;
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k; //?????
		for (k = 1; k < days; k++)
		{
			for (i = 1;i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{

						if ((roomOld[i][j] != '@'))
						{
								 continue;
						}

							if (room[i + 1][j] == '.')
							{
								room[i + 1][j] = '@';
							}
							if (room[i - 1][j] == '.')
							{
								room[i - 1][j] = '@';
							}

							if (room[i][j + 1] == '.')
							{
								room[i][j + 1] = '@';
							}

							if (room[i][j - 1] == '.')
							{
								room[i][j - 1] = '@';
							}
				}
			}
			//??roomOld 
		   for (i = 1;i <= n; i++)
		   {
			   for (j = 1; j <= n; j++)
			   {
					 roomOld[i][j] = room[i][j];
			   }
		   }
		}
		int num = 0;
		for (i = 1;i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (room [i][j] == '@')
				{
					num++;
				}
			}
		}
		System.out.print(num);
		//cin >> num;

	}

}

