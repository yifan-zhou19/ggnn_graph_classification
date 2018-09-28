package <missing>;

public class GlobalMembers
{
	/**
	* @file homework.cpp
	* @author ???    1000062705
	* @date 2010-11-8
	* @description
	* ??????:  ????.cpp: ??????
	*/
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int max;
		int t1;
		int t2;
		int s = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = a[i][0]; //??????????????
			for (j = 0; j < 5; j++)
			{
				if (max <= a[i][j])
				{
					max = a[i][j]; //????????
					t1 = i, t2 = j; //???????????
				}
			}
			for (k = 0; k < 5; k++)
			{
				if (max <= a[k][t2])
				{
					continue; //???????????????????
				}
				else
				{
					break;
				}
			}
			if (k == 5)
			{
					System.out.print(t1 + 1);
					System.out.print(" ");
					System.out.print(t2 + 1);
					System.out.print(" ");
					System.out.print(max);
					System.out.print("\n");
					s++; //???????,???????1
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

