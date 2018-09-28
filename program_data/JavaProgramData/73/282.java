package <missing>;

public class GlobalMembers
{
	/*
	 * wanyi.cpp
	 *
	 *  Created on: 2012-10-31
	 *      Author: 7
	 */
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int[] max = new int[6];
		int[] row = new int[6];
		int[] line = new int[6];
		int sig = 0;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(max,0,(Integer.SIZE / Byte.SIZE));
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < 6;i++)
		{
			for (j = 1;j < 6;j++)
			{
				if (max[i] < a[i][j])
				{
					max[i] = a[i][j];
					row[i] = i;
					line[i] = j;
				}
			}
		}
		for (i = 1;i < 6;i++)
		{
			for (k = 1;k < 6;k++)
			{
				l = line[i];
						if (max[i] > a[k][l])
						{
							break;
						}
						else if (k == 5)
						{
							sig = 1;
							System.out.print(row[i]);
							System.out.print(" ");
							System.out.print(line[i]);
							System.out.print(" ");
							System.out.print(max[i]);
						}
			}
		}
		if (sig == 0)
		{
		System.out.print("not found");
		}
	}

}

