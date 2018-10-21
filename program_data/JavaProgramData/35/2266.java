package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hen;
		int lie;
		int i;
		int j;
		int m;
		int n;
		int count = 0;
		int[][] a = new int[10][10];
		int[][] temp = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hen = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hen;i++)
		{
		  for (j = 0;j < lie;j++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		  }
		}
		for (i = 0;i < hen;i++)
		{
		  for (j = 0;j < lie;j++)
		  {
			  temp[i][j] = 0;
		  }
		}
		for (i = 0;i < hen;i++)
		{
			for (j = 0;j < lie;j++)
			{
				for (m = 0;m < lie;m++)
				{
					if (a[i][j] < a[i][m])
					{
						temp[i][j] = 1;
					}
				}
				for (n = 0;n < hen;n++)
				{
					if (a[i][j] > a[n][j])
					{
						temp[i][j] = 1;
					}
				}
			}
		}
		for (i = 0;i < hen;i++)
		{
			for (j = 0;j < lie;j++)
			{
				if (temp[i][j] == 0)
				{
					count = 1;
					System.out.printf("%d+%d",i,j);
				}
			}
		}
		if (count == 0)
		{
			System.out.print("No");
		}
	}




}

