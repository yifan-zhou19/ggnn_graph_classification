package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
	double b = 0;
	double c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[][] a = new int[2][11];
		for (i = 0;i <= m - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0][i] = Integer.parseInt(tempVar2);
			}
		}

			for (j = 0;j <= m - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[1][j] = Integer.parseInt(tempVar3);
				}
				 if (a[1][j] >= 90)
				 {
					 b = b + 4.0 * a[0][j];
				 }
				 else if (a[1][j] >= 85)
				 {
					 b = b + 3.7 * a[0][j];
				 }
				 else if (a[1][j] >= 82)
				 {
					 b = b + 3.3 * a[0][j];
				 }
							 else if (a[1][j] >= 78)
							 {
								 b = b + 3.0 * a[0][j];
							 }
							 else if (a[1][j] >= 75)
							 {
								 b = b + 2.7 * a[0][j];
							 }
							 else if (a[1][j] >= 72)
							 {
								 b = b + 2.3 * a[0][j];
							 }
							 else if (a[1][j] >= 68)
							 {
								 b = b + 2.0 * a[0][j];
							 }
							 else if (a[1][j] >= 64)
							 {
								 b = b + 1.5 * a[0][j];
							 }
							 else if (a[1][j] >= 60)
							 {
								 b = b + 1.0 * a[0][j];
							 }
			}

						   for (j = 0;j <= m - 1;j++)
						   {
							   c = c + a[0][j];
						   }
		System.out.printf("%.2f",b / c);
	}
}

