package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] b = new int[2][10];
		int xuefen = 0;
		int i;
		int j;
		int n;
		float zong = 0.0F;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 1;i++)
		{
						 for (j = 0;j <= n - 1;j++)
						 {
											String tempVar2 = ConsoleInput.scanfRead();
											if (tempVar2 != null)
											{
												b[i][j] = Integer.parseInt(tempVar2);
											}
											if (i == 0)
											{
											xuefen = xuefen + b[i][j];
											}
											if (i == 1)
											{
												   if (b[i][j] >= 90 && b[i][j] <= 100)
												   {
												   zong = zong + 4 * b[0][j];
												   }
													if (b[i][j] >= 85 && b[i][j] <= 89)
													{
												   zong = zong + 3.7 * b[0][j];
													}
													if (b[i][j] >= 82 && b[i][j] <= 84)
													{
												   zong = zong + 3.3 * b[0][j];
													}
													if (b[i][j] >= 78 && b[i][j] <= 81)
													{
												   zong = zong + 3.0 * b[0][j];
													}
													if (b[i][j] >= 75 && b[i][j] <= 77)
													{
												   zong = zong + 2.7 * b[0][j];
													}
													if (b[i][j] >= 72 && b[i][j] <= 74)
													{
												   zong = zong + 2.3 * b[0][j];
													}
													if (b[i][j] >= 68 && b[i][j] <= 71)
													{
												   zong = zong + 2 * b[0][j];
													}
													if (b[i][j] >= 64 && b[i][j] <= 67)
													{
												   zong = zong + 1.5 * b[0][j];
													}
													if (b[i][j] >= 60 && b[i][j] <= 63)
													{
												   zong = zong + 1 * b[0][j];
													}
											}

						 }
		}
		GPA = (float)zong / xuefen;
		 System.out.printf("%.2f",GPA);


	}

}

