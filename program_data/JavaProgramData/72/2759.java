package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int[][] a = new int[30][30];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

				for (i = 0;i < m;i++)
				{
					for (j = 0;j < n;j++)
					{
						if (i == 0)
						{
						 if (j == 0 && a[0][0] >= a[0][1] != 0 && a[0][0] >= a[1][0])
						 {
						   System.out.print("0 0\n");
						 }
						 if (j < n - 1 && j>0)
						 {
							  if (a[0][j] >= a[0][j + 1] != 0 && a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[1][j])
							  {
							  System.out.printf("0 %d\n",j);
							  }
						 }
						  if (j == n - 1)
						  {
							  if (a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[1][j])
							  {
							  System.out.printf("0 %d\n",j);
							  }
						  }
						}
					if (i < (m - 1) && i >= 1)
					{
						   if (j == 0)
						   {
								   if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
								   {
								   System.out.printf("%d %d\n",i,j);
								   }
						   }
						  if (j < n - 1 && j>0)
						  {
								if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
								{
								System.out.printf("%d %d\n",i,j);
								}
						  }
						   if (j == n - 1)
						   {
									 if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
									 {
									 System.out.printf("%d %d\n",i,j);
									 }
						   }
					}
						if (i == (m - 1))
						{
						   if (j == 0)
						   {
								   if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
								   {
								   System.out.printf("%d %d\n",i,j);
								   }
						   }
						   if (j > 0 && j < n - 1)
						   {
								   if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
								   {
									System.out.printf("%d %d\n",i,j);
								   }
						   }
						   if (j == (n - 1))
						   {
									  if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i - 1][j])
									  {
									  System.out.printf("%d %d\n",i,j);
									  }
						   }
						}
					}
				}
									  String tempVar4 = ConsoleInput.scanfRead();
									  if (tempVar4 != null)
									  {
										  i = Integer.parseInt(tempVar4);
									  }
	}

}

