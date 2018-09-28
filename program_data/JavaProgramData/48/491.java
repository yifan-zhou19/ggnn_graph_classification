package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????????                               **
	//*?????? 1100012760**
	//*???2011.11.26                          **
	//****************************************
	public static int Main()
	{
		int[][] mat = new int[10][10];
		int[][] New = new int[10][10];
		int i;
		int j;
		int l;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mat[5][5] = m;
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1 ; j <= 9 ; j++)
			{
				for (l = 1 ; l <= 9 ; l++)
				{
					New[j][l] = 0;
				}
			}
			for (j = 1 ; j <= 9 ; j++)
			{
				for (l = 1 ; l <= 9 ; l++)
				{
					New[j][l] += 2 * mat [j][l];
					New[j - 1][l - 1] += mat [j][l];
					New[j + 1][l - 1] += mat [j][l];
					New[j - 1][l + 1] += mat [j][l];
					New[j + 1][l + 1] += mat [j][l];
					New[j][l - 1] += mat [j][l];
					New[j - 1][l] += mat [j][l];
					New[j + 1][l] += mat [j][l];
					New[j][l + 1] += mat [j][l];
				}
			}
			for (j = 1 ; j <= 9 ; j++)
			{
				for (l = 1 ; l <= 9 ; l++)
				{
					mat[j][l] = New[j][l];
				}
			}
		}
		for (j = 1 ; j <= 9 ; j++)
		{
			System.out.print(mat[j][1]);
			for (l = 2 ; l <= 9 ; l++)
			{
				System.out.print(' ');
				System.out.print(mat[j][l]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

