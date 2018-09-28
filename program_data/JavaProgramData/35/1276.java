package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int max;
		int k;
		int min;
		int q;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[x][y];
		for (i = 0;i < x;i++)
		{
						 for (j = 0;j < y;j++)
						 {
										  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 }
		}
		for (i = 0;i < x;i++)
		{
						 max = a[i][0];
						 for (j = 0;j < y;j++)
						 {
							 if (a[i][j] >= max)
							 {
								 max = a[i][j];
								 k = j;
							 }
						 }
						 min = a[0][k];
						 for (j = 0;j < x;j++)
						 {
							 if (a[j][k] <= min)
							 {
								 min = a[j][k];
								 q = j;
							 }
						 }
						 if (max == min)
						 {
							 p++;
							 System.out.print(q);
							 System.out.print("+");
							 System.out.print(k);
						 }
		}
		if (p == 0)
		{
			System.out.print("No");
		}


		return 0;
	}
}

