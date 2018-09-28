package <missing>;

public class GlobalMembers
{
	//***************************************************************************
	//???????
	//??? ??n???????? 
	//?????? 
	//*************************************************************************** 
	public static void search(int l)
	{
		  for (int i = 0; i < n; i++)
		  {
						  for (int j = 0; j < n; j++)
						  {
								  if (a[i][j] == '@') //???????????????????
								  {
											 if (i > 0 && a[i - 1][j] == '.')
											 {
												  p[i - 1][j] = 1;
											 }
											 if (i < n - 1 && a[i + 1][j] == '.')
											 {
												  p[i + 1][j] = 1;
											 }
											 if (j > 0 && a[i][j - 1] == '.')
											 {
												  p[i][j - 1] = 1;
											 }
											 if (j < n - 1 && a[i][j + 1] == '.')
											 {
												  p[i][j + 1] = 1;
											 }
								  }
						  }
		  }
		  for (int k = 0; k < n; k++) //???????�@�
		  {
						 for (int h = 0; h < n; h++)
						 {
								 if (p[k][h] == 1)
								 {
											a[k][h] = '@';
								 }
						 }
		  }
		  if (l < m - 1) //?????????????
		  {
			   search(l + 1);
		  }
	}
	public static int n;
	public static int m;
	public static int[][] p = new int[101][101];
	public static int c = 0;
	public static char[][] a = new char[101][101];
	public static int Main() //???
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //????
		{
				for (int j = 0; j < n; j++)
				{
						a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				}
		}
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 search(1); //????
		 for (int i = 0; i < n; i++) //????????
		 {
				for (int j = 0; j < n; j++)
				{
						if (a[i][j] == '@')
						{
								   c++;
						}
				}
		 }
		 System.out.print(c);
		 System.out.print("\n");
		 return 0;
	}

}

