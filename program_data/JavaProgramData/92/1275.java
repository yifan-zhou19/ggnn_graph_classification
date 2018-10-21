package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			int i;
			int n;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			int[] t = new int[1000];
			int[] q = new int[1000];
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				for (int j = i + 1;j < n;j++)
				{
					if (t[j] > t[i])
					{
						int temp = t[j];
						t[j] = t[i];
						t[i] = temp;
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (int j = i + 1;j < n;j++)
				{
					if (q[j] > q[i])
					{
						int temp = q[j];
						q[j] = q[i];
						q[i] = temp;
					}
				}
			}
			int i1 = n - 1;
			int i2 = n - 1;
			int j1 = 0;
			int j2 = 0;
			int win = 0;
			int lose = 0;
			while (i1 >= j1 != 0 && i2 >= j2)
			{
				if (t[i1] > q[i2])
				{
					win++;
					i1--;
					i2--;
					continue;
				}
				if (t[i1] < q[i2])
				{
					lose++;
					i1--;
					j2++;
					continue;
				}
				if (t[i1] == q[i2])
				{
					if (t[j1] > q[j2])
					{
						win++;
						j1++;
						j2++;
						continue;
					}
					if (t[i1] < q[j2])
					{
						lose++;
						i1--;
						j2++;
						continue;
					}
					else
					{
						break;
					}
				}
			}
			System.out.printf("%d\n",(win - lose) * 200);
		}
	}
}

