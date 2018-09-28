package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] S = new int[100][2];
		int n;
		int i;
		int j;
		int k;
		int K;
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
				S[i][j] = Integer.parseInt(tempVar2);
			}
			}
		}
			k = 0;
			K = 0;
			for (i = 0;i < n;i++)
			{
				if ((90 <= S[i][0]) && (S[i][0] <= 140) && (60 <= S[i][1]) && (S[i][1] <= 90))
				{
					k++;
				}
				else
				{
					if (k > K)
					{
						K = k;
						k = 0;
					}
					else
					{
						k = 0;
					}
				}
			}
			if (k > K)
			{
				K = k;
			}
			System.out.printf("%d",K);
			return 0;
	}
}

