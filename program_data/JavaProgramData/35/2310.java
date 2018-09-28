package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[10][10];
		int[] a = new int[10];
		int[] b = new int[10];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			t = sz[i][0];
			a[i] = 0;
						 for (j = 0;j < n;j++)
						 {
										  if (t < sz[i][j])
										  {
											  t = sz[i][j];
											  a[i] = j;
										  }
						 }
		}
		for (i = 0;i < n;i++)
		{
			t = sz[0][i];
			b[i] = 0;
						 for (j = 0;j < m;j++)
						 {
										  if (t > sz[j][i])
										  {
											  t = sz[j][i];
											  b[i] = j;
										  }
						 }
		}
		for (i = 0;i < m;i++)
		{
						 if (b[a[i]] == i)
						 {
							 System.out.printf("%d+%d\n",i,a[i]);
							 break;
						 }
						 if (i == m - 1)
						 {
							 System.out.print("No");
						 }
		}


		return 0;

	}

}

