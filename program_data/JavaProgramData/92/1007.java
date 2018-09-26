package <missing>;

public class GlobalMembers
{
	public static void Sort(int[] sz, int n)
	{
		int e;
		int k;
		int i;
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz[i] < sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int t;
		int k;
		int m;
		int n;
		int sum;
		int[] king = new int[1000];
		int[] tian = new int[1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(tian + i) = tempVar2;
				}
			}

			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(king + i) = tempVar3;
				}
			}

			Sort(tian, n);
			Sort(king, n);

			sum = 0;
			t = 0;
			k = 0;

			for (m = 0;m < n;m++)
			{
				if (tian[t] > king[k])
				{
					sum += 200;
					t++;
					k++;
				}
				else if (tian[t] < king[k])
				{
					sum -= 200;
					k++;
				}
				else
				{
					for (j = k - t + 1;j < n - t + 1;j++)
					{
						if (tian[n - j] <= king[n + k - t - j] != 0 && tian[n - j] < king[k])
						{
							sum -= 200;
							t--;
							break;
						}
					}
					t++;
					k++;
				}
			}
			System.out.printf("%d\n", sum);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}

		return 0;
	}
}

