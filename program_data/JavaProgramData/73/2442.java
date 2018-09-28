package <missing>;

public class GlobalMembers
{
	/*??????
	 *?????w5.cpp
	 *Created on: 2012-11-10
	 *???????
	 */
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k = 0;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = m;
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++) //?????????
			{
					if ((a[i][j] >= a[i][0]) && (a[i][j] >= a[i][1]) && (a[i][j] >= a[i][2]) && (a[i][j] >= a[i][3]) && (a[i][j] >= a[i][4]) && (a[i][j] <= a[1][j]) && (a[i][j] <= a[2][j]) && (a[i][j] <= a[3][j]) && (a[i][j] <= a[4][j]) && (a[i][j] <= a[0][j]))
					{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					break;
					} //????
				else
				{
					k++;
				}
			}
		}
		if (k == 25)
		{
				System.out.print("not found");
				System.out.print("\n");
		}
		return 0; //????


	}


}

