package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int t;
	public static int[][] a = new int[101][11];
	public static int[][] b = new int[101][11];
	public static int[] m = new int[20];
	public static int[] n = new int[20];
	public static int[][] z = new int[101][11];

	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
		}

		 for (i = 1;i <= 100;i++)
		 {
			 b[i][i] = 1;
			 z[i][1] = 1;
			 z[i][2] = i / 2 + 1;
			 for (j = 1;j <= 10;j++)
			 {
				 if (i < j)
				 {
					 z[i][j] = 0;
				 }
			 }
		 }

		 for (i = 1;i <= 10;i++)
		 {
			 z[1][i] = 1;
		 }
		 for (i = 2;i <= 10;i++)
		 {
			 z[2][i] = 2;
		 }

		 for (i = 3;i <= 100;i++)
		 {
			 for (j = 3;j <= 10;j++)
			 {
				 if (i < j)
				 {
					 z[i][j] = z[i][i];
				 }
				 else
				 {
					a[i][j] = z[i][j - 1];
					if (i != j)
					{
						b[i][j] = z[i - j][j];
					}
					z[i][j] = a[i][j] + b[i][j];
				 }
			 }
		 }

		 for (i = 0;i < t;i++)
		 {
			 j = m[i];
			 k = n[i];
			 System.out.printf("%d\n",z[j][k]);
		 }

	}


}

