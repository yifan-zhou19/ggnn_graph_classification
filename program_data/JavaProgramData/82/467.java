package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int i;
		int j;
		int[] max = new int[100];
		int[][] p = new int[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < 100;i++)
		{
			max[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (p[i][0] >= 90 && p[i][0] <= 140 && p[i][1] >= 60 && p[i][1] <= 90)
			{
				max[i] = max[i - 1] + 1;
			}
		}
		for (j = 0;j < 100;j++)
		{
			if (max[j] > m)
			{
				m = max[j];
			}
		}
		System.out.printf("%d\n",m);
		return 0;
	}

}

