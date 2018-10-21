package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[100][100];
		int s;
		int[] q = new int[100];
		int h1;
		int h2;
		int t;
		int l1;
		int l2;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1,t = 0;i <= k,t < k;i++,t++)
		{
			  h1 = 0,h2 = 0,t,l1 = 0,l2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

			if (n == 1 && m == 1)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[0][0] = Integer.parseInt(tempVar4);
				}
			q[t] = a[0][0];
			}

			if (m == 1 && n > 1)
			{
			   for (i = 0;i < n;i++)
			   {
					String tempVar5 = ConsoleInput.scanfRead();
					if (tempVar5 != null)
					{
						a[0][i] = Integer.parseInt(tempVar5);
					}
			   }

			   for (c = 0,i = 0;i < n;i++)
			   {
				c = c + a[0][i];
			   }
			   q[t] = c;
			}

			if (n > 1 && m > 1)
			{
				for (i = 0;i < m;i++)
				{
				for (j = 0;j < n;j++)
				{
				  String tempVar6 = ConsoleInput.scanfRead();
				  if (tempVar6 != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar6);
				  }
				}
				} //wan cheng shu ru
			for (j = 0;j < n;j++)
			{
					h1 = h1 + a[0][j];
			}
			for (j = 0;j < n;j++)
			{
					h2 = h2 + a[m - 1][j];
			}
			for (i = 1;i < m - 1;i++)
			{
					l1 = l1 + a[i][0];
			}
			for (i = 1;i < m - 1;i++)
			{
					l2 = l2 + a[i][n - 1];
			}
			q[t] = h1 + h2 + l1 + l2;
			}

			if (n == 1 && m > 1)
			{
			   for (i = 0;i < m;i++)
			   {
					String tempVar7 = ConsoleInput.scanfRead();
					if (tempVar7 != null)
					{
						a[i][0] = Integer.parseInt(tempVar7);
					}
			   }

			   for (c = 0,i = 0;i < m;i++)
			   {
				c = c + a[i][0];
			   }
			   q[t] = c;
			}
		}


			for (i = 0;i < k;i++)
			{
					System.out.printf("%d\n",q[i]);
			}
					return 0;
	}
}

