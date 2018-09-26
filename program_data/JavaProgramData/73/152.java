package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1200012837 **
	//*???2012.11.5  **
	//********************************

	public static int Main()
	{
		int[][] a = new int[5][5]; //?????????????????????????
		int[] max = new int[5];
		int[] min = new int[5];
		int i;
		int j;
		int flag = 0;
		for (i = 0; i <= 4; i++)
		{
		for (j = 0; j <= 4; j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i][j] > max[i]) //????????
			{
				max[i] = a[i][j];
			}
		}
		}

		for (j = 0; j <= 4; j++)
		{
			min[j] = a[1][j];
			for (i = 0; i <= 4; i++)
			{
				if (a[i][j] < min[j]) //????
				{
					min[j] = a[i][j];
				}
			}
		}
		for (int k = 0; k <= 4; k++) //???????
		{
		for (int l = 0; l <= 4; l++)
		{
			if (max[k] == min[l])
			{
				System.out.print(k + 1);
				System.out.print(" ");
				System.out.print(l + 1);
				System.out.print(" ");
				System.out.print(max[k]);
				System.out.print("\n");
				flag = 1; //??????
			}

		}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}

}

