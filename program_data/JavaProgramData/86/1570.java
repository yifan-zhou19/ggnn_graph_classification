package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int n;
		int[] tiaohuai = new int[100];
		int[] sum = new int[100];
		int i;
		int k;
		int j;
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
				tiaohuai[i] = Integer.parseInt(tempVar2);
			}
			if (tiaohuai[i] == 0)
			{
				continue;
			}
			for (k = 0;k < tiaohuai[i];k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (tiaohuai[i] == 0)
			{
				sum[i] = 60;
				continue;
			}
			for (k = 0;k < tiaohuai[i];k++)
			{
				j = sz[i][k] + 3 * k;
				if (j > 60)
				{
					if (sz[i][k - 1] + 3 * k >= 60)
					{
						sum[i] = sz[i][k - 1];
						break;
					}
					else
					{
						sum[i] = 60 - 3 * k;
						break;
					}
				}
			}
			if (sum[i] == 0)
			{
				if (j + 3 <= 60)
				{
					sum[i] = 60 - tiaohuai[i] * 3;
				}
				else
				{
					sum[i] = sz[i][k - 1];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

