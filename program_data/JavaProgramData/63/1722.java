package <missing>;

public class GlobalMembers
{
	//**************************
	//*???????  **
	//*?????? 1200012888 **
	//*???2013.11.01**
	//**************************
	public static int Main()
	{
		int[][] a = new int[100][100]; //?????? a b c ? 100*100
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < x1 ; i++)
		{
			for (int j = 0 ; j < y1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < x2 ; i++)
		{
			for (int j = 0 ; j < y2 ; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0 ; i < x1 ; i++) //???? c????? ? x1 * y2
		{
			for (int j = 0 ; j < y2 ; j++)
			{
				for (int k = 0 ; k < x2 ; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
												//??????? ???? c[i][j]??
				}
			}
		}
		for (int i = 0 ; i < x1 ; i++)
		{
			for (int j = 0 ; j < y2 ; j++)
			{
				if (j == 0) //????? ?????????
				{
					System.out.print(c[i][j]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(c[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

