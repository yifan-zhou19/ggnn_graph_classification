package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[][] sz = new int[100][2];
		int i;
		int j;
		int[] p = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int hour = 0;
		int[] hour1 = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}

			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i][0] < 90 || sz[i][0]>140 || sz[i][1] < 60 || sz[i][1]>90)
			{
				p[i] = 0;
			}
			else
			{
				p[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == 1)
			{
				hour++;
			}
			if (p[i] == 0)
			{
				hour1[i] = hour;
				hour = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (hour1[i] > hour)
			{
				hour = hour1[i];
			}
		}


			System.out.printf("%d",hour);






	}
}

