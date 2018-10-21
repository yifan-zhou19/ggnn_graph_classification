package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int max;
	int temp;
	int flag;
	int[][] a = new int[5][5];
	for (i = 0;i <= 4;i++)
	{
	  for (j = 0;j <= 4;j++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i][j] = Integer.parseInt(tempVar);
		}
	  }
	}
	for (i = 0;i <= 4;i++)
	{
					max = a[i][0];
					flag = 1;
				   for (j = 0;j <= 4;j++)
				   {
								if (a[i][j] >= max)
								{
								   max = a[i][j];
								   temp = j;
								}
				   }
				   for (k = 0;k <= 4;k++)
				   {
									if (a[k][temp] < max)
									{
									  flag = 0;
									break;
									}
				   }
		   if (flag == 1)
		   {
		  System.out.printf("%d %d %d",i + 1,temp + 1,a[i][temp]);
		  break;
		   }
	}
			 if (flag == 0)
			 {
			 System.out.print("not found");
			 }
		return 0;
	}
}

