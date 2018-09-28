package <missing>;

public class GlobalMembers
{
	/*
	 * dancidao.cpp
	 *
	 *  Created on: 2013-11-15
	 *      Author: ???
	 */
	public static int Main()
	{
		int i;
		int j;
		int n;
		int q = 0;
		int[] l = new int[100];
		char[][] a = new char[100][50];
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 50;j++)
			{
				a[i][j] = System.in.read();
				if (a[i][j] == ' ')
				{
					l[i] = j;
					break;
				}
				else
				{
					if (a[i][j] == '\n')
					{
						l[i] = j;
						q = 1;
						break;
					}
				}
			}
			if (q != 0)
			{
				break;
			}
		}
		n = i + 1;
		for (i = n - 1;i >= 0;i--)
		{
			if (i == 0)
			{
				  for (j = 0;j < l[i];j++)
				  {
					System.out.print(a[i][j]);
				  }
			}
			else
			{
				for (j = 0;j < l[i];j++)
				{
					System.out.print(a[i][j]);
				}
				System.out.print(' ');
			}
		}
		   return 0;
	}

}
