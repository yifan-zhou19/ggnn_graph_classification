package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int mini;
		int maxi;
		int minj;
		int maxj;
		int time;
		int count = 0;
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
		mini = 0;
		maxi = m - 1;
		minj = 0;
		maxj = n - 1;
		for (time = 1;count < m * n;time++)
		{
			switch (time % 4)
			{
			  case 1:
			  {
					  for (i = mini,j = minj;j <= maxj;j++)
					  {
						  System.out.printf("%d\n",a[i][j]);
						  count++;
					  }
					  mini++;
					  break;
			  }
			  case 2:
			  {
					  for (j = maxj,i = mini;i <= maxi;i++)
					  {
						  System.out.printf("%d\n",a[i][j]);
						  count++;
					  }
					  maxj--;
					  break;
			  }
			  case 3:
			  {
					  for (i = maxi,j = maxj;j >= minj;j--)
					  {
						  System.out.printf("%d\n",a[i][j]);
						  count++;
					  }
					  maxi--;
					  break;
			  }
			  case 0:
			  {
					  for (j = minj,i = maxi;i >= mini;i--)
					  {
						  System.out.printf("%d\n",a[i][j]);
						  count++;
					  }
					  minj++;
					  break;
			  }
			}
		}
		return 0;
	}
}

