package <missing>;

public class GlobalMembers
{
	//***************************************************
	//*    name: 4.cpp                                  *
	//*    author:??                                  *
	//*    date: 2013-11-01                             *
	//*    description:????                         *
	//***************************************************
	public static int Main()
	{
		int[][] a = new int[6][6];
		int max = INT_MIN;
		int min = INT_MAX;
		int maxl;
		int minh;
		int i;
		int j;
		int k;
		int truth = 0;
		for (i = 1;i < 6;i++)
		{
			for (j = 1 ; j < 6 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1 ; i < 6 ;i++)
		{
			for (j = 1 ; j < 6 ; j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					maxl = j;
				}
			}
			for (k = 1 ; k < 6 ; k++)
			{
				if (min > a[k][maxl])
				{
					min = a[k][maxl];
					minh = k;
				}
			}
			if (max == min)
			{
				truth = 1;
				System.out.print(minh);
				System.out.print(' ');
				System.out.print(maxl);
				System.out.print(' ');
				System.out.print(a[minh][maxl]);
			}
			max = INT_MIN;
			min = INT_MAX;
		}
		if (truth == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

