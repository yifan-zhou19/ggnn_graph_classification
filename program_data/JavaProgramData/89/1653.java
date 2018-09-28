package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[MAX][MAX];

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (scanf("%d%d", i, j) != EOF && (i != 0 || j != 0))
		{
							a[i][j] = 1;
		}

		i = 0, j = n - 1;
		while (i < j)
		{
				  if (a[i][j] != 0)
				  {
							 i++;
				  }
				  else
				  {
					  j--;
				  }
		}
		int flag = 0;
		for (k = 0; k < n; k++)
		{
				 if (a[i][k] != 0)
				 {
							flag = 1;
				 }
				 if (a[k][i] == 0 && k != i)
				 {
							flag = 1;
				 }
		}
		if (flag != 0)
		{
				System.out.print("NOT FOUND\n");
		}
		else
		{
			System.out.printf("%d\n", i);
		}
		return 0;
	}


}

