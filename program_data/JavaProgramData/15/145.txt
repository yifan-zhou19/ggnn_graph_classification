package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int j;
		int[][] a = new int[40][40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		for (i = 1;i < x;i++)
		{
			a[i][i] = 1;
			a[i][1] = 1;
		}
		for (i = 3;i < x;i++)
		{
		   for (j = 2;j <= i - 1;j++)
		   {
			 a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
		   }
		}
	 for (i = 1;i < x;i++)
	 {
			for (j = 1;j < i;j++)
			{
				System.out.printf("%6d",a[i][j]);
			}
			System.out.print("\n");
	 }
	System.out.print("\n");
	return 0;
	}


}

