package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			int m;
			int n;
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
			 int i;
			 int j;
			int[][] a = new int[100][100];
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar4);
			  }
				}
			}
			int s = 0;
				if (m == 1)
				{
				for (j = 0;j < n;j++)
				{
					s += a[0][j];
				}
				System.out.printf("%d\n",s);
				}
				else if (n == 1)
				{
					for (i = 0;i < m;i++)
					{
						s += a[i][0];
					}

				System.out.printf("%d\n",s);
				}
				else
				{



		   for (j = 0;j < n - 1;j++)
		   {
			   s += a[0][j];
		   }
		   for (i = 0;i < m - 1;i++)
		   {
			   s += a[i][n - 1];
		   }
		   for (j = 1;j < n;j++)
		   {
			   s += a[m - 1][j];
		   }
		   for (i = 1;i < m;i++)
		   {
			   s += a[i][0];
		   }
		   System.out.printf("%d\n",s);
				}
		}
		return 0;
	}

}

