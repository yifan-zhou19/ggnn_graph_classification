package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int n;
		int k = 0;
		int m = 0;
		int s = 0;
		int[][] sz = new int[100][2];
		int[] lx = new int[100];
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
			if ((sz[i][0] >= 90) && (sz[i][0] <= 140) && (sz[i][1] >= 60) && (sz[i][1] <= 90))
			{
				lx[k]++;
			}
			else
			{
				k++;
			}

		}
		for (j = 0;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (lx[i] < lx[i + 1])
				{
					t = lx[i];
					lx[i] = lx[i + 1];
					lx[i + 1] = t;
				}
			}
		}



		System.out.printf("%d",lx[0]);




		return 0;
	}





}

