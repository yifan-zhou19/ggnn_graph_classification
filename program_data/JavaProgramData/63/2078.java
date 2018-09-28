package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int q;
		int n;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				a[i][0] = Integer.parseInt(tempVar3);
			}
		  for (j = 1;j < q;j++)
		  {
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar4);
		  }
		  }
		}
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  q = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  n = Integer.parseInt(tempVar6);
		  }
		 for (i = 0;i < q;i++)
		 {
			String tempVar7 = ConsoleInput.scanfRead("\n");
			if (tempVar7 != null)
			{
				b[i][0] = Integer.parseInt(tempVar7);
			}
		  for (j = 1;j < n;j++)
		  {
		  String tempVar8 = ConsoleInput.scanfRead(" ");
		  if (tempVar8 != null)
		  {
			  b[i][j] = Integer.parseInt(tempVar8);
		  }
		  }
		 }
		  for (i = 0;i < m;i++)
		  {
			for (j = 0;j < n;j++)
			{
				c[i][j] = 0;
			for (t = 0;t < q;t++)
			{
				c[i][j] = (a[i][t]) * (b[t][j]) + c[i][j];
			}
			}
		  }
		  for (i = 0;i < m;i++)
		  {
			 System.out.printf("\n%d",c[i][0]);
			for (j = 1;j < n;j++)
			{
			System.out.printf(" %d",c[i][j]);
			}
		  }
			return 0;
	}

}

