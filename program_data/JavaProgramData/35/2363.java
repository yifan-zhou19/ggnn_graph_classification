package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int max;
		int min;
		int pan;
		int[] hang = new int[10];
		int[] lie = new int[10];
		int i;
		int j;
		int[][] a = new int[10][10];
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
			max = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					hang[i] = j;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			min = 1000;
			for (j = 0;j < m;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
					lie[i] = j;
				}
			}
		}
		pan = 0;
		for (i = 0;i < m;i++)
		{
			if (lie[hang[i]] == i)
			{
				System.out.printf("%d+%d",i,hang[i]);
				pan++;
			}
		}
		if (pan == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

