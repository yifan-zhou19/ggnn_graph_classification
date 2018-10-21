package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[10][10];
		int i;
		int j;
		int[] max = new int[10];
		int[] min = new int[10];
		int k = 0;
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
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
		for (i = 0;i < m;i++)
		{
			max[i] = a[i][0];
		}
		for (j = 0;j < n;j++)
		{
			min[j] = a[0][j];
		}
	   for (i = 0;i < m;i++)
	   {
			for (j = 0;j < n;j++)
			{
					if (a[i][j] > max[i])
					{
						max[i] = a[i][j];
					}
					if (a[i][j] < min[j])
					{
						min[j] = a[i][j];
					}
			}
	   }
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (max[i] == min[j])
				{
					System.out.printf("%d+%d\n",i,j);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}



}

