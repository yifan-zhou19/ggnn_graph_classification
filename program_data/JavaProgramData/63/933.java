package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		int[][] c = new int[100][100];
		int[][] d = new int[100][100];
		int i;
		int j;
		int s;
		int t;
		int k;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		 for (i = 0;i <= m - 1;i++)
		 {
			for (j = 0;j <= n;j++)
			{
			 if (j <= n - 1)
			 {
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar4);
			 }
			 }
		 else
		 {
			 String tempVar5 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar5 != null)
			 {
				 b = tempVar5.charAt(0);
			 }
		 }
			}
		 }

		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			s = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			t = Integer.parseInt(tempVar7);
		}
		String tempVar8 = ConsoleInput.scanfRead(null, 1);
		if (tempVar8 != null)
		{
			b = tempVar8.charAt(0);
		}
		 for (i = 0;i <= s - 1;i++)
		 {
			for (j = 0;j <= t;j++)
			{
			 if (j <= t - 1)
			 {
			 String tempVar9 = ConsoleInput.scanfRead();
			 if (tempVar9 != null)
			 {
				 c[i][j] = Integer.parseInt(tempVar9);
			 }
			 }
		 else
		 {
			 String tempVar10 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar10 != null)
			 {
				 b = tempVar10.charAt(0);
			 }
		 }
			}
		 }

		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= t - 1;j++)
			{
			  for (k = 0;k <= n - 1;k++)
			  {
		  d[i][j] = a[i][k] * c[k][j] + d[i][j];
			  }
			}
		}

		for (i = 0;i <= m - 1;i++)
		{
			for (k = 0;k <= t - 1;k++)
			{
			if (k <= t - 2)
			{
				System.out.printf("%d ",d[i][k]);
			}
		else
		{
			System.out.printf("%d\n",d[i][k]);
		}
			}
		}
	}
}

