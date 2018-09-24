package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int flag;
		int hang;
		int lei;
		int max;
		int[][] a = new int[8][8];
		flag = 1;
		hang = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
			max = a[i][0];
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > a[i][j - 1])
				{
					max = a[i][j];
				}
			}


			for (j = 0;j < n;j++)
			{
				if (a[i][j] == max)
				{
					break;
				}
			}

			for (k = 0;k < i;k++)
			{
				if (a[k][j] < a[i][j])
				{
				flag = 0;
				}
			}
				if (flag != 0)
				{
					for (k = i + 1;k < m;k++)
					{
						if (a[k][j] < a[i][j])
						{
							flag = 0;
						}
					}
				}
				if (flag != 0)
				{
					hang = 0;
					System.out.printf("%d+%d",i,j);
					break;
				}
		}
		if (hang != 0)
		{
			System.out.print("No");
		}





	}

}

