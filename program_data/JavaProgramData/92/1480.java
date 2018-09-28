package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int[] vTian = new int[1000];
		int[] vQi = new int[1000];
		int cnt;
		int t;
		while (scanf("%d", n), n)
		{
			cnt = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					vTian[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					vQi[i] = Integer.parseInt(tempVar2);
				}
			}

			for (i = n - 1;i >= 0;i--)
			{
				for (j = 0;j < i;j++)
				{
					if (vTian[j] > vTian[j + 1])
					{
						t = vTian[j];
						vTian[j] = vTian[j + 1];
						vTian[j + 1] = t;
					}
					if (vQi[j] > vQi[j + 1])
					{
						t = vQi[j];
						vQi[j] = vQi[j + 1];
						vQi[j + 1] = t;
					}
				}
			}

			x = y = n - 1;
			i = j = 0;
			while (i <= x)
			{
				if (vTian[x] > vQi[y])
				{
					x--;
					y--;
					cnt += 200;
				}
				else if (vTian[i] > vQi[j])
				{
					i++;
					j++;
					cnt += 200;
				}
				else
				{
					if (vTian[i] < vQi[y])
					{
						cnt -= 200;
					}
					i++;
					y--;
				}
			}
			System.out.printf("%d\n",cnt);
		}
		return 0;
	}
}

