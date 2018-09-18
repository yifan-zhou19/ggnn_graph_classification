package <missing>;

public class GlobalMembers
{
	/*
	 * ????6.cpp
	 * ????????????
	 *  Created on: 2011-11-6
	 *      Author: LTY
	 */
	public static int Main()
	{
		int n; //????
		int i;
		int j;
		int min;
		int sum = 0;
		int t;
		int m;
		int[][] a = new int[105][105]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n;
		m = n;
		while (t > 0) //??n???
		{
			n = m;
			sum = 0; //???
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (n > 1) //??????
			{
			for (i = 0;i < n;i++) //???
			{
				min = a[i][0];
				for (j = 0;j < n;j++)
				{
					if (min > a[i][j])
					{
						min = a[i][j];
					}
				}
				for (j = 0;j < n;j++)
				{
					a[i][j] = a[i][j] - min;
				}
			}

			for (j = 0;j < n;j++) //???
			{
				min = a[0][j];
				for (i = 0;i < n;i++)
				{
					if (min > a[i][j])
					{
						min = a[i][j];
					}
				}
				for (i = 0;i < n;i++)
				{
					a[i][j] = a[i][j] - min;
				}
			}

			sum = sum + a[1][1]; //??a[1][1]
			for (i = 0;i < n;i++)
			{
				for (j = 1;j < n - 1;j++)
				{
					a[i][j] = a[i][j + 1]; //???
				}
			}
			for (j = 0;j < n;j++)
			{
				for (i = 1;i < n - 1;i++)
				{
					a[i][j] = a[i + 1][j]; //???
				}
			}

			n--;
			}
			System.out.print(sum);
			System.out.print("\n");
			t--;
		}
	}

}

