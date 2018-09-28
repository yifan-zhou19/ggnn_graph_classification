package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
		public static int m;
		public static int n;
	public static int jh(int[][] a, int m, int n)
	{
		int c;
		if (m > 4 || m < 0 || n>4 || n < 0)
		{
							   System.out.print("error");
		}
		else
		{
			 for (int j = 0;j <= 4;j++)
			 {
					 c = a[m][j];
					 a[m][j] = a[n][j];
					 a[n][j] = c;
			 }
			 for (int i = 0;i <= 4;i++)
			 {
				for (int j = 0;j <= 3;j++)
				{
						System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			 }
		}
		return 0;
	}
	public static int Main()
	{
		for (int i = 0;i <= 4;i++)
		{
				for (int j = 0;j <= 4;j++)
				{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							a[i][j] = Integer.parseInt(tempVar);
						}
				}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		jh(a, m, n);
		int y;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

