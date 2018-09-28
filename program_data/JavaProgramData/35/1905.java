package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int max;
		int min;
		int k = 0;
		int[][] a = new int[10][10];
		int[] r1 = new int[10];
		int[] l1 = new int[10];
		int[] r2 = new int[10];
		int[] l2 = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			max = a[i][0];
			r1[i] = i;
			l1[i] = 0;
			for (j = 1;j < m;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					r1[i] = i;
					l1[i] = j;
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			min = a[0][j];
			r2[j] = 0;
			l2[j] = j;
			for (i = 0;i < n;i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
					r2[j] = i;
					l2[j] = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (r1[i] == r2[j] && l1[i] == l2[j])
				{
					k = 1;
					System.out.printf("%d+%d\n",r1[i],l2[j]);
				}

			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
	}






}

