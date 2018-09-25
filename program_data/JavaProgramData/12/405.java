package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012761_xiaoceyan9.cpp
	 *??2?15????????????????????????????????????????????
	
	????1 4 3 2 9 7 18 22???????3???2?1????4?2????18?9????
	 *  Created on: 2010-11-16
	 *      Author: 378073652
	 */


	public static int Main()
	{
		int[][] a = new int[20][20];
		int i;
		int j;
		int[] b = new int[20];
		int s;
		int n = 0;
		int k;
		for (i = 0;i < 20;i++)
		{
			for (j = 0;j < 16;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][0] == -1)
				{
					break;
				}
				if (a[i][j] == 0)
				{
					b[i] = j;
					break;
				}

			}

			if (a[i][0] == -1)
			{
				break;
			}
		}
		s = i;
		for (i = 0;i < s;i++)
		{
			for (j = 0;j < b[i];j++)
			{
				for (k = j + 1;k < b[i];k++)
				{
					if (((a[i][j] % a[i][k] == 0) && (a[i][j] / a[i][k] == 2)) || ((a[i][k] % a[i][j] == 0) && (a[i][k] / a[i][j] == 2)))
					{
						n = n + 1;
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
			n = 0;
		}

		return 0;
	}

}

