package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] zhen = new int[11][11];
		int[][] zhen2 = new int[11][11];
		int m;
		int n;
		int i;
		int j;
		int k;
		int hang1;
		int hang2;
		for (i = 0;i <= 10;i++)
		{
						 for (j = 0;j <= 10;j++)
						 {
							 zhen[i][j] = 0;
						 }
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		zhen[5][5] = m; //???????
		hang1 = 5;
		hang2 = 5;
		for (k = 1;k <= n;k++)
		{

						for (i = 0;i <= 10;i++)
						{
						   for (j = 0;j <= 10;j++)
						   {
							   zhen2[i][j] = zhen[i][j]; //??????????????????????????
						   }
						}
						 for (i = hang1 - 1;i <= hang2 + 1;i++)
						 {
										  for (j = hang1 - 1;j <= hang2 + 1;j++)
										  {
											  zhen[i][j] = zhen2[i - 1][j - 1] + zhen2[i - 1][j] + zhen2[i - 1][j + 1] + zhen2[i][j - 1] + 2 * zhen[i][j] + zhen2[i][j + 1] + zhen2[i + 1][j - 1] + zhen2[i + 1][j] + zhen2[i + 1][j + 1];
										  }
						 } //??????????
						 hang1 = hang1 - 1;
						 hang2 = hang2 + 1; //???????
		}
		for (i = 1;i <= 9;i++)
		{
						 for (j = 1;j <= 9;j++)
						 {
							 System.out.print(zhen[i][j]);
						 if (j < 9)
						 {
							 System.out.print(" ");
						 }
						 }
						 System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	return 0;
	}
}

