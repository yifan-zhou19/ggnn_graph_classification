package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????(11.8) ????????    **
	//*?????? 1100012798              **
	//*???2011.11.26                     **
	//****************************************
	public static int[][] a = new int[9][9];
	public static int m;
	public static void breed(int x,int y,int nf) //??????
	{
		int xx;
		int yy;
		if (nf != 0) //??????:??
		{
			breed(x, y, nf - 1); //??
			for (xx = x - 1;xx <= x + 1;xx++)
			{
				for (yy = y - 1;yy <= y + 1;yy++)
				{
					a[xx][yy] += m;
					breed(xx, yy, nf - 1);
				}
			}
		}
	}
	public static int Main()
	{
		int n; //??????
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		breed(4, 4, n); //??
		for (i = 0;i < 9;i++) //??????
		{
			System.out.print(a[i][0]);
			for (j = 1;j < 9;j++)
			{
				System.out.print(" ");
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

