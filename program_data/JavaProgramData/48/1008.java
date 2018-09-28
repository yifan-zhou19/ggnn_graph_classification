package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void ganster()
	{
		 int i;
		 int j;
		 int c;
		 for (i = 0;i < 9;i++)
		 {
		 for (j = 0;j < 9;j++)
		 {
		 b[i][j] = 0;
		 }
		 }
		 for (i = 0;i < 9;i++)
		 {
			for (j = 0;j < 9;j++)
			{
			   if (a[i][j] != 0)
			   {
				   c = a[i][j];
			   b[i][j] += c;
			   b[i][j - 1] += c;
			   b[i][j + 1] += c;
			   b[i + 1][j] += c;
			   b[i + 1][j - 1] += c;
			   b[i + 1][j + 1] += c;
			   b[i - 1][j] += c;
			   b[i - 1][j - 1] += c;
			   b[i - 1][j + 1] += c;
			   }
			}
		 }
		 for (i = 0;i < 9;i++)
		 {
		 for (j = 0;j < 9;j++)
		 {
		 a[i][j] += b[i][j];
		 }
		 }
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		a[4][4] = m;
		for (i = 0;i < n;i++)
		{
			 ganster();
		}
		for (i = 0;i < 9;i++)
		{
		   for (j = 0;j < 8;j++)
		   {
			  System.out.printf("%d ",a[i][j]);
		   }
		   System.out.printf("%d\n",a[i][j]);
		}

	}

}

