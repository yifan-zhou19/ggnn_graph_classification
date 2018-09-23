package <missing>;

public class GlobalMembers
{
	/*
	 * 09.cpp
	 *
	 *  Created on: 2011-12-31
	 *      Author: 2011
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][][] a = new int[n][n][n];
		int[] sum = new int[n];
		int[][] p = a;
		int[] s = sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					*(*(*(p + i) + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (l = 0;l < n - 1;l++)
			{
				for (j = 0;j < n;j++)
				{
					min = (*(*(p + i) + j));
					for (k = l + 1;k < n;k++)
					{
						if (min > *(*(*(p + i) + j) + k))
						{
							min = (*(*(p + i) + j) + k);
						}
					}
					for (k = 0;k < n;k++)
					{
						*(*(*(p + i) + j) + k) = *(*(*(p + i) + j) + k) - min;
					}
				}
				for (k = 0;k < n;k++)
				{
								min = (*(*(p + i)) + k);
								for (j = l + 1;j < n;j++)
								{
									if (min > *(*(*(p + i) + j) + k))
									{
										min = (*(*(p + i) + j) + k);
									}
								}
								for (j = 0;j < n;j++)
								{
									*(*(*(p + i) + j) + k) = *(*(*(p + i) + j) + k) - min;
								}
				}
				s[i] = (s + i) + *(*(*(p + i) + l + 1) + l + 1);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print((s + i));
			System.out.print("\n");
		}
		return 0;
	}

}

