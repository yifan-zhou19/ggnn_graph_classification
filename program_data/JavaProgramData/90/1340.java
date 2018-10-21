package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int[][] a = new int[100][2];
	 int f = new int(int a,int b);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i][0] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i][1] = Integer.parseInt(tempVar3);
		 }
	 }
	 for (int i = 0;i < n;i++)
	 {
		 System.out.printf("%d\n",f(a[i][0], a[i][1]));
	 }
	}
	public static int f(int a,int b)
	{
		int[][] k = new int[101][101];
		for (int i = 0;i <= 101;i++)
		{
			k[0][i] = 1;
			k[1][i] = 1;
			k[i][1] = 1;
		}
		for (int i = 1;i <= 101;i++)
		{
			for (int j = 2;j <= 101;j++)
			{
				if (i < j)
				{
					k[i][j] = k[i][j - 1];
				}
				else
				{
					k[i][j] = k[i][j - 1] + k[i - j][j];
				}
			}
		}
		return k[a][b];
	}
}

