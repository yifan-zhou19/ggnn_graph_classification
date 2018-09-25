package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int M;
		int m;
		int[] min = new int[120];
		int[] max = new int[120];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				min[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				max[i] = Integer.parseInt(tempVar3);
			}
		}
		m = 1;
		int[] jieguo = new int[120];
		for (i = 1;i <= n;i++)
		{
			if (min[i] >= 90 && min[i] <= 140 && max[i] >= 60 && max[i] <= 90)
			{
				jieguo[m] = 1;
				for (j = 1;(i + j) <= n;j++)
				{
					if (min[i + j] >= 90 && min[i + j] <= 140 && max[i + j] >= 60 && max[i + j] <= 90)
					{
						jieguo[m]++;
					}
					else
					{
						break;
					}
				}
				m++;
			}
		}
		M = jieguo[1];
		for (i = 2;i <= 100;i++)
		{
			if (jieguo[i] >= M)
			{
				M = jieguo[i];
			}
			else
			{
				continue;
			}
		}
		System.out.printf("%d",M);
		return 0;
	}



}

