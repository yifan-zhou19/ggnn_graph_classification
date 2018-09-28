package <missing>;

public class GlobalMembers
{
	/**  
	* @file   ???? .cpp  
	* @author ??? 
	* @date   2013-11-01  * @description 
	*          ??????:????   */ 
	public static int Main()
	{
		int[][] a = new int[5][5];
		int number;
		int t = 0;
		for (int i = 0;i < 5;i++)
		{
			for (int j = 0;j < 5;j++)
			{
				number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = number;
			}
		}
		int max = INT_MIN;
		int maxi;
		int maxj;
		for (int i = 0;i < 5;i++)
		{
			max = INT_MIN;
			for (int j = 0;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					maxi = i;
					maxj = j;
				}
			}
			int k = 0;
			for (;k < 5;k++)
			{
				if (a[k][maxj] < max)
				{
					break;
				}
			}
			if (k == 5)
			{
				System.out.print((maxi + 1));
				System.out.print(" ");
				System.out.print((maxj + 1));
				System.out.print(" ");
				System.out.print(max);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}





}

