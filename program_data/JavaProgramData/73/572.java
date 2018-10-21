package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????      **
	//*?????? 1300012887 **
	//*???2013.11.03 **
	//********************************
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int l = 0;
		int b;
		int max;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0; k <= 4; k++) //????????????
		{
			max = a[k][0];
			b = 0;
			for (j = 1; j <= 4; j++)
			{
				if (a[k][j] > max)
				{
					max = a[k][j]; //?????????
					b = j; //?????????
				}
			}
			if (max <= a[0][b] != 0 && max <= a[1][b] != 0 && max <= a[2][b] != 0 && max <= a[3][b] != 0 && max <= a[4][b])
			{
				System.out.print(k + 1);
				System.out.print(" ");
				System.out.print(b + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
				l++; //???????
			}
		}
		if (l == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}



}

