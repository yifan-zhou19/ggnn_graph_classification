package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[30][30];
		int i;
		int j;
		int[] x = new int[30];
		int[] y = new int[30];
		int n;
		int t;
		int bo;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (i = 0;i < n;i++)
			{
			 t = a[i][0];
			 x[i] = 0;
			 for (j = 0;j < m;j++)
			 {
				 if (a[i][j] > t)
				 {
				  t = a[i][j];
				  x[i] = j;
				 }
			 }
			}
			for (i = 0;i < m;i++)
			{
			 t = a[0][i];
			 y[i] = 0;
			 for (j = 0;j < n;j++)
			 {
				 if (a[j][i] < t)
				 {
				  t = a[j][i];
				  y[i] = j;
				 }
			 }
			}
			bo = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (x[i] == j && y[j] == i)
				{
				 System.out.printf("%d+%d",i,j);
				 bo = 1;
				}
			}
		}
		if (bo == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

