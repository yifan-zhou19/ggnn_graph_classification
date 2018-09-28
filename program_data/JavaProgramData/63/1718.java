package <missing>;

public class GlobalMembers
{
	/**  
	* @file ????  .cpp  
	* @author ??? 
	* @date   2013-11-01  * @description 
	*          ??????:????   */ 
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int x1;
		int y1;
		int x2;
		int y2;
		int number;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
			{
				number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = number;
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x2;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i][j] = number;
			}
		}
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				int sum = 0;
				for (int k = 0;k < y1;k++)
				{
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
				if (j == (y2 - 1))
				{
					System.out.print(c[i][j]);
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
			}
			System.out.print("\n");

		}
		return 0;
	}
}

