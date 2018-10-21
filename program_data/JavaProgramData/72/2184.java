package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int[][] mj = new int[m][n];
	for (int i1 = 0;i1 < m;i1++)
	{
	   for (int j1 = 0;j1 < n;j1++)
	   {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			mj[i1][j1] = Integer.parseInt(tempVar3);
		}
	   }
	}
	for (int i2 = 0;i2 < m;i2++)
	{
	   for (int j2 = 0;j2 < n;j2++)
	   {
		if (i2 == 0 || i2 == m - 1 || j2 == 0 || j2 == n - 1)
		{
		 if (i2 == 0 && j2 == 0 && mj[i2][j2] >= mj[i2 + 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 + 1])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (i2 == 0 && j2 == n - 1 && mj[i2][j2] >= mj[i2 + 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 - 1])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (i2 == m - 1 && j2 == 0 && mj[i2][j2] >= mj[i2 - 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 + 1])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (i2 == m - 1 && j2 == n - 1 && mj[i2][j2] >= mj[i2 - 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 - 1])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (i2 == 0 && j2 != 0 && j2 != n - 1 && mj[i2][j2] >= mj[i2 + 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 + 1] != 0 && mj[i2][j2] >= mj[i2][j2 - 1])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (i2 == m - 1 && j2 != 0 && j2 != n - 1 && mj[i2][j2] >= mj[i2 - 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 + 1] != 0 && mj[i2][j2] >= mj[i2][j2 - 1])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (j2 == 0 && i2 != 0 && i2 != m - 1 && mj[i2][j2] >= mj[i2 + 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 + 1] != 0 && mj[i2][j2] >= mj[i2 - 1][j2])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		 if (j2 == n - 1 && i2 != 0 && i2 != m - 1 && mj[i2][j2] >= mj[i2 + 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 - 1] != 0 && mj[i2][j2] >= mj[i2 - 1][j2])
		 {
			 System.out.printf("%d %d\n",i2,j2);
		 }
		}
		else
		{
		if (mj[i2][j2] >= mj[i2 - 1][j2] != 0 && mj[i2][j2] >= mj[i2 + 1][j2] != 0 && mj[i2][j2] >= mj[i2][j2 - 1] != 0 && mj[i2][j2] >= mj[i2][j2 + 1])
		{
			System.out.printf("%d %d\n",i2,j2);
		}
		}
	   }
	}
	return 0;
	}


}

