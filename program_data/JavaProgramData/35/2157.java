package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		int i;
		int e;
		int m;
		int d;
		int f;
		int j;
		f = 0;
		int[] max = new int[8];
		int[] min = new int[8];
		int[][] sz = new int[8][8];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				hang = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				lie = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < hang;i++)
			{
				for (j = 0;j < lie;j++)
				{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][j] = Integer.parseInt(tempVar3);
			}
				}
			}


			for (i = 0;i < hang;i++)
			{

				max[i] = sz[i][0];

				for (j = 1;j < lie;j++)
				{
					if (max[i] < sz[i][j])
					{
						max[i] = sz[i][j];
					}
				}

				for (j = 0;j < lie;j++)
				{
					if (max[i] == sz[i][j])
					{
						e = j;
					}
				}


				for (m = 0;m < hang;m++)
				{
				 min[e] = sz[0][e];
					if (min[e] > sz[m][e])
					{
						min[e] = sz[m][e];
					}
				}

	for (m = 0;m < hang;m++)
	{
					if (min[e] == sz[m][e])
					{
						d = m;
					}
	}

	if (d == i)
	{
	System.out.printf("%d+%d",d,e);
	}
	else
	{
	f++;
	}


			}


			if (f == hang)
			{
				System.out.print("No");
			}
		return 0;
	}
}

