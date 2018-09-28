package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[m][n];
		int i;
		int j;
		int max;
		int min;
		int flag = 0;
		int i1;
		   for (i = 0;i < m;i++)
		   {
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		   }
			for (i = 0;i < m;i++)
			{
			i1 = i;
			for (max = a[i][0],j = 0;j < n;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				for (min = a[i][j],i = 0;i < m;i++)
				{
					if (min > a[i][j])
					{
						min = a[i][j];
					}
				}
				i = i1;
				if (a[i][j] == max && a[i][j] == min)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					flag++;
				}
			}

			}
		if (flag == 0)
		{
			System.out.print("not found\n");
		}
		else
		{
			System.out.print("\n");
		}
	}

}

