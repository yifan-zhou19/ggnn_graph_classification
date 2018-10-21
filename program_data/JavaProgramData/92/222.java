package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int tl;
		int ql;
		int m;
		int n;
		int ans;
		int[] tian = new int[1100];
		int[] qi = new int[1100];

		while (scanf("%d", n) && n != 0)
		{
			ans = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tian[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qi[i] = Integer.parseInt(tempVar2);
				}
			}

			sort(tian,tian + n);
			sort(qi,qi + n);
			i = n - 1;
			j = n - 1;
			tl = 0;
			ql = 0;
			while (i >= tl != 0 && j >= ql)
			{

				if (tian[i] > qi[j])
				{
					ans++;
					i--;
					j--;
				}
				else if (tian[i] < qi[j])
				{
					ans--;
					tl++;
					j--;
				}
				else
				{
					if (tian[tl] <= qi[ql])
					{
						if (tian[tl] < qi[j])
						{
							ans--;
						}
						tl++;
						j--;
					}
					else
					{
						while (tian[tl] > qi[ql] && tl <= i != 0 && ql <= j)
						{
							tl++;
							ql++;
							ans++;
						}
						if (tl > i || ql > j)
						{
							break;
						}
					}
				}
			}
			System.out.printf("%d\n",ans * 200);
		}
	}
}

