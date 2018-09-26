package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2012-11-5
	 *      Author: ??
	 */
	public static int Main()
	{
		int[][] a = new int[5][5]; //s???????
		int s = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < 5; i++) //?????
		{
			for (int j = 0; j < 5; j++) //?????
			{
				for (int k = 0; k < 5; k++)
				{
					if (a[i][j] < a[i][k])
					{
						break;
					}
					if (k == 4) //??????????????
					{
						for (int l = 0; l < 5; l++)
						{
							if (a[i][j] > a[l][j])
							{
								break;
							}
							if (l == 4)
							{ //?????????????s??
								System.out.print(i + 1);
								System.out.print(' ');
								System.out.print(j + 1);
								System.out.print(' ');
								System.out.print(a[i][j]);
								s++;
							}
						}
					}
				}
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

