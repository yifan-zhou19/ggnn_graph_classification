package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[10][10];
		int p;
		int q;
		int i;
		int j;
		int maxi;
		int maxj;
		int max;
		int t;
		int time;
		int m;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}


			m = 0;
		for (i = 0;i < p;i++)
		{
			max = a[i][0];
			maxi = i;
			maxj = 0;
			time = 0;
			for (j = 0;j < q;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					maxj = j;
					maxi = i;
				}
			}
			for (t = 0;t < p;t++)
			{
				if (a[t][maxj] < max)
				{
					break;
				}
				else
				{
					time++;
				}
			}
			if (time == p)
			{
				System.out.printf("%d+%d",maxi,maxj);
				m = 1;
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}

	}
}

