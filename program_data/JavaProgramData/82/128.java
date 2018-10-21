package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int temp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int count = 0;
		int[][] sz = new int[100][2];
		int[] pd = new int[100];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int k = 0;k < n;k++)
		{
			if ((sz[k][0] >= 90) && (sz[k][0] <= 140) && (sz[k][1] >= 60) && (sz[k][1] <= 90))
			{
				pd[k] = 1;
			}

		}
		for (int l = 0;l < n;l++)
		{
			if (pd[l] == 1)
			{
				count++;
			}
			if (pd[l] == 0)
			{
				if (count > temp)
				{
				   temp = count;
				}

				count = 0;
			}
		}
		if (count > temp)
		{
			temp = count;
		}
		System.out.printf("%d",temp);


		return 0;
	}


}

